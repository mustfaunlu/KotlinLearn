package workarea

fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // do not touch the lines above
    val a = numbers.sum()
    numbers.add(0, a)
    numbers.removeAt(numbers.size - 2)

    // do not touch the lines below
    println(numbers.joinToString(" "))
}
