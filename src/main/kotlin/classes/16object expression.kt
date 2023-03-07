package classes

interface Print2 {
    fun onPrint()
}

open class User(val age: Int){
    open fun getUserFullName(){}
}

/**
 *
 * herhangi bir yapiya ait degiskenlerin icine bir class i atayabilmemize expression kullanim denir.
 * bir tip belirtmeden direk object i bir degiskene atarsak arka planda isimsiz  Any den miras alan bir class olusturmus oluruz.
 * Buna teknik makalelerde kullan at class denir. Bu javadaki structure kavramina denk gelir.
 * objenin expression kullaniminda bir interface implement edersek veya class extend edersek,
 * degiskene tip atamaya gerek yok zaten tipini otomatik alir. Fakat hem implement edip hem extend edersek yani iki tane
 * super type atarsak, degiskene tipinin ne oldugunu vermemiz gerekir.
 *
 *
 * Ayrica harici dosya icerisinde direk bir degiskenede atayabiliriz class icindede kullanabiliriz.
 Asagidaki fullname ornegindeki gibi dosya icinde tek kullanirsak arka planda static olur.
 Hic bir yapinin membere olmadigi icin. Uygulamanin hayati boyunca memoryde tutulur bu sikinti yaratabilir.
 Gerekli durumlarda dosya icinde tek basina kullanilmalidir haricinde class icinde veya baska bir supertype icinde kullanilmalidr.
 *

 *
 *
 * bir interface(Print2) asagdaki gibi implement edilirse arka planda normalde yapamadigimiz sekilde nesnesi olusturulur.
 * higher order fonksiyonlarida parametre olarak verdigimizde arka planda cagrildikca nesnesi olusturulmamasi icin inline crossline noline keywordlerini kullaniriz.
 *
 *Aslinda basitce bir degiskene bir class i esitliyormusuz ve butun class ozellliklerini kullanabiliyormusuz gibi aciklanabilir.
 *
 */


    val helloWorld = object {
        val hello = "Hello"
        val world = "World"
        // object expressionlar arka planda Any'yi extend eder,
        // bu nedenle Any'den gelen `toString()` methodunu override edebilri.
        override fun toString() = "$hello $world"
    }



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
    print(helloWorld)


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


    val instanceofC = C()
    instanceofC.printX()
}

/*
Eğer anonim object bir local veya private bir bildirim olarak (fonksiyon veya property) kullanılırsa,
nesnenin tüm üyeleri bu fonksiyon veya property'e erişilebilir hale gelir. Ancak, bu fonksiyon veya
property, public veya private bir inline olarak belirtilmişse, gerçek türü şu şekilde olacaktır:

Anonim nesnenin bildirilmiş bir üst türü yoksa, gerçek türü Any'dir.
Eğer sadece bir bildirilmiş üst tür varsa, anonim nesnenin bildirilmiş üst türüdür.
Birden fazla bildirilmiş üst tür varsa, açıkça bildirilen türdür.
Bu durumlarda, anonim nesneye eklenen üyelere erişilemez. Ancak, eğer ezilmiş üyeler gerçek türde belirtilmişse erişilebilirdirler.
 */
open class C {
    private var xx =  object {
          fun onPrint() {
            println("x")
        }
    }


    private var getObject= object { //public yaparsak printX icinde erisemeyiz kotlin izin vermez cunku tipi any'e cast eder.
        val x: String = "x"
    }

    fun printX() {
        println(getObject.x)
        println(xx.onPrint())
    }
}

