package basics

fun main(){

    calculateTime { runLoop(100000000) }
}

// For lambda functions internally classes and variables are created which consume memory
// So internal functions are used whose body is copied where the function is invoked
// See java byte code to see the difference
inline fun calculateTime(fn : ()-> Unit){

    var start = System.currentTimeMillis()
    fn()
    var end = System.currentTimeMillis()
    println("Time executed is ${end - start} ms.")
}

fun runLoop(num : Long){

    for(j in 0..num){

    }
}