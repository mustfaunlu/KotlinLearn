package `5 - Scoope Functions`

/**
 * contextobject.also{..(it) ..} return contextObject

 * Property ve fonksiyonlardan ziyade bir obje referansi icin kullanilir veya bir dis scopedan this referansini
shadowlamamak icin kullanilir.

 * belli biseyler yaptin ve ayrica(also) nesne(contextobject) ile asagidakileride(lambda icindekileri) yap gibi bir anlami vardir.

 * Zincirin o noktasindaki degeri degistirmeden yan tarafta bir seyler yapmak istiyorsan,
 bu, onu bir çağrı zincirine eklemek için harika bir seçim yapar.

 * genellikle let with apply fonksiyonlarindan birine zincirlemek icin kullanilir.

 */
fun main() {
    val numbers = mutableListOf("one", "two", "three")
    numbers
        .also { println("The list elements before adding new one: $it") }
        .add("four")
}