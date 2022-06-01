(ns clojure-wordle.cli
  (:gen-class)
  (:require [clojure-wordle.wordle :as wordle]
            [clojure.string :as str]
            [clojure-wordle.words :as w]))

;; CLI print functions
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
  "Print char enclose color controll char."
  [c]
   (cond 
     (:just c) (print (format "%s%s%s" (:red console-fg-color) (:char c) (:reset console-fg-color)))
     (:nearly c) (print (format "%s%s%s" (:yellow console-fg-color) (:char c) (:reset console-fg-color)))
     (:used c) (print (format "%s%s%s" (:blue console-fg-color) (:char c) (:reset console-fg-color)))
     :else (print (format "%s" (:char c)))))
        
(defn print-keyboard
  "Print valid keys which formated by keyboard order."
  [valid-keys]
  (let [print-seq
        (fn [seq]
          (dorun (for [c seq]
                   (print-with-color
                    (first (filter #(= (:char %) c) valid-keys))))))]
    (print-seq '[\q \w \e \r \t \y \u \i \o \p])
    (println)
    (print " ")
    (print-seq '[\a \s \d \f \g \h \j \k \l])
    (println)
    (print "  ")
    (print-seq '[\z \x \c \v \b \n \m])
    (println)
    ))

(defn print-history
  "Print history which colord by judgement"
  [history]
  (let [print-seq
        (fn [seq]
          (dorun (for [c seq]
                   (print-with-color c))))]
    (dorun
     (map #(do (print-seq %)
               (println))
          history))
    ))
;; End CLI print functions

;; Game states and flow controlls.
(defonce history (atom '[]))
(defonce valid-keys (atom '[]))
(defonce secret (atom nil))
(defonce win (atom false))

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
      (print-keyboard @valid-keys)
      (println)
      (print-history @history)
      (if (= line @secret)
        (do
          (reset! win true)
          (println "You Win !!")))
      )))

(defn game-continue?
  "Judgment whether to continue the game."
  []
  (and (< (count @history) 6) (not @win)))

(defn game-cli
  "Game entry point."
  []
  (reset! history '[])
  (reset! valid-keys '[])
  (reset! secret (rand-nth w/words))

  (println "Welcome clojure-wordle.")
  (println "Please input 5 charactor.")
  (println "Just=Red Nearly=Yellow Used=Blue")

  (while (game-continue?)
    (print (format "try[%d] > " (inc (count @history))))
    (flush)
    (judge (read-line)))

  (if (not @win) (println "You Lose !!"))
  (println "The answer is" @secret))
;; End Game states and flow controlls.
