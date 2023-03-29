fun main (args: Array<String>){
    println(inverteString("banana"))
}

fun inverteString(str: String): String{
    var strInve: String = ""
    for (i in str.length-1 downTo 0){
        strInve += str[i]
    }
    return strInve
}