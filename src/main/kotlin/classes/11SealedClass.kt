package classes

import java.lang.Exception

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
 * Sealed classlarin nesnesi olusturulamaz.
 * contructorlari default olarak protected tutulur. privateda olabilir. Public ve internal olamaz.
 *
 * sealed claslari miras alan subClasslar final old icin miras alinamazlar. Sdk icin onemli.
 *
 * Sealed class in subclasslarinin neler old compiletime'da bilinmektedir. Bundan dolayi when ve if yapisi
else caselerinin yazimina ihtiyac duymazlar.
 *
 * Sealed classlari extends alan subclass lar eskiden ayni dosya uzerinde bulunma zorunlulugu vardi.
 Bu zorunluluk esnetilerek ayni package icerisinde olmaya kadar genisletildi
 Ancak ayni packade disina cikip, bir sub class a sealed class i miras olarak vermek isterseniz buna izin verilemeyecek.
 ozellikle sdk yazarken bu kisitlama onemlidir.

 * sealed classlar icerisine object tanimlamalari da yapilabilir.
 * sealed classlar icerisine sadece object tanimi yapiyorsaniz, bu kullanimin enum dan teknik olarak
 hicbir farki yoktur.

 */

sealed class Response // suslu parantezsizde olabilir.
class Success : Response() // classlar kendi baslarina farkli interfaceleri implement edebilirler. class ozelliklerini kullanabilirler.
class Error : Response() // yani bu yapilari kendi icinde ayristirabiliriz. Enumda ise butun enum sabitleri etkileniyordu.
class Loading: Response()

sealed class  Response2 { //parantezli hali.
    class Success2 : Response2(){}
    class Error2 : Response2(){}
}

//Genel kullanim asagidaki gibidir.
fun handle(response: Response){
    when (response) {
        is Success -> {
            //responsedan gelen bilgilerle uinin doldur
        }
        is Loading -> {
            //loading animasyonu baslat
        }

        is Error -> {
            //pop - up ile kullaniciya bilgi ver.
        }
    }
}

//asagidaki kullanim yanlistir enum kullanmaniz gerekiyor. Teknik anlamda ayni isi yaparlar.
sealed class  PaymentOption {
    object Cash
    object Card
    object Transfer
}

enum class PaymentOption2 {  // sealed icine objectler yerine bu sekilde kullanmak gerekir.
    Cash, Card, Transfer
}



//ayrida sealed class'in subclasslarini farkli cesitlerde tanimlayabiliriz.
class Result
sealed class Response3{
    data class Success(val result:Result ): Response3()
    object Loading: Response()
    data class Error(val exception: Exception): Response()
}


fun main() {
    //val response = Response() // sealed classlarin nesnesi olusturulamaz.
    val success = Success()
    val error = Error()

    handle(success)
    handle(error)

    PaymentOption2.Cash.name

}