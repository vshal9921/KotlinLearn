package basics

fun main(){

    var person1 = Person("A", 20)
    println(person1.name)
    println(person1.age)

    var person2 = Person("B")
    println(person2.name)
    println(person2.age)
}

// Order of execution - primary constructors - init blocks - secondary constructors

class Person(var name: String, val age: Int){

    init {
        println("init block initialized")
    }

    constructor(perName : String) : this(perName, 30){
        println("secondary constructor initialized")
    }
}