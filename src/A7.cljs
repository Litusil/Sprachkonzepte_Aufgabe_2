(ns A7)

(defn eliminate [n lst](
                         if(list? (first lst) )
                           (conj (eliminate n (rest lst))(eliminate n (first lst)))
                         (if (> (count lst) 0)
                               (if(= (first lst) n)
                                  (eliminate n (rest lst))
                                  (conj (eliminate n (rest lst)) (first lst))
                                  )
                             ()
                             )))


(println (eliminate 1 '(1 3 (3 1 2) (1 2) (1)))
         )