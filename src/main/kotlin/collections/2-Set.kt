package collections


fun main() {
/**
 * Set<T> benzersiz elemanları saklar; bunların sırası genellikle tanımsızdır.
 * null elemanlar da benzersizdir: bir Set yalnızca bir null içerebilir.
 * İki set aynı boyuta sahipse eşittir ve bir setin her elemanı için diğer sette eşit bir eleman vardır.
 *
 */

    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}") //Number of elements: 4
    if (numbers.contains(1)) println("1 is in the set") //1 is in the set

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}") //The sets are equal: true

    /**
     * MutableSet, MutableCollection'dan türetilmiştir ve Set'e özgü yazma işlemlerine sahiptir.
     * MutableSet'in varsayılan implementasyonu - LinkedHashSet - eleman ekleme sırasını korur. Bu
     * nedenle, first() veya last() gibi sıraya dayanan işlevler, bu tür setlerde öngörülebilir sonuçlar döndürür.
     *
     */

    val numbers3 = setOf(1, 2, 3, 4)  // LinkedHashSet is the default implementation
    val numbersBackwards3 = setOf(4, 3, 2, 1)

    println(numbers3.first() == numbersBackwards3.first())
    println(numbers3.first() == numbersBackwards3.last())

    /**
     * Alternatif bir uygulama olan HashSet, öğelerin sırası hakkında hiçbir şey söylemez,
     * bu nedenle üzerinde bu tür işlevleri çağırmak öngörülemeyen sonuçlar döndürür.
     * Ancak, HashSet aynı sayıda öğeyi saklamak için daha az bellek gerektirir.
     *
     */

}

