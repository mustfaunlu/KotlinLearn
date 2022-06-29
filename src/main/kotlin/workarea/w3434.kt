package workarea

import kotlin.math.max

fun main() {

    // ===== 1. workout ======
    val str = readln()
    val strSize = str.length

    println("$strSize repetitions of the word $str: ${str.repeat(strSize)} ")

    // ===== 2. workut ======
        val a = readln().toInt()
        if(a in 1..10) println("false")
        if (a !in 1..10) println("true")



    // ===== 3.work ======
    val list: MutableList<Int> = mutableListOf()
    do {
        val n = readln().toInt()
        list.add(n)
        if(n == 0) println(list.size - 1)
    } while (n != 0)
}