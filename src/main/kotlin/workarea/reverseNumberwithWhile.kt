package workarea

fun reverseDecimal(number: Int): Int {
    var worker = number
    var result = 0

    while (worker > 0) {
        result *= 10
        result += worker % 10
        worker /= 10
    }
    return result
}

fun main() {
    println(reverseDecimal(1234))  // 4321
}
