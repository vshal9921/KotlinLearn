package basics

fun main(){

    printObject("This is a generic function")
    printObject(79)

    val taxStatus : Int =  calculateTax(10_000_000)
    println("You tax is $taxStatus")

    val taxStatus2 : String = calculateTax(50_000)
    println(taxStatus2)
}

// Generic function to print values of different data types
fun <T> printObject(value : T){
    println(value)

    // if we try to get the type of value, we will get error
    // Cannot use 'T' as reified type parameter. Use a class instead.
    //println("${T::class.java}")
}

// To fix this we use reified keyword along with inline function

inline fun <reified T> printReified(value : T){
    println(value)
    println("${T::class.java}")
}

// This is useful where we have to return values of different types based on single input type

inline fun<reified T> calculateTax(salary : Int) : T{

    if(salary < 700_000){
        return "You do not fall under Tax Slab" as T
    }
    else {
        return (salary*30).div(100) as T
    }
}
