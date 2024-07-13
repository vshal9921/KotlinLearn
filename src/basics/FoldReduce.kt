package basics

fun main(){

    val numbers = listOf(3, 6, 9, 14)

    val sumFold = numbers.fold(0){ acc, number -> acc + number}

    println("Sum using fold is $sumFold")

    val sumReduce = numbers.reduce{acc, number -> acc + number}

    println("Sum using reduce is $sumReduce")

}