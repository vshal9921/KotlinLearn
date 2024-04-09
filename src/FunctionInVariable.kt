fun main(){

    val fn = ::add  // add function stored in variable fn

    fn(3,5)

    add(b= 5, a = 3)   // parameterized arguments
}

fun add(a : Int, b: Int){
    println(a + b)
}