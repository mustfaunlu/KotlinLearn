package basics.variable_types

fun main() {
    /**
     * Sonlu sayili liste olusturmaya yarar.
     * baslangic bitisi veriyoruz aradakileri verir
     * ya sayilar ya harfler icin kullanilir harfler icin inglizce karakterleri alir default olarak.
     * Kucukten buyuge liste olusturmak icin .. operatorunu, ya da rangeTo() fonksiyoununu kullanabiliriz.
     */

    val numbers = 1 .. 100 //[1,100]
    val numbers2 = 1.rangeTo(100)
    numbers.maxOrNull()

    val alphabet = 'A' .. 'Z' //A'dan Z'ye kadar buyuk harfler
    val alphabetLower = 'a' .. 'z' //a'dan z'ye kadar kucuk harfler

    /**
     * buyukten kucuge gitmek icin rangeTo() yerine downTo() operatoru kullanabiliriz.
     * buyukten kucuge gitmek icin .. kullanamayiz.
     */
    val reversedNumber = 100.downTo(1)
    //val reversedNumber = 100.rangeTo(1) olmaz!.
    val numbers22 = 1.rangeTo(100).reversed() //seklindede tanimlayabilirz. ama ne gerek var

    /**
     * until fonksiyonunu kullanarak da range tanimalanabilir. verilen sayiya kadar verir
     *
     */
    val number = 10 until 100  //[10 ile 99 arasi 99 dahil]
    //val number = 10 ..< 100 kotlin 1.7.20 ile until operatoru gelmistir suan experimentalapi stable olacak


    /**
     * step atlaya atlaya yazar
     */
    val stepNumber = 100..200 step 2 //100 den 200 e kadar 2'ser 2'ser
    val stepNumber2 = 300 downTo 200 step 5 //300 den 200 e dogru 5'er 5'er

        /**
         * CharRange, IntRange gibi primitive tipleride range tanimi yapilabilir.
         * bu durumda, first, last step count gibi ek biligiler alinabilir.
         */
    val numberList: IntRange = 1 .. 100
    numberList.first
    numberList.last
    numberList.step
    numberList.maxOrNull()
    numberList.minOrNull()

    numberList.count()

    when(10){
        in numberList ->{
            println("10 sayisi numberList icerisinde yer alir")
        }
        !in number -> {}
    }

    val num = 3
    when(num){
        in 0..10 ->{
            println("0 10 arasinda")

        }
        !in 11..12 ->{
            println(" 0 10 arasinda degil")

        }
    }


    /**
     * for dongusu ile bu araliklari donmek daha rahat olabilir
     */
    for (chars in 'a'..'x') {
        println(chars)
    }

    for (nums in 5..15) {
        println(nums)
    }

    /**
     * if blogu ile ornek verelim
     */

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
// ==========================================//
    val nums = arrayOf(2, 4, 6, 8)
    if (2 in nums) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    val range1 = (1..10).filter { it % 2 == 0 }
    println(range1) // [2, 4, 6, 8, 10]

}

