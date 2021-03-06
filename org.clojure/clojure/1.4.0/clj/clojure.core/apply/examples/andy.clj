(apply + [1 2])           ; same as (+ 1 2)
;; => 3

(apply + 1 2 [3 4 5 6])   ; same as (+ 1 2 3 4 5 6)
;; => 21

(apply + [])              ; same as (+)
;; => 0

;; This doesn't work because and is a macro, not a function
(apply and [true false true])
;; => CompilerException java.lang.RuntimeException: Can't take value of a macro: #'clojure.core/and, compiling:(NO_SOURCE_PATH:1:1)
