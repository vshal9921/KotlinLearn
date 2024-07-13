package basics

fun main(){

    println("This is it".formattedString())
}

// Extension fuction is a function which can be added in another class
// Here formattedString() has been added in String class and can be used with all objects of String class
// private variables of class can not be accessed in extension functions
fun String.formattedString() : String{
    return "------------------------\n $this \n -------------------------------"
}
