(ns A4)

(defn brackets [l](
                    if(> (count l) 1)
                    (conj (conj '() (brackets (rest l)) (first l)) )
                    (conj '()(first l))
                    ))

(println(brackets '(1 2 3 4)))