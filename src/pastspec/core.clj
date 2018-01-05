(ns pastspec.core
  (:gen-class)
  (:require [instaparse.core :as insta]))

(def pastbnf
  (insta/parser
    (slurp "past.bnf")))

(defn -main
  [arg & args]
  (println (pastbnf arg)))
