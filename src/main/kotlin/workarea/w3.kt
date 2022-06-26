package workarea

fun main() {
    val size = readln().toInt()
    var list: MutableList<Int> = mutableListOf(size)
    for(element in 0 until size){
        list.add(readln().toInt())
    }

    val (P, M) = readLine()!!.split(" ").map { it.toInt() }

    if (P in list && M in list) {
        println("YES")
    } else {
        println("NO")
    }
}