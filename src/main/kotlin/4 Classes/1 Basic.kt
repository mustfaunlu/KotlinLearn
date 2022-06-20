package `4 Classes`

class Car constructor(wheelCount: Int, color: String = "Red") { //primary const. constructo yazmamiza gerek yok
    private val mWheelCount: Int
    private val mColor = color


    /**
     * initler constructorlarla beraber calisir ama secondary lerden once calisir,
     * bekledigi parametreleri verirsem hep init calisacak.
     * Harici primaryde bulunmayan baska parametre veriyorsam yine init calisir
     * ama devaminda hangi const uygun parametre verildiyse o calisacak.
     *
     * kotlinde butun secondary const. lar mecburen primary i isaret etmelidir. this ile yapiyourz. miras aliyor gibi
     */

    init {
        mWheelCount = wheelCount
        "primary const. created".printLog()
        "WheelCount: $mWheelCount, Color: $mColor.printLog()"
    }

    constructor(name: String) : this(4) {             //parametreleri farkli olan secondary const. lar boyle olusturulur.
        "1. secondary const. created".printLog()
    }

    constructor(name: String, madeOf: String) : this(4) {
        "2. secondary const. created".printLog()
    }
}

fun main() {
    val car0 = Car(4) //car0 nesnesini Car classindan olusturduk
    val car1 = Car(4, "blue")
    val car2 = Car("blue", "Metal")
    val car3 = Car("Ferrari")

}

fun String.printLog(){
    println(this)
    println("--------------------")
}

