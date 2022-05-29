(ns clojure-wordle.core
  (:gen-class)
  (:require [clojure-wordle.cli :as cli]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (cli/game-cli))
