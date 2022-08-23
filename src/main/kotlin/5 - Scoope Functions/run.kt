package `5 - Scoope Functions`

/***
 * run ; with let birlesimi gibidir. elimizde bir degisken var ama bu degisken nullable degil.
belli scope icinde belli fonksiyonlari calistirmak icin olusturulur.

contextobject.run {.. lambda ..}
with() in extension hali gibidir. With e gore farkli ozelliklere sahiptir.
Lambda içinde, context nesnesi örtük alıcı(implicit receiver) olarak temsil edilir.
run() fonksiyonu, lambda'nın sonucunu döndürür.

with() yerine run() kullanmanın bir başka avantajı,
context nesnesinin boş olabileceği durumları işlemek için güvenli arama operatörünü(.? veya .!!) kullanabilmenizdir.
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