package scope_functions

/**
 *  contextcObject.let{(it)...} return lambda result

 * let() en sık kullanılan scope fonksiyon olabilir. run() fonksiyonuna çok benzer,
 ancak bağlam nesnesini(context object) örtük(implicit) bir alıcı(receiver) olarak temsil etmek yerine,
 lambda parametresi(argumani) olarak temsil edilir yani "it" olarak.

 * Bağlam nesnesi bir argüman (it) olarak kullanılabilir. Dönüş değeri lambda sonucudur. Extensiondir.
 * let, cagri zincirlerinin sonuclarinda bir veya daha fazla fonksiyonu cagirmak icin kullanilabilir.
 * Örneğin, aşağıdaki kod, bir koleksiyondaki iki işlemin sonuçlarını yazdırır: ilk olarak map ile yazalim ;


    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers.map { it.length }.filter { it > 3 }
    println(resultList)


 * ayni ornegi let ile yazalim;


    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let {
    println(it)
    // eger istenirse daha fazla fonksiyon cagrilabilir.
    ...
        ...
            ...
    }

 * eger yukaridaki ornek gibi kod blogu tek bir fonksiyon iceriyorsa lambda yerine method referansini (::) kullanabiliriz.

    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let(::println)

 * let genellikle yalnizce null olmayan degerlerle bir kod blogu yurutmek icin kullanilir. Null olmayan bir nesne
uzerinde islemler gerceklestirmek icin, once guvenli cagri operatorunu (?.) kullan sonrada let lambdasi icinde
islemleri yap. Yani yine nullable obje uzerindeki islemlerde with kullanmak yerine let kullanilir.

    val str: String? = "Hello"
    //processNonNullString(str)       // compilation error: str can be null
    val length = str?.let {
        println("let() called on $it")
        processNonNullString(it)      // OK: 'it' is not null inside '?.let { }'
        it.length
    }

 *let kullanmanın başka bir durumuda, kod okunabilirliğini geliştirmek için
 sınırlı bir scopeda local değişkenleri kullanmaktir. Bağlam nesnesine(context object) yeni bir değişken tanımlamak için,
 varsayılan değişken olan 'it' yerine kullanılabilmesi için adını ozel olarak belirleyin. Okumakta zorlanmamak icin

    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first().let { firstItem ->   //it yerine firsItem yaptik
        println("The first item of the list is '$firstItem'")
        if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }.uppercase()
    println("First item after modifications: '$modifiedFirstItem'")

 * Güvenli arama operatörü, genellikle scope fonksiyonlarla birlikte kullanılır. Aslında, birçok Kotlin geliştiricisi,
nesne null olmadığında küçük bir kod bloğunu çalıştırmak için güvenli arama operatörüyle let()'i kullanır.

bunu yazmak yerine;
    if (payment != null) {
        orderCoffee(payment)
    }

bunu yazar;
    payment?.let { orderCoffee(it) }


 *let ile safecall yaptiktan sonra elvis operatorunu kullanabiliriz. Daha efektifi olur.

bunu yazmak yerine;
    if (payment != null) {
        orderCoffee(payment)
    } else {
        println("I can't order coffee today")
    }

bunu yazar;
    payment?.let { orderCoffee(it) } ?: println("I can't order coffee today")



 */

fun main() {

//    public inline fun <T, R> T.let(block: (T) -> R): R {
//        contract {
//            callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//        }
//        return block(this)
//    }
    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .let { titleWithoutPrefix -> "'$titleWithoutPrefix'" }
        .uppercase()
    println(newTitle)

    val title2 = "The Robots from Planet X3"
    val newTitle2 = title2
        .removePrefix("The ")
        .let { "'$it'" }
        .uppercase()
    println(newTitle2)


    //Baska bir ornek person nesnesi ile.
    Person("Alice", 20, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
    }

    //Eger let kullanmasaydik asagidaki gibi yazacaktik.
    val alice = Person("Alice", 20, "Amsterdam")
    println(alice)
    alice.moveTo("London")
    alice.incrementAge()
    println(alice)
}

class Person(name: String, age: Int, location: String) {
    fun moveTo(address: String) {
        TODO("Not yet implemented")
    }

    fun incrementAge() {
        TODO("Not yet implemented")
    }
}

//https://typealias.com/start/kotlin-scopes-and-scope-functions/