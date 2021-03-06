(filter even? (range 10))
;; => (0 2 4 6 8)

(filter (fn [x]
          (= (count x) 1))
        ["a" "aa" "b" "n" "f" "lisp" "clojure" "q" ""])
;; => ("a" "b" "n" "f" "q")

(filter #(= (count %) 1)
        ["a" "aa" "b" "n" "f" "lisp" "clojure" "q" ""])
;; => ("a" "b" "n" "f" "q")

                                        ; When coll is a map, pred is called with key/value
                                        ; pairs.
(filter #(> (second %) 100)
        {:a 1
         :b 2
         :c 101
         :d 102
         :e -1})
;; => ([:c 101] [:d 102])

(into {} *1)
;; => {:c 101, :d 102}
