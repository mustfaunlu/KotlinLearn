package workarea

fun main() {
    val num = readln().toInt()
    val fib = mutableListOf<Int>(0, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val tri = mutableListOf<Int>(0, 1, 3, 6, 10, 15, 21, 28, 36, 45)
    val pow = mutableListOf<Int>(1, 10, 100, 1000, 10000, 100000)

    when (num) {
        in fib -> println("F")
        in tri -> println("T")
        in pow -> println("P")
        else -> println("N")
    }
}
