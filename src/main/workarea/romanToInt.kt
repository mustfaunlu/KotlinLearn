package workarea

fun main() {
    println(romanToInt("MCMXCIV"))
}
fun romanToInt(s: String): Int {
    val map = mutableMapOf(
        'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
    )
    var number = 0
    var last = 1000
    s.forEach {
        val value = map[it] ?: 0
        if (value > last) number -= last * 2
        number += value
        last = value
    }

    return number
}
