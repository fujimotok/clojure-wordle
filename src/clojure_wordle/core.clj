(ns clojure-wordle.core
  (:gen-class)
  (:require [clojure-wordle.cli :as cli]
            [clojure-wordle.web :as web]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (cond
    (= "web" (first args)) (web/start-server)
    :else (cli/game-cli)))
    
