(ns A8)

(defn sumrec [lst](
                 loop [x lst sum 0](if (empty? x)
                                    sum
                                    (recur (rest x) (+ (first x) sum)))
                      ))


(println (sumrec '(1 2 3 4 5)))