package workarea

import `4 Classes`.DaysOfWeek

enum class Rainbow(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF"),
    NULL("", "");

    fun printFullInfo() {
        println("Color - $color, rgb - $rgb")
    }
}
fun findByRgb(rgb: String): Rainbow {
    for (enum in Rainbow.values()) {
        if (rgb == enum.rgb) return enum
    }
    return Rainbow.NULL
}

fun main() {
    val rgb = Rainbow.RED
    rgb.printFullInfo() //Color - Red, rgb - #FF0000
println(rgb.ordinal) //0
    println(Rainbow.values().size) //7
    println(findByRgb("#FF0001")) //NULL
    println(Rainbow.valueOf("RED")) // RED
    println(Rainbow.valueOf("Red")) // illegalArgumentExceptions cunku rRed isminde bir sabit yoktur.

    printDays()
}

//Write a program that declares an enum DaysOfTheWeek and prints the name of each enum's instance on a new line,
// starting from SUNDAY.
enum class DaysOfTheWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
 fun printDays() {
    for (enum in DaysOfTheWeek.values()) {
        println(enum)
    }
}


