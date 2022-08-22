package workarea

fun rev(str: String): String {
    // val result = str.reversed() //kisa yol
    var result = ""
    for (i in str.length - 1 downTo 0) {
        result += str[i]
    }
    return result
}

fun main() {
    println(rev("adsa"))
}