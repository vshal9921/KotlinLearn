fun main(){

    addNum(2, 5, 6, 8)
    addNum(1,1,1,1,1)

}

fun addNum(vararg a: Int){

    var sum = 0

    a.forEach { sum += it }

    println("sum is $sum")
}