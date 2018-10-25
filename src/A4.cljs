(ns A4)



(defn brackets [l](
                    if(> (count l) 0)
                    (conj (brackets (rest l)) (list(first l)) )
                    ()
                    ))

(println(brackets '(1 2 3 4)))