fun main(args: Array<String>) {

    val a = "abc"
    val b = "bad"

    if(a.length != b.length){
        println("The strings are not anagram")
        return
    }

    val charA = a.toCharArray()
    val charB = b.toCharArray()

    val hash1 = getOccurence(charA)
    val hash2 = getOccurence(charB)


    if(hash1.equals(hash2)){
        println("The strings are anagram")
    }
    else {
        println("The strings are not anagram")
    }
}

fun getOccurence(arr : CharArray) : HashMap<Char, Int>{

    var hash = HashMap<Char, Int>()

    for(i in 0 until arr.size){

        if(hash.containsKey(arr[i])){
            hash.put(arr[i], hash.getValue(arr[i]) + 1)
        }
        else {
            hash.put(arr[i], 1)
        }
    }

    return hash
}