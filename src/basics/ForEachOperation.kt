package basics

fun main(){

    // forEach iterates the whole list without using loop
    var list = listOf(1,3, 5, 6, 8, 4)
    list.forEach({ println(it * it) })
}