(ns clojure-wordle.wordle
  (:gen-class))

(defn score
  "Scores guess word. Returns result each charactor.
  guess: str
  secret: str
  return: map list ({:char char, :just bool, :nealry bool} ..)
  "
  [guess secret]
  (let [just (map #(= % %2) guess secret)
        nearly (map #(and (false? %) (true? %2))
                    just
                    (map #(some (partial = %) secret) guess))]
    (map #(array-map :char %1 :just %2 :nearly %3)
         guess just nearly)))

(defn word-valid?
  "Validate word
  word: string
  words: string[]
  "
  [word words]
  (some (partial = word) words))

(defn available-keys
  "Returns available keys
  history: array-array-map ([{:char char, :just bool, :nealry bool} ..] ..)
  return: map list ({:char char, :just bool, :nealry bool} ..)
  "
  [history]
  (let [hist (set (flatten history))
        keys (map char (range (int \a) (inc (int \z))))]
    (println hist)
    (map #(cond
            (and (find hist :char)) (array-map :char % :just true :nearly false :used false)
            (some :nearly (hist %)) (array-map :char % :just false :nearly true :used false)
            (some :char (hist %)) (array-map :char % :just true :nearly false :used true)
            :else  (array-map :char % :just false :nearly false :used false))
         keys)))
