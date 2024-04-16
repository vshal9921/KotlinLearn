fun main(){

    val numList = listOf(1, 2, 3, 4, 5, 6, 7)
    var squareList = numList.map { it * it }
    println(squareList)

    var readerList = listOf(Reader(1,"A"), Reader(2,"B"), Reader(3,"C"))
    var premiumReaderList = readerList.map {
        PremiumReader(it.age, it.name, "premium")
    }
    println(premiumReaderList)
}

data class Reader(val age: Int, val name: String)
data class PremiumReader(val age: Int, val name: String, val type : String)