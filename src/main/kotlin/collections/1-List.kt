package collections




data class Person(var name: String, var age: Int)
fun main() {
    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")
    println("Last index of numbers: ${numbers.lastIndex}")
    println("Last index of numbers: ${numbers.size - 1}")

    /**
     *List<T> elemanları belirli bir sırada saklar ve bunlara indeksli erişim sağlar. İndeksler
     * sıfırdan - ilk elemanın indeksi - başlar ve (list.size - 1) olan lastIndex'e gider.
     *
     *
     *
     *
     * Liste elemanları ( null'lar dahil) çoğaltılabilir: bir liste herhangi bir sayıda eşit nesne veya tek bir
     * nesnenin oluşumunu içerebilir. İki liste, aynı boyutlara ve aynı konumlarda yapısal olarak eşit öğelere
     * sahipse eşit kabul edilir.
     *
     */

    val bob = Person("Bob", 31)
    val people = listOf(Person("Adam", 20), bob, bob)
    val people2 = listOf(Person("Adam", 20), Person("Bob", 31), bob)
    println(people == people2) //true
    bob.age = 32
    println(people == people2)//false


    /**
     * MutableList<T>, listeye özgü yazma işlemlerine sahip bir Listedir; örneğin,
     *belirli bir konuma bir öğe eklemek veya kaldırmak için.
     */

    val numbers2 = mutableListOf(1, 2, 3, 4)
    numbers2.add(5)
    numbers2.removeAt(1)
    numbers2[0] = 0
    numbers2.shuffle()
    println(numbers2) //[3, 5, 4, 0]


    /**
     * Gördüğünüz gibi, listeler bazı yönlerden array'lere çok benzemektedir. Bununla birlikte, önemli bir fark vardır:
     * bir array'in boyutu başlangıçta tanımlanır ve asla değiştirilmez; buna karşılık, bir listenin önceden tanımlanmış
     * bir boyutu yoktur; bir listenin boyutu yazma işlemlerinin bir sonucu olarak değiştirilebilir: öğe ekleme,
     * güncelleme veya kaldırma.
     *
     * Kotlin'de MutableList'in varsayılan implementasyonu, yeniden boyutlandırılabilir bir
     * array olarak düşünebileceğiniz ArrayList'tir.
     *
     * Listeler için, liste boyutunu alan constructor benzeri bir fonksiyon ve indeksine göre
     * eleman değerini tanımlayan initializer fonksiyonu vardır.
     *
     */

    val doubled = List(3) { it * 2 } // or MutableList if you want to change its content later
    println(doubled) //[0, 2, 4]
}

