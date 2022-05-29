(ns clojure-wordle.web
  (:require [ring.adapter.jetty :as server] ;; webサーバに必要
            [ring.util.response :as res] ;; handlerで定型のレスポンス返すときに使用
            [ring.middleware.keyword-params :as keyword-params] ;; パラメータ受け取りやすくするミドルウェア
            [ring.middleware.params :as params] ;; パラメータ受け取りやすくするミドルウェア
            [compojure.core :refer [routes defroutes GET POST]] ;; ルーター
            [hiccup.page :refer [html5]] ;; テンプレートエンジン
            [hiccup.form :as hf]
            [clojure-wordle.wordle :as wordle]))

(defonce history (atom '[]))

;; root web page.
(defn root-view [req]
  (html5
   [:head [:title "Clojure-Wordle"]]
   [:body
    [:header "Clojure-Wordle"]    
    (hf/form-to
     [:post "/"]
     [:input {:name :guess :maxlength 5 :minlength 5 :required true :placeholder "input 5 charactor"}]
     [:button "send"])
    [:ul (for [x @history]
                  [:li x])]
    ]))

(defn root [req]
  (-> (root-view req)
      (res/response)
      (res/content-type "text/html; charset=utf-8")))
;; root web page end.

;; judge web page.
(defn judge-method [{:as req :keys [params]}]
  (swap! history conj (:guess params)))

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
      (keyword-params/wrap-keyword-params)
      (params/wrap-params)))
;; router & middleware end.

;; web server operation.
(defonce server (atom nil))

(defn start-server []
  (when-not @server
    (reset! server (server/run-jetty #'app {:port 3000 :join? false}))))

(defn stop-server []
  (when @server
    (.stop @server)
    (reset! server nil)))

(defn restart-server []
  (when @server
    (stop-server)
    (start-server)))
;; web server operation end.
