fun main() {
    val day = readln().toInt()
    val food = readln().toInt()
    val flight = readln().toInt()
    val night = readln().toInt()
    process(day, food, flight, night)
}

fun process(day: Int, food: Int, flightCost: Int, night: Int) {
    val result = (day * food) + (night * (day - 1)) + flightCost * 2
    println(result)
}