package basics

data class CustomObject(val field1: String, val field2: String, val field3: String, val field4: String)

fun main() {
    // Sample list of objects
    val objects = listOf(
        basics.CustomObject("value1", "value2", "value3", "value4"),
        basics.CustomObject("value1", "value2", "value5", "value6"),
        basics.CustomObject("value3", "value2", "value5", "value6"),
        basics.CustomObject("value1", "value2", "value3", "value4"),
        basics.CustomObject("value3", "value4", "value5", "value6")
    )

    // Removing duplicates based on two fields
    val uniqueObjects = objects.distinctBy { it.field4 to it.field3 to it.field1 }

    // Print the unique objects
    uniqueObjects.forEach { println(it) }
}