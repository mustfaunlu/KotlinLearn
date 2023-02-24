package classes

/**
 * Tip guvenligini (type-safety) saglar.
 * Kullanim amaci ayni veri kumelerinin gruplanabilir olmasini saglar.
 * Opsiyonlarin tamaminin neler oldugunu rahatca gorebilmemizi saglar.
 *
 * veri tasima cekme icin kullanilmamali statik degerlerin gruplarinda kullanilmali.
 *
 * abstract, open, inner , sealed olamazlar.
 * yapisi geregi zaten final dirlar. final keyword u kullanmak redundant uyarisi verir.
 *
 * ozunde class olduklari icin, constructor kullanbilirler ve bu constructor icersinde veri tutabilirler.
 * java karsiliginda bu enum sabitleri enum icinde static final classlar seklinde tutulurlar.
bu sayede kullanirken bu sabitlerin nesnesini olusturmak zorunda kalmayiz.
 *
 * enum classlarinin nesnesi olusturulamaz.
 *
 * tum enum sabitleri, ana enum classi miras alir. Miras aldiklari icin enum sabitleri, interface i implement eden ana enum clasinin functionunu override edebliir
 *
 * Her enum sabiti final name:String ve final ordinal:Int degiskenlere default olarak sahiptir.
  name ifadesi, enumin kendinin string halini verir.
  ordinal ifadesi, enumdaki sabitin indexini verir ve 0 dan baslar.
  bu degiskenler final olduklari icn, enum sabitleri icersinde override edilemezler.

 * enum classlar herhangi bir baska class i miras alamazlar.
 * enum classlar herhangi bir  interface i impelement edeblirler.
 *
 * enum classlar abstract propertyler ya da abstract func. lar alabilirler
bunlari aldiklarinda tum sabitler bu abstract yapilari override etmek zorundadir.
bir open function da yazilabilir. open func  olmasindan dolayi override etme zorunlulugu yoktur.
ancak open olarak belirtilen func.nun bodysi olmak zorundadir.
 */

interface TeamsFunctionality {
    fun practice()
}

enum class ColorType{
    RED, BLUE, WHITE, GREEN  //opsiyonlarin tamamini rahatca goruyoruz.
}


enum class TeamsType(val starCount: Int){
    FB(3), //arka planda aslinda bunlar static classdir, static final class FB extends TeamsType seklindedir.
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

    val starCount = when (team) {
        fb -> 3
        bjk -> 2
        gs -> 4
        else -> return
    }

    //olmasi gereken ise budur. Yukarda yildiz sayisi degisirse tek tek uygulamayi tarayip yildiz sayisi degistirecegiz.
    // asagidaki gibi enum class tanimlayip name parametresi ile ulasirsak tek bi yerden yildiz sayisini degistirecegiz.
    //temiz bir kod olmus olacak.
    val starCount2 = when(team){
        Teams.BJK.name.uppercase() -> {Teams.BJK.starCount}
        Teams.GS.name.uppercase() -> {Teams.GS.starCount}
        Teams.FB.name.uppercase() -> {Teams.FB.starCount}
        else -> {return}
    }

    println(DaysOfWeek.CAR.name)
    println(DaysOfWeek.CAR.toString()) // toString i eger custom yapacaksak kullanmaliyiz. aksi taktirde name kullanilmali
    println(DaysOfWeek.CAR.ordinal)

    Teams.valueOf("BJK") // BJK degeri enum olarak yoksa, error firlatir.
    Teams.values() // Teams icerisindeki tum enum constantlarini bir liste halinde doner.

    val bestTeam = getBestTeam(Teams.BJK)
}
fun  getBestTeam(team: Teams): Teams{
    return team
}
/**
 * burada parametre olarak Teams enum classini aldik. Ve main icinde Teams.BJK yi verdik.
 * bunu yapabilmezi saglayan olay aslinda enum sabiti olan BJK nin arka planda Teams i miras aliyor olmasidir.
 * Burada Teams super type old. icin onu miras alan class larida parametre olarak verebiliyoruz.


 * !!Ayrica biz Teams a,  TeamsFunctionality interface ini implement ettik. Eger isteseydik buraya TeamsFunctionality
 * interface ini parametre olarak verip onu implement eden butun classlara erisim saglayabilirdik.
 * Yani parametre yerine TeamsFunctionality implement eden butun classlari ve instance larini yazabilirdik.
 * Iste bu yorumu yapabilmek icin OOP yi iyi anlamak gerekiyor.
 *
 * Kisaca; supertype olan herhangi bir parametre varsa child classini eger interface ise onu implement eden harici classlari
 parametre olarak vermemizi saglatir. Bu classlarin ve interface lerin oortak ozellegidir.

 Mesela iki classida parametre olarak vermek istiyorsa o iki classin ortak olarak implement ettigi interface var ise
 parametre yerine interface yazip fonksiyonu kullanirken interfaci implement eden classlari verebilirz.
 */


