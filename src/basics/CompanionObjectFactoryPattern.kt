package basics

fun main(){

    var pizza = Shop.Factory.createPizza("cheese") // Factory pattern calling
    var guitar = Guitar.createGuitar("electric") // companion object called
    val drum = Drum.createDrum("bass")
}

class Shop (val type : String){

    object Factory{

        fun createPizza(topping: String){

            println("toppings is $topping")
        }
    }
}

class Guitar (val type : String){

    companion object Factory{

        fun createGuitar(type: String){

            println("Guitar type is $type")
        }
    }
}

class Drum private constructor(val type : String){  // primary constructor is private so can not be called outside the class

    companion object Factory{

        fun createDrum(type: String){

            println("Drum type is $type")
        }
    }

    constructor(count : Int) : this("count :String"){

    }
}