package basics

fun main() = printMsg()

fun printMsg(count : Int = 2){  // The default value of param count is defined as 2even if param is not passed during function call

    for (i in 1..count){
        println("Hello $i")
    }
}