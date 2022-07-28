package `4 Classes`

interface Print2 {
    fun onPrint()
}

open class User(val age: Int){
    open fun getUserFullName(){}
}

/**
 * arka planda asagidaki kullanim bir class icinde olur.
 * bir tip belirtmeden direk object i bir degiskene atarsak arka planda isimsi bir class olusturmus oluruz.
 * Buna teknik makalelerde kullan at class denir. Bu javadaki structure kavramina denk gelir.
 *
 * Ayrica harici dosya icerisinde direk bir degiskenede atayabiliriz class icindede kullanabiliriz.
 * Ayrica dosya icinde tek kullanirsak arka planda static olur. Hic bir yapinin membere olmadigi icin.
 *
 * objenin expression kullaniminda bir interface implement edersek veya class extend edersek,
 * degiskene tip atamaya gerek yok zaten tipini otomatik alir. Fakat hem implement edip hem extend edersek yani iki tane
 * super type atarsak, degiskene tipinin ne oldugunu vermemiz gerekir.
 *
 *
 * bir interface(Print2) asagdaki gibi parametre olarak verilirse arka planda normalde yapamadigimiz sekilde nesnesi olusturulur.
 * higher order fonksiyonlarida parametre olarak verdigimizde arka planda cagrildikca nesnesi olusturulmamasi icin inline crossline noline keywordlerini kullaniriz.
 *
 *Aslinda basitce bir degiskene bir class i esitliyormusuz ve butun class ozellliklerini kullanabiliyormusuz gibi aciklanabilir.
 *
 */
val fullName: User = object : Print2, User(23){

    val firstName = "Mustafa"
    val surName = "Unlu"

    override fun onPrint() {
        println("Full name = $firstName $surName")
    }

    override fun getUserFullName() {  //open old. icin override etmek zorunda degiliz icerisinde harici birsey yapmadigimzi icin gri uyari veriyor.
        super.getUserFullName()
    }

    override fun toString(): String {
        return "$firstName $surName"
    }
}

fun main() {
    // fullName.onPrint()  degisken tipi Print2 yapsaydik erisirdik.
    fullName.getUserFullName()  // degisken tipi User old. icin Userin memberlarina erisebiliyourz.
    //fullName.firstName  object in memberlarina asla disaridan erisemeyiz. Cunku fullName User class inin instance old icin sadece User  memberlarina erisir.
    println("Full name = $fullName")



    //  !! androidde asagidaki 2 kullanimda sikca object in expression kullanimini yapacagiz.!!
//textView.addTextWatcher(object: TextWatcher(){
//          before
//          after
//          on
//          })

// object: CountDownTimer(10000, 1000){
// override fun onTick(){}
// override fun onFinish(){}
// }




    "Mustafa".print("Unlu")
    "Mustafa" print "Unlu"
}

infix fun String.print(secondText: String){
    println(this + secondText)
}