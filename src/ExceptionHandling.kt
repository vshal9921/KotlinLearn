fun main(){

    createUserList(5)
    createUserList(-3)

}

fun createUserList(count : Int){

    if(count < 0 ){
        throw IllegalArgumentException("Count should be greater than zero")

    }
    else {
        println("List of size $count created.")
    }

}