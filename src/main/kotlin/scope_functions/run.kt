package scope_functions

/***
 * contextObject.run {..(this) lambda ..} return lambda result

 * run ; with ve let birlesimi gibidir.
belli scope icinde belli business logicler yazilmis bu logiclerden sonra ayrica bazi fonksiyonlari calistirmak icin olusturulur.

 * run, lambda'nız hem nesne initialize hem de dönüş değerinin hesaplanmasını içerdiğinde kullanışlıdır.
    val service = MultiportService("https://example.kotlinlang.org", 80)

    val result = service.run {
        port = 8080
        query(prepareRequest() + " to port $port")
    }

    // the same code written with let() function:
    val letResult = service.let {
        it.port = 8080
        it.query(it.prepareRequest() + " to port ${it.port}")  //let ile yazdigimda it yazmam gerekir.
    }

 * with() in extension hali gibidir. With e gore farkli ozelliklere sahiptir.
 * Lambda içinde, context nesnesi örtük alıcı(implicit receiver) this olarak temsil edilir.
 * run() fonksiyonu, lambda'nın sonucunu döndürür.
 *

 * with() yerine run() kullanmanın bir başka avantajı,
 * context nesnesinin null olabileceği durumları işlemek için güvenli arama operatörünü(.? veya .!!) kullanabilmenizdir.
 *
 * Bir alıcı nesnesinde run çağırmanın yanı sıra, onu extension olmayan bir fonksiyon olarak kullanabilirsiniz.
Extension olmayan run, bir expression(hexNumberRegex) gerekli olduğu durumlarda birkaç statementdan oluşan bir bloğu yürütmenize olanak tanır.

    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"

        Regex("[ $sign]?[ $digits$hexDigits]+")
    }

    for (match in hexNumberRegex.findAll("+123 -FFFF !%*& 88 XYZ")) {
        println(match.value)
    }
 */

fun main() {
    val adress = Adress(
        "a",
        "Ap55",
        "Rteady",
        "TR",
        "12323645"
    )

    adress.run {
        street1 = "9801 Maple Ave"
        street2 = "Apartment 255"
        city = "Rocksteady"
        state = "IN"
        postalCode = "12345"
    }

    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .run { "'$this'" }
        .uppercase()
    println(newTitle)
}