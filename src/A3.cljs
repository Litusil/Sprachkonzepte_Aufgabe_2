(ns A3)


(defn Last [l](
                if (>(count l) 1)
                (Last (rest l))
                (first l)
                ))

(println (Last '(1 2 3 4 5 6 7 8 9 1)))