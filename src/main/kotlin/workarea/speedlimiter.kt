package workarea

fun main() {
    processA()
}

fun processA() {
    val speed = readln().toInt()
    when (val limit = readln()) {
        "no limit" ->
            if (speed > 60) {
              println("Exceeds the limit by ${speed - 60} kilometers per hour")
        } else {
            println("Within the limit")
        }
        else -> limitless(speed, limit.toInt())
    }
}
fun limitless(speed: Int, limit: Int = 60) {
    if (speed > limit) {
        println("Exceeds the limit by ${speed - limit} kilometers per hour")
    } else {
        println("Within the limit")
    }
}
