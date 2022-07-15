package hackerrank

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

//fun plusMinus(arr: Array<Int>): Unit {
//    listOf(
//        arr.count{it > 0}, arr.count{it < 0}, arr.count{it == 0}
//    ).forEach { n ->
//        println("%.6f".format(n/(arr.size.toDouble())))
//    }
//}

fun plusMinus(arr: Array<Int>): Unit {
    var neg = 0
    var pos = 0
    var notrr = 0
    for (i in arr){
        when{
            i > 0 -> pos += 1
            i < 0 -> neg += 1
            else -> notrr += 1
        }
    }
    val r = pos / arr.size.toDouble()
    val r1 = neg / arr.size.toDouble()
    val r2 = notrr / arr.size.toDouble()

    println("%.6f".format(r))
    println("%.6f".format(r1))
    println("%.6f".format(r2))
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt()}.toTypedArray()



    plusMinus(arr)
}
