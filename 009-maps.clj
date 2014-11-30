;;
;; map
;;

;; make a map
(hash-map :key "value" )

;; make a map with curly brackets
{:key "value"}

;; nested map
{:key {:sub-key "value"}}

;;
;; access
;;

;; get a key's value
(get {:key "val"} :key) ;; returns "val"

;; get a non-existing key/value
(get {:key "val"} :missing-key) ;; returns nil

;; another means to get a key's value
({:key "val"} :key) ;; returns "val"

;; get the keys of the map
(keys {:key1 "val1" :key2 "val2"}) ;; returns (:key1 :key2)

;; get the values of the map
(vals {:key1 "val1" :key2 "val2"}) ;; returns ("val1" "val2")

;;
;; modification
;;

;; use assoc to "upsert" values in a map
(assoc {:key "val1"} :key "val2") ;; returns {:key "val2"}

;; use dissoc to remove entries in a map
(dissoc {:key1 "val1" :key2 "val2"} :key2) ;; returns {:key1 "val1"}

;; use assoc-in to update a map/sub-section of a map
;; this returns {:key1 {:sub-key1 "val2"}}
(assoc-in {:key1 {:sub-key1 "sval1"}} [:key1 :sub-key1] "val2")

;; use update-in to update a map/sub-section of a map via a function application
;; this returns {:key1 {:sub-key1 "SVAL1"}}
(update-in {:key1 {:sub-key1 "sval1"}} [:key1 :sub-key1] clojure.string/upper-case)


