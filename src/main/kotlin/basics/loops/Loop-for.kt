package basics.loops

/*
Java ve diğer programlama dillerinden farklı olarak, Kotlin'de geleneksel bir for döngüsü yoktur.
Kotlin'de for döngüsü string, range ve sayılabilir sayıda değer içeren,
arrays diğer şeyler arasında döngü yapmak için kullanılır.

Kotlinde for dongusu in ile kullanilir.
 */
fun main() {
    /**
     *  3 farkli sekilde for tanimlayabiliriz.
     *  value in list                           seklinde value degerlerini alabiliriz
     *  index in list.indices                   seklinde index degerlerini alabiliriz
     *  (index,value) in list.withIndex()       seklinde index,value degerlerini alabilirz.
     */

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }

    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }

    for (value: Int in 1..5){  //sadece value verir
        println("value = $value")
    }

    for (index in nums.indices){    // sadece index verir value manuel aliriz indices ozelligi arrayin Intrangeni alir
        print("\n$index. index degeri : manual alinan valuesi : ${nums[index]}") // valueyi nums[index] ile manuel aldik

    }

    for ((index, value) in nums.withIndex()){ // hem index hem value verir
        print("\n$index. index degerinin valuesi: $value ")

        /**
         * https://kotlinlang.org/docs/destructuring-declarations.html
         */
    }

    /**
     * break kullanarak ilgili sart saglanirsa, donguden cikabilirsiniz.
     * continue kullanarak ilgili sart saglanirsa, donguye o degeri atlayarak devem edebilirsiniz
     */
    for(value in 1..50){
        if (value % 2 == 1){ // tek sayi ise sart saglanirsa print etmez for dongusune doner
            continue // sayi tek ise print etmez
        }
        println("$value")
    }

    for (value in 1.. 50){
        if (value % 2 == 0){
            break  // sart saglanirsa donguden cikar
        }
        println(value)
    }

    /**
     * ic ice for donguleri kullnaiyorsak bir ustteki for a degil de iki ustteki uc ustteki for a donmek istiyorsak
     * label kullanabiliriz. bunun icin labelname@ ifadesini ilgili for un onune yazip. return ya da continue yapacagimiz
     * yere ise @labelname seklinde yazmamiz yeterlidir.
     * labelleri continue ve break operatorleri ile kullanbiliriz
     */

    for(value in 1..10){
        for (value2 in 0 ..5){
            if (value == 5){
                continue
            }
            println("continue1 : $value2")
        }
    }

    returnlabel@ for (value in 1 ..50){
        for(value2 in 0..10){
            if (value2 == 5) {
                continue@returnlabel
            }
            println("continue $value2")
        }
    }

    breaklabel@ for (value in 1..50){
        for (value2 in 0..10){
            if (value2 == 5){
                break@breaklabel
            }
            println("break $value2")
        }
    }

    for (i in 1..4) {
        for (j in 1..4) {
            if (j == 2) continue // you want to ignore j = 2
            if (i <= j) break    // you will print the string if i is greater than j
            println("i = $i, j = $j")
        }
        println("Finished to examine i = $i")
    }

    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i, j = $j")
            if (j == 3) break@loop
        }
    }

    loop@ for (i in 1..3) {
        for (j in 1..3) {
            for (k in 1..3) {
                if (k == 2) continue@loop
                println("i = $i, j = $j, k = $k")
            }
        }
    }

    val oneToTen = 1..10
    val oneToFive = 1..5
    for (k in oneToTen) {
        for (j in oneToFive) {
            val carpim = k * j
            println("$k * $j = $carpim")
        }
    }

    for (i in 1..6) { }        // closed range: 1, 2, 3, 4, 5, 6
    for (i in 1 until 6) { }   // half-open range: 1, 2, 3, 4, 5
    for (x in 1..6 step 2) {  } // step 2: 1, 3, 5
    for (x in 6 downTo 1) { }  // closed range, backward order: 6, 5, 4, 3, 2, 1




}