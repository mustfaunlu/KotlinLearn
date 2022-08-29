package `5 - Scoope Functions`

// ================ with() ================

/**
    with(Context object) { (this)
        Lambda
    } return lambda result
    * with; halihazirda bir nesne var, bu nesne nullable degilse let yerine with kullanilir.
     * Extension degildir, context object arguman(parametre) olarak verilir.
     * lambda icinde bir receiver(this) olarak kullanilir.
     * return degeri lambdanin sonucudur. Yani lambdanin son satirini dondurur.
     * with i basitce aciklamak gerekirse; 'bu nesne(contextobject) ile(with) asagidakileri(lambda icindekileri) yap'
    gibi bir anlami vardir.with(nesne) {bunlari yap}

        val numbers = mutableListOf("one", "two", "three")
        with(numbers) {
            println("'with' is called with argument $this")
            println("It contains $size elements")
        }

     * with için başka bir kullanım durumu, propertyleri veya fonksiyonlari bir değeri hesaplamak için kullanılacak
    bir yardımcı nesneyi tanimlamaktir.

        val numbers = mutableListOf("one", "two", "three")
        val firstAndLast = with(numbers) {
            "The first element is ${first()}," +
            " the last element is ${last()}"
        }
        println(firstAndLast)

    * bir nesneye ait fonksiyonlari veya propertyleri gruplayarak cagirmaya yarar. ornegi asagida.
 */
class Adress(var street1: String, var street2: String, var city: String, var state: String, var postalCode: String)

fun main() {


    val address = Adress(
        "Ataturk Sok",
        "Apartment 111",
        "Ankara",
        "TR",
        "06100"
    )

    address.street1 = "9801 Maple Ave"
    address.street2 = "Apartment 255"
    address.city = "Rocksteady"
    address.state = "IN"
    address.postalCode = "12345"

    /** ustteki gibi tek tek address yazmak yerine implicit receiver olarak scope icinde yazabiliriz.
     * burada address nesnesi implicit receiver(ortuk alicidir) tekrarli yazmak yerine bu sekilde scope acip
    address nesnesini ortulu sekilde(this) scope icinde niteleyebiliriz.
     * */

    with(address) {
        street1 = "9801 Maple Ave"
        street2 = "Apartment 255"
        city = "Rocksteady"
        state = "IN"
        postalCode = "12345"
    }
}
