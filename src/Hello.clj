(ns Hello
  (:gen-class))
(defn Hello-world []
  (println "Hello world ,how are you?")
  (println "Hi my my name is gaganjot")
   (println (+ 1 2))
 (def x 1)
  (def y 10.5)
  (def str1 "hello")
  (dec 8)
  (println x)
  (println y )
  (println str1)
  
  
  )
(Hello-world)
(defn examples []
  (loop [x 10]
    (when (> x 1)
       (println x)
       (recur (- x 2))
      )
    )
  )
(examples)

(defn loo []
  (if (and (= 2 2) (= 3 3))

    (println "values are equal ")
    (println "values are not equal "))
  )
(loo)