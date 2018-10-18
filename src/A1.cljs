(ns A1)

(defn biggerThanZero [a] ( if (> a 0)
                         true
                         false))

(defn posFilter [a] (filter biggerThanZero a))

(defn posRec [a] (if(not (empty? a))
                    (if (> (first a) 0)
                      (conj (posRec (rest a)) (first a))
                      (posRec (rest a)))
                    a))

(println (posFilter '(-1 1 1 2)))
(println (posRec '(-1 1 1 2)))

