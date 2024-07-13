package basics

fun main(){

    var obj = object : ObjectConcepts() {  // used for singleTon, initialized only once

        override fun run(){
            super.run()
            println("run method in object")
        }
    }

    obj.run()
}

open class ObjectConcepts {

    open fun run(){
        println("run method in objectConcepts")
    }
}