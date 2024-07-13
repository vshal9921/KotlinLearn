package basics

fun main(){

    var fn: (a: Double, b: Double) -> Double = ::addition
    println(fn(2.0, 4.0))
    calculator(2.78, 4.0, ::addition)
}

fun addition(a: Double,b: Double) : Double {
    return a + b
}

fun calculator(a: Double,b : Double, gn : (Double, Double) -> Double) {

    var result = gn(a,b)
    println(result)
}