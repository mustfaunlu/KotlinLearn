package workarea

fun main() {
    val (num1, oper, num2) = readln().split(" ")

    val a = num1.toInt()
    val b = num2.toInt()
    val answer = "Answer:"

    when(oper){
        "+", "plus" -> println(a + b)
        "-", "minus" -> println("$answer ${a - b}")
        "*", "times" -> println(a * b)
        "/", "divide" -> println(a / b)
        "mod", "%" -> println(a % b)
        else -> println("Unknown operator")
    }
}