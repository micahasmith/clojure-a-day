(defn say-hello
  ;; the following is documentation for the function
  "say-hello takes a name and returns a friendly greeting"
  ;; the following means that the function takes a single parameter called "name"
  ;; the brackets [] designate that parameters form a vector--
  ;;    [1 2 3] is an example vector containing those elements
  [name]
    ;; str is a function that concatenates strings
    (str "hello " name)
  )

(say-hello "micah") ;; returns "hello micah"

;; arity example

(defn say-hello2
  ;; the following is documentation for the function
  "say-hello takes a name and returns a friendly greeting"

    ;; the first way to call say-hello is with one param
    ([name]
      (str "hello " name)
     )

    ;; the second way to call say-hello is with two params
    ([firstName lastName]
      (str "hello " firstName " " lastName)
    )
  )

(say-hello2 "micah") ;; returns "hello micah"
(say-hello2 "micah" "smith") ;; returns "hello micah smith"
