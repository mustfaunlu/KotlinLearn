fun main() {
//    val (a, b, c, d, e) = readln().split(" ")
//    print("$a $b $c $d $e")

   // print("${readln()} ${readln()} ${readln()} ${readln()} ${readln()}")

    println(factorial(7))
}

//faktoriyel algoritmasi recursive func
fun factorial(num: Int): Int {
    if (num <= 1) return 1
    return num * factorial(num - 1)
}