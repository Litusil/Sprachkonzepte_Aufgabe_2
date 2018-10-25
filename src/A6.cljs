(ns A6)

(defn mod35 [a] (or (= (rem a 3) 0) (= (rem a 5) 0)))

(defn add [] (reduce + (filter mod35 (range 0 1001))))

(println (add))