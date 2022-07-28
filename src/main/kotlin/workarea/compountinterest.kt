package workarea
import kotlin.math.pow

fun main() {
   param()
}

fun param() {
    val parameter = readln()
    val parameterValue = readln().toInt()
    when(parameter){
        "amount" -> compoundInterest(amount = parameterValue)
        "percent" -> compoundInterest(percent = parameterValue)
        "years" -> compoundInterest(years = parameterValue)
    }
}

fun compoundInterest(amount: Int = 1000, percent: Int = 5, years: Int = 10)  {

    val x = (1 + (percent / 100.toDouble())).pow(years)
    val finalAmount = amount * x
    println(finalAmount.toInt())
}