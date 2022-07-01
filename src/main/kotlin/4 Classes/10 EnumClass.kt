package `4 Classes`

/**
 * Tip guvenligini (type-safety) saglar.
 * Kullanim amaci ayni veri kumelerinin gruplanabilir olmasini saglar.
 * Opsiyonlarin tamaminin neler oldugunu rahatca gorebilmemizi saglar.
 *
 * abstract, open, inner , sealed olamazlar.
 * yapisi geregi zaten final dirlar. final keyword u kullanmak redundant uyarisi verir.
 *
 * ozunde class olduklari icin, constructor kullanbilirler ve bu constructor icersinde veri tutabilirler.
 * java karsiliginda bu enum sabitleri static final classlar seklinde tutulurlar.
 * bu sayede kullanirken bu sabitlerin nesnesini olusturmak zorunda kalmayiz.
 *
 * enum classlarinin nesnesi olusturulamaz.
 *
 * tum enum sabitleri, ana enum classi miras alir. Miras aldiklari icin enum sabitleri, interface i implement eden ana enum clasinin functionunu override edebliir
 *
 * Her enum sabiti final name:String ve final ordinal:Int degiskenlere default olarak sahiptir.
  name ifadesi, enumin kendinin string halini verir.
  ordinal ifadesi, enumdaki sabitin indexini verir ve 0 dan baslar.
  bu degiskenler final olduklari icn, enum sabitleri icersinde override edukenezker,
 *
 * enum classlar herhangi bir baska class i miras alamazlar.
 * enum classlar herhangi bir  interface i impelement edeblirler.
 *
 * enum classlar abstract propertyler ya da abstract func. lar alabilirler
 * bunlari aldiklarinda tum sabitler bu abstract yapilari override etmek zorundadir.
 *
 * bir open function da yazilabilir. open func  olmasindan dolayi override etme zorunlulugu yoktur.
 * ancak open olarak belirtilen func.nun bodysi olmak zorundadir.
 */

interface TeamsFunctionality {
    fun practice()
}

enum class ColorType{
    RED, BLUE, WHITE, GREEN  //opsiyonlarin tamamini rahatca goruyoruz.
}


enum class TeamsType(val starCount: Int){
    FB(3), //arka planda aslinda bunlar static classdir. static final class FB extends TeamsType
    GS(4), //arka planda aslinda bunlar static classdir.
    BJK(4), //arka planda aslinda bunlar static classdir.
    TRABZONSPOR(2) //arka planda aslinda bunlar static classdir.
}

enum class Teams(val starCount: Int) : TeamsFunctionality{ //constructo acabiliyoruz. val ya da var yapmamiz lazim cunku disardan erismek isteriz.
    FB(3){ //arka planda aslinda bunlar static classdir.
        override fun practice() {
            TODO("Not yet implemented")
        }
    },
    GS(4){ //arka planda aslinda bunlar static classdir.
        override fun practice() {
            TODO("Not yet implemented")
        }
    },
    BJK(4){ //arka planda aslinda bunlar static classdir. static final class BJK extends Teams seklinde tutulurlar.
        override fun practice() {
            TODO("Not yet implemented")
        }
    },
    TRABZONSPOR(2){ //arka planda aslinda bunlar static classdir.
        override fun practice() {
            TODO("Not yet implemented")
        }
    }

}

enum class DaysOfWeek (val dayNumber: Int){
    PZT(1){   //toString yapmak yerine name attribute kullanmak mantikli burda ornegimiz keko
        override fun toString(): String {
            return "Pazartesi"
        }
    },
    SAL(2){ //DaysOfWeek.PZT.name versekte toStringini vercek
        override fun toString(): String {
            return "Sali"
        }
    },
    CAR(3){
        override fun toString(): String {
            return "Carsamba"
        }
    },
    PER(4){
        override fun toString(): String {
            return "Persembe"
        }
    },
}

enum class Sex {
    Male {
        override val typeCount: Int
            get() = TODO("Not yet implemented")

        override fun isOptional() {
            TODO("Not yet implemented")
        }

        override fun log() {
            super.log()
            println("Male")
        }
    },
    Female {
        override val typeCount: Int
            get() = TODO("Not yet implemented")

        override fun isOptional() {
            TODO("Not yet implemented")
        }

        override fun log() {
            println("Female")
        }

    },
    Other {
        override val typeCount: Int
            get() = TODO("Not yet implemented")

        override fun isOptional() {
            TODO("Not yet implemented")
        }

    };

    //abstractlar alt classlarda mecburen override edilmek zorunda old icin enum sabitlerinde override ediyourz
    // cunku enum sabitleri Sex enum class inin child classlaridir.

    abstract val typeCount: Int
    abstract fun isOptional()
    open fun log(){} // open ise override zorunlulugu yoktur
}

fun main() {
    //eger enumlar olmasaydi boyle tektek yazacaktik ve bir when case yazdigmizda tek tek ugrasacaktik
    val fb = "FB"
    val gs = "GS"
    val bjk = "BJK"

    val pzt = "Pazartesi"
    val sal = "Sali"

    val male = "Male"
    val female = "Female"

    println("4 buyuk takimdan birini yaziniz: ")
    val team: String = readln()



    println(DaysOfWeek.CAR.name)
    println(DaysOfWeek.CAR.ordinal)
}