package `2 Basics`

fun main() {
    /**
     * Sonlu sayili liste olusturmaya yarar.
     * baslangic bitisi veriyoruz aradakileri verir
     * ya sayilar ya harfler icin kullanilir harfler icin inglizce karakterleri alir default olarak.
     * Kucukten buyuge liste olusturmak icin .. operatorunu, ya da rangeTo() fonksiyoununu kullanabiliriz.
     */

    val numbers = 1 .. 100 //[1,100]
    val numbers2 = 1.rangeTo(100)
    val alphabet = 'A' .. 'Z'

    /**
     * buyukten kucuge gitmek icin rangeTo() yerine downTo() operatoru kullanabiliriz.
     * buyukten kucuge gitmek icin .. kullanamayiz.
     */
    val reversedNumber = 100.downTo(1) //val numbers2 = 1.rangeTo(100).reversed seklindede tanimlayabilirz. ama ne gerek var

    /**
     * until fonksiyonunu kullanarak da range tanimalanabilir. verilen sayiya kadar verir
     *
     */
    val number = 10 until 100  //[10 ile 99 arasi 99 dahil]

    /**
     * step atlaya atlaya yazar
     */
    val stepNumber = 100..200 step 2
    val stepNumber2 = 300 downTo 200 step 5

        /**
         * CharRange, IntRange gibi primitive tipleride range tanimi yapilabilir.
         * bu durumda, first, last step count gibi ek biligiler alinabilir.
         */
    val numberList: IntRange = 1 .. 100
    numberList.first
    numberList.last
    numberList.step
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
        !in 0..10 ->{
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
}

