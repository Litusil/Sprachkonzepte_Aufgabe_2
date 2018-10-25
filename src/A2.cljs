(ns A2)

(defn facNonRec [n](

                     apply *(range 1 (+ n 1))
 ))

(defn facRec [n](
                   if (= n 1)
                   1
                   (* n (facRec(- n 1)))
                   ))

(defn facLR [n](
  loop [x n prod 1](if (not (> x 1))
                           prod
                  (recur (- x 1) (* x prod)))
                 ))
(defn facIt [n] (
                  reduce *(take n (iterate inc 1))
                  ))


(println (facIt 5))
