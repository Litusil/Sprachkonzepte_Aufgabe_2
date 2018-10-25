(ns A5)

(defn rev [l](
               if(> (count l) 0)
               (conj (rev(butlast l)) (last l))
               ()
                ))

(println (rev '(1 2 3 4 5)))