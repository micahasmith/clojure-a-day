;;
;; error handling
;;

(defn throw-err []
  ;; start our "try block"
  (try
    ;; what's 5 divided by zero again?
    (/ 5 0)

    ;; output the what the error is
    (catch Exception e (str "exception was " (.getMessage e)))

    ;; no matter what, let's end by printing "oh well"
    (finally prn "oh well")))

(throw-err) ;; outputs "exception was Divide by zero"

