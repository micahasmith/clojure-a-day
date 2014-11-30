;;
;; vectors
;;

;; vectors allow access to all items, not just head/rest

;; make a vector
(vector 1 2 3)

;; make a vector with brackets
[1 2 3]

;; make a vector from a list
(vec '(1 2 3))

;;
;; getting values
;;


;; rest and first work here as well
(first [1 2 3]) ;; returns 1
(rest [1 2 3]) ;; returns (2 3) -- a list!

;; get the item at index x
;; get complexity is log32n
(get [1 2 3] 0) ;; returns 1
([1 2 3] 0) ;; returns 1


;;
;; modification
;;

(cons 0 [1 2 3]) ;; returns (0 1 2 3) -- a list!
(conj [1 2 3] 4) ;; returns [1 2 3 4]

;; adding to the front of a vector is O(n) operation
;; so maybe consider a list for that?
(into [0] [1 2 3]) ;; returns [0 1 2 3]

;; replace an element at index n
(assoc [1 2 3] 1 9) ;; returns [1 9 3]

;; get rid of the last element
(pop [1 2 3]) ;; returns [1 2]

;; get new vector from index (inclusive) to index (exclusive)
(subvec [1 2 3] 1 3) ;; returns [2 3]

;; get new vector via plucking elements at indexes [indexes]
(replace [1 2 3] [0 1]) ;; returns [1 2]

;; reverse
(rseq [1 2 3]) ;; returns (3 2 1) -- a list!



;;
;; special functions
;;


;; are all values distinct?
(distinct? [1 2 3]) ;; returns true
