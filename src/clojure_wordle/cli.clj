(ns clojure-wordle.cli
  (:gen-class)
  (:require [clojure-wordle.wordle :as wordle]
            [clojure.string :as str]
            [clojure-wordle.words :as w]))

(def console-fg-color
  {
   :black   "\u001b[30m"
   :red     "\u001b[31m"
   :green   "\u001b[32m"
   :yellow  "\u001b[33m"
   :blue    "\u001b[34m"
   :magenta "\u001b[35m"
   :cyan    "\u001b[36m"
   :white   "\u001b[37m"
   :reset   "\u001b[0m"
 })

(def console-bg-color
  {
   :black   "\u001b[40m"
   :red     "\u001b[41m"
   :green   "\u001b[42m"
   :yellow  "\u001b[43m"
   :blue    "\u001b[44m"
   :magenta "\u001b[45m"
   :cyan    "\u001b[46m"
   :white   "\u001b[47m"
   :reset   "\u001b[49m"
 })

(defn print-with-color
  [coll]
  (dorun
   (map #(cond 
           (:just %) (print (format "%s%s%s" (:red console-fg-color) (:char %) (:reset console-fg-color)))
           (:nearly %) (print (format "%s%s%s" (:yellow console-fg-color) (:char %) (:reset console-fg-color)))
           (:used %) (print (format "%s%s%s" (:blue console-fg-color) (:char %) (:reset console-fg-color)))
           :else (print (format "%s" (:char %))))
        coll)))

(defonce history (atom '[]))
(defonce valid-keys (atom '[]))
(defonce secret (atom nil))

(defn print-keyboard []
  (print-with-color
    (for [c '[\q \w \e \r \t \y \u \i \o \p]]
     (filter #(= (:char %) c) @valid-keys)))
  (println)
  (print-with-color
   (for [c '[\a \s \d \f \g \h \j \k \l]]
     (filter #(= (:char %) c) @valid-keys)))
  (println)
  (print-with-color
   (for [c '[\z \x \c \v \b \n \m]]
     (filter #(= (:char %) c) @valid-keys)))
  (println))

(defn judge
  "Jugde line input."
  [line]
  (cond
    (< (count line) 5) (println "Inputs must 5 charactor. Please retry.")
    (not (wordle/word-valid? (str/join (take 5 line)) w/words)) (println "Invalid word. Please retry.")
    :else
    (do
      (swap! history conj (wordle/score (str/join (take 5 line)) @secret))
      (reset! valid-keys (wordle/available-keys @history))
      (print-with-color @valid-keys)
      (println)
      (print-with-color (last @history))
      (println))))

(defn game-cli []
  (reset! history '[])
  (reset! valid-keys '[])
  (reset! secret (rand-nth w/words))
  (println "Welcome clojure-wordle. Please input 5 charactor. just=red nearly=yellow used=blue")
    (while (< (count @history) 6)
      (print (format "try[%d] > " (count @history)))
      (flush)
      (judge (read-line)))
    (println "The answer is" @secret))
