package collections

/**
 * Bir koleksiyon genellikle aynı türden bir dizi nesne (bu sayı sıfır da olabilir) içerir.
 Bir koleksiyondaki nesnelere element veya item denir. Örneğin, bir bölümdeki tüm öğrenciler,
 yaş ortalamalarını hesaplamak için kullanılabilecek bir koleksiyon oluşturur.

 * Aşağıdaki koleksiyon türleri Kotlin için geçerlidir:

 * List, elementlere konumlarını gösteren integer sayılar olan indislerle erişilebilen sıralı bir
  koleksiyondur. Elementler bir listede birden fazla kez yer alabilir. Bir liste örneği telefon
  numarasıdır: bir grup rakamdır, sıraları önemlidir ve tekrar edebilirler.

 * Set(küme), benzersiz öğelerden oluşan bir koleksiyondur. Kümenin matematiksel soyutlamasını yansıtır:
  tekrarı olmayan bir grup nesne. Genel olarak, set elemanlarının sırasının bir önemi yoktur. Örneğin,
  piyango biletlerindeki sayılar bir küme oluşturur: benzersizdirler ve sıraları önemli değildir.

 * Map (veya dictionary) key-value çiftlerinden oluşan bir kümedir. Key'ler benzersizdir ve her biri tam
  olarak bir value ile eşleşir. Valueler birbirinin kopyası olabilir. Map'ler nesneler arasındaki mantıksal
  bağlantıları saklamak için kullanışlıdır, örneğin bir çalışanın ID'si ve pozisyonu gibi.


 * Kotlin, koleksiyonları içlerinde depolanan nesnelerin tam türünden bağımsız olarak manipüle etmenizi sağlar.
  Başka bir deyişle, bir String listesine bir String eklersiniz, tıpkı Int veya kullanıcı tanımlı bir sınıfla
  yaptığınız gibi. Dolayısıyla Kotlin Standart Kütüphanesi, her türden koleksiyon oluşturmak, doldurmak ve
  yönetmek için generic interface'ler, sınıflar ve fonksiyonlar sunar.


 * Bir koleksiyonun türünü belirtmek için, koleksiyonun türünü belirten bir interface kullanılır. Örneğin,
bir String listesi oluşturmak için List<String> kullanılır. Bir String kümesi oluşturmak için Set<String>
kullanılır. Bir String-Int çiftlerinden oluşan bir map oluşturmak için Map<String, Int> kullanılır.

 *Kotlin Standart Kütüphanesi temel koleksiyon türleri için implementasyonlar sağlar: setler, listler ve mapler.
 Her koleksiyon türünü bir çift interface temsil eder:
 *
 * 1-Koleksiyon elementlerine erişim için operasyonlar sağlayan read-only interface. List, Set ve Map
 *
 * 2-İlgili read-only interface'i yazma işlemleri ile extend eden bir mutable interface: elementlerini ekleme, kaldırma ve güncelleme.
 *   MutableList, MutableSet ve MutableMap.
 **/


/**
 * Mutable bir koleksiyonu değiştirmenin onun bir var olmasını gerektirmediğini unutmayın: yazma
 işlemleri aynı mutable koleksiyon nesnesini değiştirir, bu nedenle referans değişmez. Yine de,
 bir val koleksiyonunu yeniden atamaya çalışırsanız, bir derleme hatası alırsınız.
 *
 */
fun main() {
    val numbers = mutableListOf("one", "two", "three", "four")
    numbers.add("five")   // this is OK
    println(numbers) //[one, two, three, four, five]
    //numbers = mutableListOf("six", "seven")      // compilation error


 //Collection ornekleri
 val stringList = listOf("one", "two", "one")
 printAll(stringList)

 val stringSet = setOf("one", "two", "three")
 printAll(stringSet)


//MutableCollection ornekleri
 val words = "A long time ago in a galaxy far far away".split(" ")
 val shortWords = mutableListOf<String>()
 words.getShortWordsTo(shortWords, 3)
 println(shortWords) //[A, in, a, far, far]


}

/**
 * Read-only  koleksiyon türleri ortak değişkendir(covariant). Bu, bir Rectangle sınıfı Shape'ten miras alıyorsa,
 List<Shape>'in gerekli olduğu her yerde bir List<Rectangle> kullanabileceğiniz anlamına gelir. Başka bir deyişle,
 koleksiyon türleri, öğe türleriyle aynı subtyping ilişkisine sahiptir. Map'ler value tipinde kovaryanttır, ancak
 key tipinde kovaryant değildir.

 * Buna karşılık, mutable koleksiyonlar kovaryant(ortak değişken) değildir; aksi takdirde, bu runtime hatalarına
 yol açacaktır. MutableList<Rectangle>, MutableList<Shape>'in bir subtype'ı olsaydı, içine başka Shape inheritor'ları
 (örneğin, Circle) ekleyebilir ve böylece Rectangle tip argümanını ihlal edebilirdiniz.
 *
 */


/**
 * Collection<T>, koleksiyon hiyerarşisinin köküdür. Bu interface, read-only bir koleksiyonun ortak davranışını
 * temsil eder: size alma, öğe üyeliğini kontrol etme, vb. Collection, öğeleri yinelemeye yönelik işlemleri
 * tanımlayan Iterable<T> interface'inden miras alır. Collection'ı farklı koleksiyon türlerine uygulanan bir
 * fonksiyonun parametresi olarak kullanabilirsiniz. Daha özel durumlar için Collection'ın mirasçılarını kullanın: List ve Set.
 *
 */

fun printAll(strings: Collection<String>) { // Arguman olarak Collection'i miras alan List ve Set kullanılabilir.
 for(s in strings) print("$s ")
 println()
}

/**
 * MutableCollection<T>, Collection<T> interface'ini extend eder ve koleksiyonun yazma işlemlerini tanımlar.
 */
fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
 this.filterTo(shortWords) { it.length <= maxLength }
 // throwing away the articles
 val articles = setOf("a", "A", "an", "An", "the", "The")
 shortWords -= articles
}

