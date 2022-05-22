(ns clojure-wordle.core-test
  (:require [clojure.test :refer :all]
            [clojure-wordle.core :refer :all]))

(deftest main-test
  (testing "Test main."
    (is (= nil (-main)))))
