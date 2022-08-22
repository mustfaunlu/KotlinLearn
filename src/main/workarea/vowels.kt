//fun isVowel(param: Char): Boolean {
//    val vowels = arrayOf('a', 'e', 'o', 'u', 'i')
//    return param in vowels
//}
//
//fun workarea.main() {
//    val letter = readLine()!!.first().lowercaseChar()
//    println(isVowel(letter))
//}

//fun getLastDigit(param: Int): Char {
//     return param.toString().last()
//}
//
///* Do not change code below */
//fun workarea.workarea.workarea.main() {
//    val a = readLine()!!.toInt()
//    println(getLastDigit(a))
//}

fun divide(param1: Long, param2: Long): Double {
    return  param1.toDouble() / param2.toDouble()
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}