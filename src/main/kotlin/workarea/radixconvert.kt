package workarea

fun main() {
converter()
}

fun converter() {
    print("Enter number in decimal system:")
    val decNum = readln().toInt()
    print("Enter the target base:")
    val baseNum = readln().toInt()
    val remain = decNum .toString(baseNum)
    print("Conversion result: $remain")
}
