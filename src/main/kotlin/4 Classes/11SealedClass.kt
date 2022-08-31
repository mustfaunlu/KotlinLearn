package `4 Classes`

/**
 * sinirli kumede, gruplanabilir,  class lar yazmayi saglar.
 * kisitlanmis bir class hiyerarsisi kurabilmenizi saglar.
 *
 * bu class lar arka planda static olarak tutulmazlar. Enumlardan en buyuk farki budur.
 * enumlar verileri gruplarken, sealed class lar classlari gruplar.
 *
 * Sealed classlar abstract classlardir . Abstract olduklari icin open olmazlar.
 * Sealed classlar Abstract class old icin final olamazlar.
 *
 * Sealed classlarin nesnesi olusturaulamaz.
 * contructorlari protected veya private olarak bulunur.
 *
 * sealed claslari miras alan subClasslar final old icin miras alinamazlar. Sdk icin onemli.
 *
 * Sealed class in subclasslarinin neler old compiletime'da bilinmektedir. Bundan dolayi when ve if yapisi
 * else caselerinin yazimina ihtiyac duymazlar.
 *
 * Sealed classlari extends alan subclass lar eskiden ayni dosya uzerinde bulunma zorunlulugu. vardi.
 Bu zorunluluk esnetilerek ayni package icerisinde olmaya kadar genisletildi
 Ancak ayni packade disina cikip, bir sub class a sealed class i miras olarak vermek isterseniz buna izin verilemeyecek.
 ozellikle sdk yazarken bu kisitlama onemlidir.

 * sealed classlar icerisine object tanimlamalari da yapilabilir.
 * sealed classlar icerisine sadece object tanimi yapiyorsaniz, bu kullanimin enum dan teknik olarak
 hicbir farki yoktur.

 */

sealed class Response
class Success : Response(){} // classlar kendi baslarina farkli interfaceleri implement edebilirler. class ozelliklerini kullanabilirler.
class Error : Response(){} // yani bu yapilari kendi icinde ayristirabiliriz. Enumda ise butun enum sabitleri etkileniyordu.

sealed class  Response2 {
    class Success2 : Response2(){}
    class Error2 : Response2(){}
}

fun handle(response: Response){
    when (response) {
        is Success -> {
            //responsedan gelen bilgilerle uinin doldur
        }
        is Error -> {
            //pop - up ile kullaniciya bilgi ver.
        }
    }
}

//bu yanlistir enum kullanmaniz gerekiyor. Teknik anlamda ayni isi yaparlar.
sealed class  PaymentOption {
    object Cash
    object Card
    object Transfer
}

enum class PaymentOption2 {  // bu sekilde kullanmak gerekir.
    Cash, Card, Transfer
}


fun main() {
    //val response = Response()
    val success = Success()
    val error = Error()

    handle(success)
    handle(error)

    PaymentOption2.Cash.name

}