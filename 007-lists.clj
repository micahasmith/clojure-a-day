;;
;; lists
;;

;; as with most functional lang lists,
;; a list consists of a single head item, and the rest of the list

;; make a list
(list 1 2 3)

;; make a list via quoting
'( 1 2 3)

;; make a list from another list
(list* 1 2 '(3 4)) ;; returns (1 2 3 4)

(def a-list '(1 2 3))


;; function to get an element at index X in a list
(defn list-get [li index]
  (loop [iter index
         the-list li]
    (cond

     ;; if the list is at this point empty, return nil
     (empty? the-list)
       nil

     ;; if the list is at this point zero, return the first element
     (zero? iter)
       (first the-list)

     ;; else recurse deeper into the rest of the list
     :else
        (recur (dec iter) (rest the-list) ))))

(list-get '(1 2 3) 1) ;; returns 2

;; special list functions
(first a-list) ;; returns 1
(rest a-list) ;; returns (2 3)
(next a-list) ;; returns (2 3)

;; peek and pop on empty lists throw exceptions, FYI
(def a-list '(1 2 3))
(peek a-list) ;; returns 1
(pop a-list) ;; returns (2 3)

;; rest and first on empty lists stay classy
(def empty-list '())
(rest empty-list) ;; returns ()
(first empty-list) ;; returns nil


;; lists are peristent, immutable
(def list1 '(1 2 3))

;; cons adds an element to the front of a list
;; and returns a new list
(def list2 (cons 0 list1))

list1 ;; it's (1 2 3)
list2 ;; it's (0 1 2 3)

;; are all elements distinct?
(distinct? list1) ;; true


;; all code is lists
(first '(defn hi [] (prn "hi")))


















