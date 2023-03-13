package basics.control_flows

fun bmiMetric(
    weight: Double,
    height: Double
): String {
    val bmi = weight / (height * height)
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}

fun main() {
    val weight = 72.57 // 160 lbs
    val height = 1.727 // 68 inches
    val status = bmiMetric(weight, height)
    println(status)


    var num1 = 10
    var num2 = 11
    if (num1 > 9 && num2 > 10) {
        println("num1 is greater than 9 and num2 is greater than 10")
    } else if (num1 > 10) {
        println("num1 is greater than 10")
    } else {
        println("num2 is greater than num1")
    }

}