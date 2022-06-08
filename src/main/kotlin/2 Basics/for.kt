package `2 Basics`

/*
Java ve diğer programlama dillerinden farklı olarak, Kotlin'de geleneksel bir for döngüsü yoktur.
Kotlin'de for döngüsü string, range ve sayılabilir sayıda değer içeren,
arrays diğer şeyler arasında döngü yapmak için kullanılır.

Kotlinde for dongusu in ile kullanilir.
 */
fun main() {

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }

    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }

    for (value: Int in 1..5){  //sadece value verir
        print("$value")
    }

    for (index in nums.indices){    // sadece index verir value manuel aliriz indices ozelligi arrayin Intrangeni alir
        print("\n$index. index degeri : ${nums[index]}") // valueyi nums[index] ile manuel aldik

    }

    for ((index, value) in nums.withIndex()){ // hem index hem value verir
        print("\n$index. index degeri: $value ")

        /**
         * https://kotlinlang.org/docs/destructuring-declarations.html
         */
    }

    /**
     * break kullanarak ilgili sart saglanirsa, donguden cikabilirsiniz.
     * continue kullanarak ilgili sart saglanirsa, donguye o degeri atlayarak devem edebilirsiniz
     */
    for(value in 1..50){
        if (value % 2 == 1){ // tek sayi ise sart saglanirsa print etmez devam eder
            continue // sayi tek ise print etmez
        }
        print("$value")
    }

    for (value in 1.. 50){
        if (value % 2 == 0){
            break  // sart saglanirsa donguden cikar
        }
        print(value)
    }

    /**
     * ic ice for donguleri kullnaiyorsak bir ustteki for a degil de iki ustteki uc ustteki for a donmek istiyorsak
     * label kullanabiliriz. bunun icin labelname@ ifadesini ilgili for un onune yazip. return ya da continue yapacagimiz
     * yere ise @labelname seklinde yazmamiz yeterlidir.
     */

    for(value in 1..45){
        for (value2 in 0 ..10){
            if (value == 5){
                continue
            }
            print("continue1 : $value2")
        }
    }

    returnlabel@ for (value in 1 ..50){
        for(value2 in 0..10){
            if (value2 == 5) {
                continue@returnlabel
            }
            print("continue $value2")
        }
    }

    breaklabel@ for (value in 1..50){
        for (value2 in 0..10){
            if (value2 == 5){
                break@breaklabel
            }
            print("break $value2")
        }
    }

}