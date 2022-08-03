package workarea

fun main() {
    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()
    // do not touch the lines above
    firstList.addAll(secondList)
    println(firstList.joinToString())

}