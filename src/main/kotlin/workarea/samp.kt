//fun workarea.main() {
//    val a = readln().toInt()
//    val b = readln().toInt()
//    val c = readln().toInt()
//    val d = readln().toInt()
//    val e = readln().toInt()
//
//    val range1 = a..b
//    val range2 = c..d
//
//    println(range1.contains(e) && range2.contains(e))
//    println(e in range1 && e in range2)
//
//    val age = readln().toInt()
//
//    age in 18..59
//
//    fun workarea.main() {
//        val a = readln().toInt()
//        val b = readln().toInt()
//        val c = readln().toInt()
//
//        val range1 = b..c
//
//        println(a in range1 && b < c)
//    }
fun main() {
//        val n1 = readln().toInt()
//        val n2 = readln().toInt()
//        val n3 = readln().toInt()
//
//        val oper = (n1 + n2 + n3) % 2
//        val oper2 = (n1 + n2 + n3) / 2
//        val oper3 = oper + oper2
//
//        println(oper3)

//        for(i in 5..15 step 5){
//            for (j in 5..15 step 5){
//                print(i * j)
//                print('\t')
//            }
//            println()
//        }

//        for (i in 2..10 step 2) {
//            for ( j in 2..10 step 2){
//                print(i * j)
//                print('\t')
//            }
//            println()
//        }
//
//
//            for (i in 2..10 step 2) {
//                for (j in 2..10 step 2) {
//                    print(i * j)
//                    print('\t')  // print the product of i and j followed by one tab
//                }
//                println()
//            }


//        val a = readln().toInt()
//        val b = readln().toInt()
//        val n = readln().toInt()
//
//        val range1 = a..b
//        var count = 0
//        for (i in range1){
//            if (i % n == 0) count++
//        }
//        println(count)
//
//        println((a..b).count { it % n == 0 }) // kisa yol




            val a = readln().toInt()
            val b = readln().toInt()
            val c = readln().toInt()
            val d = readln().toInt()

            for(x in 0..1000){
                if(a * x * x * x + b * x * x + c * x + d == 0) println(x)
            }



    }
