package basics

fun main(){

    var shape : Shape = Circle(4.0)
    println(shape.area())
    var shape2 : Shape = Square(4.0)
    println(shape2.area())

    // Benefits of polymorphism
    // Parent class can hold reference to different child classes

    var shapeArray : Array<Shape> = arrayOf(Circle(4.5), Circle(10.0), Square(26.0), Triangle(6.0,5.0))
    calculateArea(shapeArray)
}


open class Shape {

    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius : Double) : Shape(){

    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side : Double) : Shape(){

    override fun area(): Double {
        return side * side
    }
}

class Triangle(val height : Double, val base : Double) : Shape(){

    override fun area(): Double {
        return (height * base)/2
    }
}

fun calculateArea(array : Array<Shape>){

    for(arr in array){

        println(arr.area())
    }
}