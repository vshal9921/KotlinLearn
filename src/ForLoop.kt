fun main(){

    // .. is inclusive of upper bound
    for (i in 1..5){
        print("$i ")
    }
    println("- Use of ..")

    // until is excluisve of upper bound
    for (i in 1 until 5){
        print("$i ")
    }
    println("- Use of until")

    // step is used to introduce step into loop
    for(i in 1..10 step 2){
        print("$i ")
    }
    println("- Use of step")

    // downTo is used to traverse loop in reverse order
    for(i in 10 downTo 1 step 2){
        print("$i ")
    }
    println(" - use of downTo")
}