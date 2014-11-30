;;
;; shared functions
;;


;; make some test variables
(def my-list '(1 2 3))
(def my-vector [1 2 3])
(def my-map {:key "value"})
(def my-set #{1 2 3})

;; count -- get number of items
;; count complexity os O(1) across all
(count my-list) ;; returns 3
(count my-vector) ;; returns 3
(count my-map) ;; returns 1
(count my-set) ;; returns 3

;; into conj-s the items one at a time
(into my-list '(0)) ;; (0 1 2 3)
(into my-vector [4]) ;; [1 2 3 4]
(into my-map {:key2 "value2"})
(into my-map ([:key2 "value2"]))



;; cons
(cons 0 my-list) ;; returns (0 1 2 3)
(cons 0 my-vector) ;; returns (0 1 2 3) -- a list!
(cons 0 my-map) ;; returns (0 [:key "value"]) -- no idea why
(cons 0 my-set) ;; returns (0 1 2 3) -- a list!


;; conj
;; conj stands for "conjoin"
(conj my-list 0) ;; returns (0 1 2 3)
(conj my-vector 4) ;; returns [1 2 3 4]
(conj my-map {:key2 "value2"}) ;; returns {:key2 "value2", :key "value"}
(conj my-set 0) ;; returns #{0 1 2 3}
