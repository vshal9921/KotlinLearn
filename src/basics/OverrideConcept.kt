package basics

fun main(){

    var tigor = Tigor()
    tigor.run()
    println(tigor.toString())
    println("engine = ${tigor.engine}")
}

open class Car {

    open var engine : String = "Petrol"
    open var seats : Int = 5

    open fun run() = println("car is running")
}

class Tigor() : Car(){

    override var engine : String = "Diesel"
    override var seats : Int = 6

    override fun run() {  // override the parent class run method
        super.run()   // calls the run method in parent class
        println("child class function executed")
    }

    override fun toString(): String {  // overriding toString() of superclass Any in Tigor class
        return "engine is $engine and seats = $seats"
    }

}