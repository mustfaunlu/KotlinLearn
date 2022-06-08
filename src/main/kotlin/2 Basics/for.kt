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


}