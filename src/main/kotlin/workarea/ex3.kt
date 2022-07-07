package workarea

fun solution() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    try {
        println(num1 / num2)
    } catch(e: Exception) {
        println(e.message)
    } finally {
        println("This is the end, my friend.")
    }
}

fun main() {
    solution()
}