package workarea

fun main() {
    val str = "Hello, Kotlin"
    var i = str.lastIndex
    while (i >= 0) {
        print(str[i])
        i--
    }
    println()
    println(str.reversed())  //kisa yol
}