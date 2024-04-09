fun main(){

    val arr = arrayOf("Sunday","Monday","Tuesday")

    for(i in arr){   // for each loop
        println(i)
    }

    for ((i, e) in arr.withIndex()){  // for each loop with index
        println("$i $e")
    }
}