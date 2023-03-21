package collections

/**
 * Map (veya dictionary) bir key-value çiftleri kümesidir.
 * Key'ler benzersizdir ve her biri tam olarak bir değerle eşlenir.
 * Valueler yinelenebilir. Map'ler, örneğin bir çalışanın kimliği ve
 * pozisyonu gibi nesneler arasındaki mantıksal bağlantıları depolamak için kullanışlıdır.
 */


/**
 * Map<K, V> Collection inteface'inin bir mirasçısı değildir;
 * ancak, aynı zamanda bir Kotlin collection tipidir. Bir Map,
 * key-value çiftlerini (veya entry'leri) depolar; key'ler benzersizdir,
 * ancak farklı key'ler eşit value'lar ile eşleştirilebilir.
 * Map arayüzü, key'e göre value'a erişim, key'leri ve value'ları
 * arama gibi özel fonksiyonlar sağlar.
 */
fun main() {
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous
    numbersMap.get("key1")

/**
 * Eşit çiftleri içeren iki map, çift sırasına bakılmaksızın eşittir.
 */
val numbersMap2 = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)

println("The maps are equal: ${numbersMap2 == anotherMap}")

    /**
     * MutableMap, map yazma işlemlerine sahip bir Map'tir; örneğin,
     * yeni bir key-value çifti ekleyebilir veya verilen key ile ilişkili value'yu güncelleyebilirsiniz.
     */
    val numbersMap3 = mutableMapOf("one" to 1, "two" to 2)
    numbersMap3.put("three", 3)
    numbersMap3["one"] = 11
    println(numbersMap3)

    numbersMap3.putAll(numbersMap2)
    println(numbersMap3)

    for((k,v) in numbersMap3) {
        println("Key; $k -> Value; $v")
    }

    numbersMap3.forEach { (k, v) -> println("Key; $k -> Value; $v") }

    numbersMap3.size
    numbersMap3.count()

    numbersMap3.containsKey("one") // one key'i map icinde var mi boolean doner
    numbersMap3.containsValue(1) // 1 value'su map icinde var mi boolean doner

    if ("one" in numbersMap3) println("key control OK")

    numbersMap3.remove("one")

    //keyleri alfabetik siraya gore siralar, geriye
    val map = mapOf(Pair("c", 3), Pair("b", 2), Pair("d", 1))
    val sorted = map.toSortedMap()
    println(sorted.keys) // [b, c, d]
    println(sorted.values) // [2, 3, 1]


    //filter
    val map2 = mapOf(Pair("c", 3), Pair("b", 2), Pair("d", 1))
    val filtered = map2.filter { (key, _) -> key > "b" }
    println(filtered) // {c=3, d=1}

    //filterValues
    val map3 = mapOf(Pair("c", 3), Pair("b", 2), Pair("d", 1))
    val filteredValues = map3.filterValues { it > 1 }
    println(filteredValues) //{c=3, b=2}

    //filterKeys
    val map4 = mapOf(Pair("c", 3), Pair("b", 2), Pair("d", 1))
    val filteredKeys = map4.filterKeys { it > "b" }
    println(filteredKeys) // {c=3, d=1}

    //map  list doner geriye
    val map5 = mapOf(Pair("c", 3), Pair("b", 2), Pair("d", 1))
    val mapped = map5.map { (key, value) -> key to value * 2 }
    println(mapped) // [(c, 6), (b, 4), (d, 2)]

}