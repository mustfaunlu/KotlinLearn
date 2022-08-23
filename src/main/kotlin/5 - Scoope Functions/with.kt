package `5 - Scoope Functions`

// ================ with() ================

/**
with(Context object) {
Lambda
}

 **BU SEKILDE YAZMAK YERINE
address.street1 = "9801 Maple Ave"
address.street2 = "Apartment 255"
address.city = "Rocksteady"
address.state = "IN"
address.postalCode = "12345"

 **BU SEKILDE YAZARIZ
with(address) {
street1 = "9801 Maple Ave"
street2 = "Apartment 255"
city = "Rocksteady"
state = "IN"
postalCode = "12345"
}

burada address nesnesi implicit receiver(ortuk alicidir) tekrarli yazmak yerine bu sekilde scope acip
address nesnesini ortulu sekilde(this) scope icinde niteleyebiliriz.

with; halihazirda bir nesne var bu nesne nullable degilse let yerine with kullanilir.


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

    /** ustteki gibi tek tek address yazmak yerine implicit receiver olarak scope icinde yazabiliriz.*/

    with(address) {
        street1 = "9801 Maple Ave"
        street2 = "Apartment 255"
        city = "Rocksteady"
        state = "IN"
        postalCode = "12345"
    }
}
