;;
;; let binding
;;

(defn greet
   [name]
   ;; create a variable
   ;; to hold part of the greeting
   (let [greeting "hi "]
     (str greeting name)
     )
   )

(greet "micah") ;; returns "hi micah"

;; here we try to use the greeting variable again
;; this throws a big ol' error
(str greeting "micah")

;;
;; "vars"
;;

;; define a variable with def
(def myname "micah")
(str "hi " myname) ;; "hi micah"

;; since vars are mutable, we can reassign to them
(def myname "jenna")
(str "hi " myname) ;; "hi jenna"


;;
;; Dynamic "vars"
;;

;; define our dynamic var
;; using the recommended *[name]* style
(def ^:dynamic *name* "micah")
(str "hi " *name*) ;; "hi micah"

;; a function that specifically prints
;; our dynamic variable
(defn say-hi
  []
  (str "hi " *name*)
  )

;; we set the value of *name* to "billybob"
;; JUST for the function say-hi
(binding [*name* "billybob"] (say-hi)) ;; returns "hi billybob"

;; `eval` evaluates a variable
(eval *name*) ;; returns "micah"


;;
;; Atoms
;;

;; create an atom
(def a-name (atom "micah"))

;; get the value from the a-name atom
;; via the `deref` function
(deref a-name)

;; set the value to jenna
(reset! a-name "jenna") ;; returns "jenna"

;; set the value to name + firstname
;; via a function that does it in a coordinated manner
(swap! a-name #(str % " " "smith")) ;; returns "jenna smith"

;;
;; Refs
;;

;; create two refs
(def micah-name (ref "micah"))
(def jenna-name (ref "jenna"))

;; update both names transactionally
(dosync
  (ref-set micah-name "micah smith")
  (ref-set jenna-name "jenna smith"))

(deref micah-name) ;; returns "micah smith"

;; using ensure
(def mname (ref "micah"))
(def jname (ref "jenna"))
(def family (ref "smith"))

;; function to uppercase things
(def up-it clojure.string/capitalize)
(up-it "micah")

(dosync
 (alter mname up-it)
 (alter jname up-it)
 (alter family #(str (ensure mname) " and " (ensure jname) " " (up-it %))))

(deref family) ;; returns "Micah and Jenna Smith"

;;
;; Agents
;;

;; create an agent
(def my-agent (agent 0))

;; "queue" functions into agent, asynchronously
;; here we queue adding 1 to it
(send my-agent #(+ % 1))

;; block the thread until all fns are evaluated
;; on the agent
(await my-agent) ;; just blocks, returns nil

;; get the value of the agent
(deref my-agent) ;; returns 1


