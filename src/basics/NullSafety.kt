package basics

fun main(){

    var day : String = "Mon"
    var day1 : String? = "mon"

    // null safe call operator
    // The function uppercae is only executed if the value is not null
    var selectedDay = day1?.uppercase()
    println(selectedDay)

    // Elvis operator
    // If the value is null , returns the alternate value
    var selDay = day1?: "NA"
    println(selDay)

    // Non-null asserted call
    // Asserts that the value should not be null
    // Throws null pointer Exception if value is null
    var selectDay = day1!!.uppercase()

    println(selectDay)

}




