package classes

/**
 * Classlar class keywordu ile olusturulur.
 * Classlarin body'si olmak zorunda degildir.
 * Classlarin body'si olmadigi durumlarda class tanimi; class className seklinde olur.
 * Classlarin body'si varsa class tanimi; class ClassName { class body } seklinde olur.
 * Classlarin kotlinde 2 tip constructoru vardir. Primary, Secondary
 *
 */

class Emp  //bos class

class EmptyClassWithBody {
    //class body
}

class ClassWithPrimaryConstructor constructor(val name: String) { //explicit primary constructor
    //class body
}

class ClassWithSecondaryConstructor(val name: String) { //primary constructor
    //class body
    constructor(name: String, age: Int) : this(name) { //secondary constructor
        //secondary constructor body
    }
}

//visibility modifier veya jvm veya hilt/dagger annotation verilecekse constructor keywordu yazmak zorundayiz.
class Car @JvmOverloads constructor(  val wheelCount: Int, color: String = "Red") {
    private val mWheelCount: Int //parametreleri yukarda const. icindede val var yazarak tanimlayabilirz.
    private val mColor = color

    /**
     * initler primary constructorlarla ayni anda calisir ama secondary lerden once calisir,
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
        kendi bodylerine sahip primary icinde bu body init'de yaziliyor diyebiliriz.
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

    // objenin propertylerine erismek icin . operatoru kullanilir.
    car0.wheelCount

}

fun String.printLog(){
    println(this)
    println("--------------------")
}
