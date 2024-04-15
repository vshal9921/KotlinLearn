fun main(){

    // lambda is a fumctoin without a name

    // single line lambda
    var lambda1 = {x: Int, y: Int -> x + y}
    println(lambda1(4, 80))

    // multiple line lambda
    // the last statement becomes the return type of lambda
    var lambda2 = {
        2
        println("multiline lambda executed")
        9.0
    }

    println(lambda2())

    // other variation
    val singleParam = {x : Int -> x * x}
    println(singleParam(5))

    // different way of writing above
    val singleParamReturnDefined : (Int) -> Int = {x -> x * x}
    println(singleParamReturnDefined(10))

    // different way of writing above
    val singleParamInt : (Int) -> Int = {it * it}
    println(singleParamInt(13))

    // lambda at last position
    calculate(5, 6, {a, b -> a * b})
    calculate(5, 6) { a, b -> a * b } // if lambda is last param,it can be moved out in body

}

fun calculate(a: Int, b : Int, fn : (Int,Int) -> Int): Int{
    return fn(a, b)
}