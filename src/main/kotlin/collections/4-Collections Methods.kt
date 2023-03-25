package collections

fun main() {
    val fruits = listOf(
        "Apple",
        "Banana",
        "Cherry"
    )

    /*forEach collection icindeki her bir elemani tek tek gezer
     ayni islemi for ile de yapabiliriz forEach daha fonksiyoneldir. */

    fruits.forEach { println(it) } // her elaemani tek tek gezer ve yazdirir

    for (fruit in fruits) {
        println(fruit)
    }


    /*
    map {} collection elemanlarini transform eder
     */
    val stiurf = fruits.map { it.reversed() }


    /*
    mapNotNull {}  collection icindeki null olabilecek elemanlari atar
     */
    val strs = listOf(
        "1",
        "2",
        "three",
        "4",
        "V",
    )

    val nums: List<Int> = strs.mapNotNull {
        it.toIntOrNull()
    }

    println(nums)// [1, 2, 4]

    /*
    mapIndexed{} collection elemanlarini index ile birlikte transform eder
     */
    val fruitsWithIndex = fruits.mapIndexed { index, s -> "$index: $s" }

    /*
    filter{} collection icindeki elemanlari filtreler
    filterNot{} filtrelen collection icindeki filtrelenmemis olan elemanlari dondurur. yani negatifini
     */
    val longFruits = fruits.filter { it.length > 5 } // [Banana, Cherry]
    val shortFruits = fruits.filterNot { it.length > 5 } // [Apple]

    /*
    Hem filter hem de filterNot'un, koşulun eşleşmediği öğeleri attığını unutmayın.
    Ama belki de öğelerin "diğer yarısını" atmak istemiyoruz ve bunun yerine bunları
    ayrı bir listeye koymak istiyoruz. partition işlevinin devreye girdiği yer burasıdır.
    Partition kullanarak, filter ve filterNot'un güçlerini birleştiriyoruz.
    İlk listenin yüklemin doğru olduğu tüm öğeleri içerdiği ve ikincisinin testi
    geçemeyen tüm öğeleri içerdiği bir çift liste döndürür.
     */

    val (match, rest) = fruits.partition { it.length > 5 }  // [Banana, Cherry], [Apple]
    println(match) // [Banana, Cherry]
    println(rest) // [Apple]

    /*
    filterNotNull{} collection icindeki null olmayan elemanlari dondurur
     */
    val nullableList = listOf("Kotlin", null, "Java", null, "C++")
    val filteredList = nullableList.filterNotNull() // [Kotlin, Java, C++]

    /*
    filterIsInstance<T>{} collection icindeki belirtilen tipi dondurur
     */
    val mixedList = listOf("Kotlin", 1, 2, "Java", 3.0, "C++")
    val intList = mixedList.filterIsInstance<Int>() // [1, 2]
    val stringList = mixedList.filterIsInstance<String>() // [Kotlin, Java, C++]

    /*
    take(n) collection icindeki ilk n elemani dondurur
    takeLast(n) collection icindeki son n elemani dondurur
     */
    val numbers = (1..10).toList()
    println(numbers.take(3)) // [1, 2, 3]
    println(numbers.takeLast(3)) // [8, 9, 10]

    /*
    drop(n) collection icindeki ilk n elemani atar
    dropLast(n) collection icindeki son n elemani atar
     */
    println(numbers.drop(3)) // [4, 5, 6, 7, 8, 9, 10]
    println(numbers.dropLast(3)) // [1, 2, 3, 4, 5, 6, 7]


    /*
    sum() collection icindeki elemanlarin toplamini dondurur
    average() collection icindeki elemanlarin ortalamasini dondurur
    maxOrNull() collection icindeki elemanlarin en buyugunu dondurur
    minOrNull() collection icindeki elemanlarin en kucugunu dondurur
    count() collection icindeki elemanlarin sayisini dondurur
     */
    val numbers2 = listOf(1, 2, 3, 4, 5)
    println(numbers2.sum()) // 15
    println(numbers2.average()) // 3.0
    println(numbers2.maxOrNull()) // 5
    println(numbers2.minOrNull()) // 1
    println(numbers2.count()) // 5


    /*
    sumOf{} collection icindeki elemanlarin higher order functiondaki isleme tabi tutup toplamini dondurur
    minOf{} collection icindeki elemanlarin higher order functiondaki isleme tabi tutup en kucugunu dondurur
    maxOf{} collection icindeki elemanlarin higher order functiondaki isleme tabi tutup en buyugunu dondurur
     */
    println(numbers2.sumOf { it * 2 }) // 30 her bir elemani 2 ile carpar ve toplar
    val strNumbers = listOf("one", "two", "three", "four")
    println(strNumbers.sumOf { it.length }) // 11 uzunluklarini toplar
    println(strNumbers.minOf { it.length }) // 3 en kucuk uzunluk
    println(strNumbers.maxOf { it.length }) // 5 en buyuk uzunluk

    /*
        joinToString() collection icindeki elemanlari istenilen seperatore gore birlestirir
     */
    val numbers3 = listOf(1, 2, 3, 4, 5)
    println(numbers3.joinToString()) // 1, 2, 3, 4, 5
    println(numbers3.joinToString(separator = " | ")) // 1 | 2 | 3 | 4 | 5
    println(numbers3.joinToString(prefix = "(", postfix = ")")) // (1, 2, 3, 4, 5)
    println(numbers3.joinToString(prefix = "(", postfix = ")", separator = " | ")) // (1 | 2 | 3 | 4 | 5)


}