package workarea

fun intDivision(x: String, y: String): Int {

    try {
        x.toInt() / y.toInt()
    } catch (e: ArithmeticException){
        println("Exception: division by zero!")
        return 0
    } catch (e: NumberFormatException) {
        println("Read values are not integers.")
        return 0
    }
    return x.toInt() / y.toInt()
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))

printFifthCharacter("155")



}

fun printFifthCharacter(input: String): String {
    return try {
        "The fifth character of the entered word is ${input[4]}"
    } catch (e: StringIndexOutOfBoundsException){
         "The input word is too short!"
    }
}
