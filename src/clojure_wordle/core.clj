(ns clojure-wordle.core
  (:gen-class)
  (:require [clojure.data :as data]
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

(defn score
  "Scores guess word. Returns result each charactor.
  guess: str vector []
  secret: str vector []
  return: map {:str: str, :just bool, :nealry bool}
  "
  [guess secret]
  (let [just (map #(= % %2) guess secret)
        nearly (map #(and (false? %) (true? %2))
                    just
                    (map #(some (partial = %) secret) guess))]
    (map #(array-map :str %1 :just %2 :nearly %3)
         guess just nearly)))

(defn word-valid?
  "Validate word
  word: string
  words: string[]
  "
  [word words]
  (some (partial = word) words))

(defn game-cli []
  (println "Welcome clojure-wordle. Please input 5 charactor.")
  (let [secret (rand-nth w/words)
        i (atom 0)]
    (while (< @i 6)
      (print (format "try[%d] > " @i))
      (flush)
      (let [line (read-line)]
        (cond
          (< (count line) 5) (println "Inputs must 5 charactor. Please retry.")
          (not (word-valid? (str/join (take 5 line)) w/words)) (println "Invalid word. Please retry.")
          :else
          (do
            (dorun
             (map
              #(do
                 (cond 
                   (:just %) (print (format "%s%s%s" (:red console-fg-color) (:str %) (:reset console-fg-color)))
                   (:nearly %) (print (format "%s%s%s" (:blue console-fg-color) (:str %) (:reset console-fg-color)))
                   :else (print (format "%s" (:str %)))))
              (score (str/split (str/join (take 5 line)) #"")
                     (str/split secret #""))))
            (println)
            (if (= (str/join (take 5 line)) secret)
                (swap! i 6)
                (swap! i inc))
            ))))
    (println secret)
    ))

(defn keyword-seq-to-string
  "Convert [:w :o :r :d] => \"word\""
  [seq]
  (str/join (map #(name %) seq)))

(defn string-to-keyword-seq
  "Convert \"word\" => [:w :o :r :d]"
  [str]
  (map #(keyword %) (str/split str #"")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (game-cli))
