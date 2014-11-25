;;
;; loop/recur
;;

(defn zero-to-nine
  []
  ;; start the loop
  (loop
    ;; set the initial state of the loop
    ;; to one variable--
    ;; x having a value of 0
    [x 0]

    ;; continue while x < 10
    (when (< x 10)
      ;; print out x
      (prn x)
      ;; loop, assigning x to a new value of x+1
      (recur (+ x 1)))))

(zero-to-nine)

;;
;; dotimes
;;

(defn zero-to-nine-2
  []
  ;; "do x times"
  (dotimes [x 10]
    (prn x)))

(zero-to-nine-2)

;;
;; while
;;

(def iter (atom 0))
(defn zero-to-nine-3
  []
  (while (< @iter 10)
    (prn @iter)
    (swap! iter inc)))

(zero-to-nine-3)
