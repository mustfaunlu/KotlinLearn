package workarea

fun main() {
    val read = readln().uppercase()
    println(isRainbow(read))


}

enum class Rainbows() {
    RED(),
    ORANGE(),
    YELLOW(),
    GREEN(),
    BLUE(),
    INDIGO(),
    VIOLET()
}
fun isRainbow(color: String) : Boolean {
    for (enum in Rainbows.values()) {
        if (color.uppercase() == enum.name) return true
    }
    return false
}