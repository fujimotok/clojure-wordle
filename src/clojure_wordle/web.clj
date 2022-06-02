(ns clojure-wordle.web
  (:require [ring.adapter.jetty :as server] ;; webサーバに必要
            [ring.util.response :as res] ;; handlerで定型のレスポンス返すときに使用
            [ring.middleware.keyword-params :as keyword-params] ;; パラメータ受け取りやすくするミドルウェア
            [ring.middleware.params :as params] ;; パラメータ受け取りやすくするミドルウェア
            [ring.middleware.flash :as flash] ;; Railsのflashのような機能を実現のためのミドルウェア
            [ring.middleware.session :as session] ;; Railsのflashのような機能を実現のためのミドルウェア
            [ring.middleware.resource :as resource] ;; リソースを参照するためのミドルウェア
            [compojure.core :refer [routes defroutes GET POST]] ;; ルーター
            [compojure.route :as route] ;; デフォルトルートの定義
            [hiccup.page :refer [html5 include-css]] ;; テンプレートエンジン
            [hiccup.form :as hf]
            [clojure.string :as str]
            [clojure-wordle.words :as w]
            [clojure-wordle.wordle :as wordle]))

(defonce history (atom '[]))
(defonce valid-keys (atom '[]))
(defonce secret (atom nil))
(defonce win (atom false))
(defonce keyboard '[[\q \w \e \r \t \y \u \i \o \p] [\space \a \s \d \f \g \h \j \k \l] [\space \space \z \x \c \v \b \n \m]])

(defn game-continue?
  []
  (and (< (count @history) 6) (not @win)))

;; root web page.
(defn root-view [req]
  (html5
   [:head
    [:title "Clojure-Wordle"]
    (include-css "/css/style.css")]
   [:body
    [:header "Clojure-Wordle"]
    ;; form erea
    (hf/form-to
     [:post "/"]
     [:input {:name :guess :maxlength 5 :minlength 5 :required true :placeholder "input 5 charactor"}]
     [:button (if (not (game-continue?) ) '{:disabled true}) "send"])

    ;; message erea
    (when-let [{:keys [msg]} (:flash req)] ;; リクエストマップに :flash があればそれをアラートとして表示される
      [:div.alart [:strong msg]])
    (when @win
      [:div [:strong "You Win !!"]])
    (when (and (not @win) (<= 6 (count @history)))
      [:div [:strong "You Lose !! The answer is " @secret]])

    ;; history
    [:div
     (for [h @history]
       [:div 
        (for [m h]
          (cond
            (:nearly m) [:div.wordbox.nearly (:char m)]
            (:just m) [:div.wordbox.just (:char m)]
            :else [:div.wordbox (:char m)]))
        ])]
    ;; keyboard
    [:div {:style "margin-top:20px;"}
     (for [l keyboard]
       [:div
        (for [m (for [c l]
                  (first (filter #(= (:char %) c) @valid-keys)))]
          (cond
            (:used m) [:div.wordbox.used (:char m)]
            (:nearly m) [:div.wordbox.nearly (:char m)]
            (:just m) [:div.wordbox.just (:char m)]
            (:char m) [:div.wordbox (:char m)]
            :else [:div.spacer (:char m)]))
        ])]
    ]))

(defn root [req]
  (-> (root-view req)
      (res/response)
      (res/content-type "text/html; charset=utf-8")))
;; root web page end.

;; judge web page.
(defn judge-method [res req]
  (if (not (wordle/word-valid? (:guess (:params req)) w/words))
    (assoc res :flash {:msg "Invalid word"})
    (do
      (swap! history conj (wordle/score (:guess (:params req)) @secret))
      (reset! valid-keys (wordle/available-keys @history))
      (if (= (:guess (:params req)) @secret)
        (reset! win true))
      res)))

(defn judge [req]
  (if (game-continue?)
    (-> (res/redirect "/")
        (judge-method req)
        (res/content-type "text/html; charset=utf-8"))
    (-> (res/redirect "/")
        (res/content-type "text/html; charset=utf-8"))))
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
      (flash/wrap-flash)
      (session/wrap-session)
      ))
;; router & middleware end.

;; web server operation.
(defonce server (atom nil))

(defn start-server []
  (when-not @server
    (reset! server (server/run-jetty #'app {:port 3000 :join? false})))
  (reset! history '[])
  (reset! valid-keys (doall (wordle/available-keys @history)))
  (reset! win false)
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
