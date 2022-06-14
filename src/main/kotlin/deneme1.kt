fun main() {
//    val (a, b, c, d, e) = readln().split(" ")
//    print("$a $b $c $d $e")

   // print("${readln()} ${readln()} ${readln()} ${readln()} ${readln()}")

    println(factorial(7))
    printPyramid()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)

}

//faktoriyel algoritmasi recursive func
fun factorial(num: Int): Int {
    if (num <= 1) return 1
    return num * factorial(num - 1)
}

//pyramid

fun printPyramid(){



        for (i in 1..5) {
            for (j in 1..i) {
                print("* ")
            }
            println()
        }


    for (i in 1..5){
        for (k in 1..i){
            print("$k")
        }
        println()
    }

    for (i in 5 downTo 1){
        for (k in 1..i){
            print("* ")
        }
        println()
    }

    val last = 'E'
    var alphabet = 'A'

    for (i in 1..last - 'A' + 1) {
        for (j in 1..i) {
            print("$alphabet ")
        }
        ++alphabet

        println()
    }
println("====================================================")
    var alp='b'
    val lastt = 'f'
    for(i in 1..lastt - 'b' + 1){
        for (j in 1..i){
            print("$alp")
        }
        ++alp

        println()
    }

    println("==========================fdg==========================")
    val rows = 6
    for (x in 1..rows){
        for (j in 1..x){
            print("* ")
        }
        println()
    }

    println("=========================kup==========================")

    for (x in 1..5){
        for (k in 1..5){
            print("* ")
        }
        println()

    }
    println()

    println("==========================piramid==========================")

    val rowss = 5
    var k = 0

    for (i in 1..rowss) {
        for (space in 1..rowss - i) {
            print("  ")
        }

        while (k != 2 * i - 1) {
            print("* ")
            ++k
        }

        println()
        k = 0
    }



    println("==========================hackerrank first challenge==========================")

    val n = readln().toInt()
    var c = 0

    for (i in 1..n) {
        for (space in 1..n - i) {
            print(" ")
        }

        while (c != i) {
            print("#")
            ++c
        }

        println()
        c = 0
    }

    println("==========================hackerrank second challenge==========================")




}
fun miniMaxSum(arr: Array<Int>) {
    var min:Long =  arr[0].toLong()
    var max:Long = 0
    var total:Long = 0
    for (x in 0 until arr.size) {
        val item = arr[x].toLong()
        total += item
        if (item < min) {
            min = item
        }
        if (item > max) {
            max = item
        }
    }
    println("${total - max} ${total - min}")
}
