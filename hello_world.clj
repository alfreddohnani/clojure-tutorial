;;This program says hello to this world
(print "Hello world!" "Try staying cool.") ; Says hello to this world

(+ 40 2)

(- 44 2)

(* 6 7)

(/ 210 5)

(+ 1 2 3 4 5)

(/ (+ 1 2 3 4 5) 5)

(/ 1 2 3)

(/ 1 6.0)

(/ 1 2.0 3)

(quot 14 5)

(rem 14 5)

;; Let's calculate the area of a circle of radius 7 units
(* (/ 22 7) (* 7 7))

(* Math/PI (* 7 7))

(* Math/PI (Math/pow 7 2))

(/ 84 32)

(double 32)

(long 42.32)
 
(str "1 + 2 is: " (+ 1 2))

(count "Alfred")

(clojure.string/reverse "Alfred")

(clojure.string/upper-case "Alfred")

(def my-name "Alfred")

(println my-name)

(println "Hello" my-name)


(def greeting (str "Hello " my-name "!"))

(println greeting)

(let [local-variable "something"]
  (println local-variable))


(def friends ["Ram", "Bashir", "Frank", "Buddha"])
(print (first friends))
(print (rest friends))

(type friends)
(type (rest friends))
(nth friends 3)
(friends 2)
(type (conj friends "Periyaar"))
(print friends)
(cons "Periyaar" friends)
(println friends)
(count friends)
'(1 2 3 4)
(def friends-list '("Ram" "Bashir" "Anthony" "Buddha"))
(count friends-list)
(rest friends-list)
(first friends-list)
(nth friends-list 3)
(friends-list 1)
#{1 2 3 4}
(type #{1 2 3 4})
(set? #{1 2 3 4})
(def fruits #{"Apple" "Oranges" "Banana" "Mango"})
(contains? fruits "Banana")
(contains? fruits "apple")
(fruits "Oranges")
(fruits "oranges")
(def languages  #{:ruby :python :clojure})
(:ruby languages)
(languages :ruby)
(conj languages :perl)
(disj languages :python)
(def user {"name" "Bashir" "age" 12})
(get user "name")
(user "name")
(def gee {:name "Astrid" :age 12})
(:name gee)
(gee :name)
(get gee :name)
(assoc gee :belief "Rationalism")
(dissoc gee :age)
(keys gee)
(vals gee)
(doc +)
(+)
(+ 42)
(find-doc "sum of nums")
(apropos "replace")
(doc replace)
(= 1 2)
(= 7 7 7 7)
(> 3 2 1)
(and true true)
(and true false)
(or true false)
(or false true)
(or false false)
(not true)
(not false)


(let [a 5]
  (if (> a 0)
  (println a "is positive")))

(let [a -5]
  (if (> a 0)
    (println a "is positive")))

(let [a -5]
  (if (> a 0)
    (println a "is positive")
    (println a "is negative")))



(let [a -5]
  (if (> a 0)
    (do 
      (println a "is postive")
      (println "there are infinite positive numbers"))
    (do 
      (println a "is negative")
      (println "there are infinite negative numbers"))))


(let [a "gold"]
  (if (= a "gold")
    (do
      (println "we are winners of gold.")
      (println "champions"))))

(let [a "gold"]
  (when (= a "gold")
    (println "when we win gold")
    (println "we win for real")))

(let [a 0]
  (cond 
    (> a 0) (println a "is positve")
    (< a 0) (println a "is negative")
    :else (println a "is neither positive nor negative")))


(let [num 20]
  (case num
    1 "One"
    2 "Two"
    3 "Three"
    4 "Four"
    5 "five"
    "I don't know"))


(let [nums [1 2 3 4 5]]
  (for [num nums]
    (* num 10)))


(def colors ["red" "blue" "yellow" "green"])
(def shapes ["square" "circle" "triangle" "rectangle"])

(for [color colors shape shapes]
  (str color " " shape))


(let [nums [1 2 3 4 5]]
  (doseq [num nums]
    (* num 10)))


(let [nums [1 2 3 4 5]]
  (doseq [num nums]
    (println (* num 10))))


(loop [x 1]
  (when (< x 5)
    (println x)
    (recur (inc x))))




;; Functions
;; define function -> defn
(defn say-hello [] 
  (println "Hello World!"))

(say-hello)


(defn say-hello [name]
  (println "Hello" name "!"))

(say-hello "Alfred")


(defn circle-area [radius]
  (* Math/PI (Math/pow radius 2)) ) 

(defn circle-area [radius]
  (* Math/PI radius radius)) 

(circle-area 7)


(defn hypotenuse [a b]
  (Math/sqrt (+ (* a a) (* b b))))

(hypotenuse 3 4)


(defn multiple-args 
  ([] (println "No arguments passed"))
  ([a] (println "One argument passed:" a))
  ([a b] (println "Two arguments passed:" a b)))

(multiple-args)
(multiple-args 1)
(multiple-args 1 2)


(defn unlimited-args [& args]
  (println "Arguments:" args)
  (println "Type of args: " (type args)))

(unlimited-args 1 2 3)

(defn at-least-one-arg [first-arg & args]
  (println "First argument:" first-arg)
  (println "Other arguments:" args))

(at-least-one-arg 2 3 4)

;; Recursion
(defn count-down [number]
  (println number)
  (if (pos? (dec number))
    (count-down (dec number))))

(count-down 5)

