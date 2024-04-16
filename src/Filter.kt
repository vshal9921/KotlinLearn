fun main(){

    val list = listOf(1, 2,3, 4,5,6, 7,8)

    // filter odd numbers is list using filter and lambda functions
    var oddFilteredList = list.filter { a: Int -> (a % 2 != 0) }
    println(oddFilteredList)

    var oddFilteredListUsingIt = list.filter { it % 2 != 0 }
    println(oddFilteredListUsingIt)

    var userList = listOf(User(1,"A"), User(2, "B"), User(3, "C"))

    var filteredList = userList.filter { it.age > 1 }
    println(filteredList)
}

data class User(val age : Int, val name : String)