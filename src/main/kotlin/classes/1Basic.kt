package classes

//primary const.da constructor keywordunu yazmamiza gerek yok
//visibility modifier veya jvm annotation verilecekse constructor yazmak zorundayiz.
class Car constructor( val wheelCount: Int, color: String = "Red") {
    private val mWheelCount: Int //parametreleri yukarda const. icindede val var yazarak tanimlayabilirz.
    private val mColor = color

    /**
     * initler constructorlarla beraber calisir ama secondary lerden once calisir,
     * bekledigi parametreleri verirsem hep init calisacak.
     * Harici primaryde bulunmayan baska parametre veriyorsam yine init calisir
     * ama devaminda hangi const uygun parametre verildiyse o calisacak.
     *
     * kotlinde butun secondary const. lar mecburen primary i isaret etmelidir. this ile yapiyourz. miras aliyor gibi
     * primaryde constructor bos verilmisse  secondary constructorlara this yazmaya gerek yoktur.
     */

    init {
        /*
        aslinda init'i primary constructorin parantezleriymis gibi
        degerlendirebiliriz. Mesela asagidaki secondary constructorlar
        kendi bodylerine sahip primary icinde bu body initde yaziliyor diyebiliriz.
         */
        mWheelCount = wheelCount
        "primary const. created".printLog()
        "WheelCount: $mWheelCount, Color: $mColor.printLog()"
    }

    constructor(name: String) : this(4) {   //parametreleri farkli olan secondary const. lar boyle olusturulur.
        "1. secondary const. created".printLog()
    }

    constructor(name: String, madeOf: String) : this(4) {  //secondary const. lar olustururken this ile primary const. isaret etmeliyiz.
        "2. secondary const. created".printLog()
    }


}

fun main() {
    val car0 = Car(4) // primary const.daki opsiyonel color parametresini kullanmadan nesne olusturduk.
    val car1 = Car(4, "blue") // primary const kullanilarak olusturulan nesne
    val car2 = Car("blue", "Metal") //2. secondary const. kullanilarak olusturulan nesne.
    val car3 = Car("Ferrari") //1. secondary const kullanilarak nesnes olusturuldu

}

fun String.printLog(){
    println(this)
    println("--------------------")
}

/**
 * class body'si bos ise asagidaki gibi class tanimi yapilabilir
 * asagidaki class'inda primary const. vardir. implicit bir sekildedir.
 *
 */
class Empty

