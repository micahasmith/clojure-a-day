;; example if/then/else
(defn greeting
  [name]
  (if (= name "jenna")
    ;; if true do this
    (str "hello " name)
    ;; if false do this
    (str "hi " name)
    )
  )

(greeting "micah") ;; outputs "hello jenna"
(greeting "jenna") ;; outputs "hi micah"


;; don't put anything after an if
(defn greeting2
  [name]
  (if (= name "jenna")
    ;; if true do this
    (str "hello " name)
    ;; if false do this
    (str "hi " name)
    )
  ;; function directly following an if
  ;; sorry is always returned
  (str "sorry")
  )

(greeting2 "micah") ;; outputs "sorry"
(greeting2 "jenna") ;; outputs "sorry"

;; example of if-not
(defn greeting3
    [isEvening]
  (if-not isEvening
    "good morning!"
    "good night!"
    )
  )

(greeting3 true) ;; outputs "good night!"
(greeting3 false) ;; outputs "good morning!"

;; example of when
(defn greeting4
  [name]
  (when (= name "micah")
    (str "its micah!")
    )
  )

(greeting4 "micah") ;; returns "its micah!"
(greeting4 "jenna") ;; returns nil

;; example of cond-- clojure's "else if"
(defn greeting5
  [name]
  (cond
   (= name "micah") "hello micah!"
   (= name "jenna") "hi jenna!"
   :else (str "nice to meet you, " name "!")
   )
  )

(greeting5 "micah") ;; returns "hello micah!"
(greeting5 "jenna") ;; returns "hi jenna!"
(greeting5 "john") ;; returns "nice to meet you, john!"

;; example of condp-- clojure's "else if"
(defn greeting6
  [name]
  (condp = name
   "micah" "hello micah!"
   "jenna" "hi jenna!"
    true ::> (str "nice to meet you, " name "!")
   )
  )

(greeting6 "micah") ;; returns "hello micah!"
(greeting6 "jenna") ;; returns "hi jenna!"
(greeting6 "john") ;; returns "nice to meet you, john!"