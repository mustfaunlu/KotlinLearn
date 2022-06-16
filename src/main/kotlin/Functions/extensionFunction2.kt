package Functions

open class Shape {

    var intNumber = 0

    fun setNumber(intNumber: Int) {
        this.intNumber = intNumber
    }

    fun main() {
        intNumber.extToString()
        intNumber.log("")
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Bir sinifin icinde, farkli bir sinifa ait extension fonksiyon yazilirsa, bu sinifin icinde ayni isimde normal
     *      bir fonksiyon olsa bile, extension fonksiyonun icerisinde, ayni isme sahip fonksiyon cagrilirsa, bu extension
     *      fonksiyona isaret eder demektir. Sinifin ayni isimdeki uye fonksiyonunu extension fonksiyon icersinde cagirmak icin
     *      this@sinifismi.uyefonksiyon() seklinde cagirim yapilmalidir.
     * **/
    open fun Int.extToString() {
        println("")

        // Int.extToString() methodunu isaret eder.
        extToString()
        this.extToString() //aslinda shape class icinde gibidir ama buradaki this Int classini isaret eder.
                            // Cunku extension fonksiyon icindeyken receiver class icindeyizdir.
                            // Normal functionda this icinde old. classi isaret ederdi.
        //ama biz bu extToString i sadece Shape class i icinde kullanabiliriz. Butun projede kullanmayiz.
        //butun projede ext fun kullanmak istiyorsak globalde yazmamiz gerekiyor.



        // Shape'e ait asagidaki sekilde uye methodu isaret ederiz.
        this@Shape.extToString()

        println("Awesome class printi")
    }

    fun extToString() {
        println("Keko class printi")
    }
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      Bir sinifin, yazilmis extension fonksiyonun aynisini (isim ayni, parametre sayisi ve tipleri ayni, ayrica geri donus tipi de ayni olmali),
 *      kendi icinde barindiriyorsa, bu durumda yazilan extension fonksiyon gecersizdir. Sinifin uye fonksiyonu cagirilir.
 * **/
fun Shape.setNumber(intNumber: Int) { //pratikte ext ederek shape class i icinde old icin shape in private degiskenine bile erisebliriz.
    val result = intNumber * intNumber //fakat bu ext func gecersizdir. yok hukmendidir. classin kendi funksiyonu calisir.
    println(result)
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      Bir sinifa extension fonksiyon yazilabildigi gibi extension property de yazilabilir.
 *      Bunun sebebi aslinda property'lerin get() ve set() methodlarindan olusmasindan dolayidir.
 *      Bu extension property'lerin icerisinde field tanimlanamaz.
 *      Dolayisiyla aslinda gercek anlamda bir degisken extension yapilamaz.
 *      Bu konu property vs field konusu ile beraber sinif'lar islenirken detayli anlatilacaktir. (onemli!!)
 * **/
var Shape.type
    get() = "Rectangle"
    set(value) {
        type = value
    }

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      Open (Extend edilebilir) bir sinifa, sinifin icinde bir open (override edilebilir) extension fonksiyon yazilirsa,
 *      bu sinifi miras (inherit) alan siniflar, ilgili extension fonksiyonu override edebilirler.
 * **/
class Rectangle : Shape() {
    override fun Int.extToString() {
    }
}

class Triangle : Shape(){
    fun deneme(){
        4.extToString()
    }
}

/* -------------------------------------------------------------------------------------------------------------------*/

/**
 *      NOTES :
 *      Nullable extension function da yazilabilir.
 *      Companion object'lere de extension yazilabilir. Siniflar'da ornegini yapacagiz.
 * **/
