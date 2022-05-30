(ns clojure-wordle.web
  (:require [ring.adapter.jetty :as server] ;; webサーバに必要
            [ring.util.response :as res] ;; handlerで定型のレスポンス返すときに使用
            [ring.middleware.keyword-params :as keyword-params] ;; パラメータ受け取りやすくするミドルウェア
            [ring.middleware.params :as params] ;; パラメータ受け取りやすくするミドルウェア
            [ring.middleware.resource :as resource] ;; リソースを参照するためのミドルウェア
            [compojure.core :refer [routes defroutes GET POST]] ;; ルーター
            [compojure.route :as route] ;; デフォルトルートの定義
            [hiccup.page :refer [html5 include-css]] ;; テンプレートエンジン
            [hiccup.form :as hf]
            [clojure.string :as str]
            [clojure-wordle.words :as w]
            [clojure-wordle.wordle :as wordle]))

(defonce history (atom '[]))
(defonce secret (atom nil))

;; root web page.
(defn root-view [req]
  (html5
   [:head
    [:title "Clojure-Wordle"]
    (include-css "/css/style.css")]
   [:body
    [:header "Clojure-Wordle"]    
    (hf/form-to
     [:post "/"]
     [:input {:name :guess :maxlength 5 :minlength 5 :required true :placeholder "input 5 charactor"}]
     [:button "send"])
    [:div
     (for [h @history]
       [:div 
        (for [m h]
          (cond
            (:nearly m) [:div.wordbox.nearly (:char m)]
            (:just m) [:div.wordbox.just (:char m)]
            :else [:div.wordbox (:char m)]))
        ])]
    ]))

(defn root [req]
  (-> (root-view req)
      (res/response)
      (res/content-type "text/html; charset=utf-8")))
;; root web page end.

;; judge web page.
(defn judge-method [{:as req :keys [params]}]
  (swap! history conj (wordle/score (:guess params) @secret)))

(defn judge [req]
  (judge-method req)
  (-> (res/redirect "/")
      (res/content-type "text/html; charset=utf-8")))
;; judge web page end.

;; router & middleware
(defroutes route
  (GET "/" req root)
  (POST "/" req judge)
  ;;(POST "/reset" _ reset)
  (route/not-found "<h1>Not found</h1>"))

(def app
  (-> (routes route)
      (resource/wrap-resource "public")
      (keyword-params/wrap-keyword-params)
      (params/wrap-params)
      ))
;; router & middleware end.

;; web server operation.
(defonce server (atom nil))

(defn start-server []
  (when-not @server
    (reset! server (server/run-jetty #'app {:port 3000 :join? false})))
  (reset! history '[])
  (reset! secret (rand-nth w/words)))

(defn stop-server []
  (when @server
    (.stop @server)
    (reset! server nil)))

(defn restart-server []
  (when @server
    (stop-server)
    (start-server)))
;; web server operation end.
