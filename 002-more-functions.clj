(
;; first we have the function
  (fn [name]
    (str "hello " name))
    ;; here we pass in the first argument
    "micah"
  ) ;; returns "hello micah"



(
   ;; here is the entire function!
   #(str "hello " %)
   ;; here is the arg1 to the function
   "micah"
 )


(
   ;; here is the entire function!
   #(str "hello " %1 " " %2)
   ;; here is the arg1 to the function
   "micah" "smith"
 )