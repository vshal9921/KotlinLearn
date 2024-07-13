package basics

fun main(){

    var intContainer = IntContainer(67)
    println(intContainer.getValue())


    var container = Container<String>("this is it")
    println(container.getValue())
}

// Generic class which can return any data type object
class Container<T>(var data : T){

    fun getValue() : T{
        return data
    }

    fun setValue(data: T){
        this.data = data
    }
}

class IntContainer(var data : Int){

    fun getValue() : Int{
        return data
    }

    fun setValue(data : Int){
        this.data = data
    }

}