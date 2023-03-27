package functions

fun main() {
    /**
     * Uzerinde degisiklik yapamadigimiz (readOnly) siniflara, interfacelere ya da degisiklik yapmak istemedigmiz siniflara, bu siniflarin
     * icerisinde yazmadan fonksiyon tanimlayabilmemizi saglar. Boylece o sinifa uye bir fonksiyon kazandirabiliriz.
     * Bunu yaparken unutmamaniz gereken; yazdiginiz extension fonksiyon aslinda o sinifin gercek bir fonksiyonu olmayacaktir.
     *
     * Reciver diye adlandiracagimiz bir sinifa gerek duyar. Receiver extension yazacagimiz sinifi ifade eder.
     *
     * yapisal olarakljfsd
     *
     *      fun Receiver.extFun(other : HandsomeOne) : AnotherOne {
     *
     *      //hangi sinifi genisletmek istiyorsak onu yazip . koyuyoruz.
     *      (String.extPrint) gibi Stringi genisletmek istemisiz.
     *              ...
     *
     *      }
     *
     * Extension fonksiyonlar bir sinif icinde yazilirsa sinifin disindan cagirimi yapilamaz.
     * Sinif disindan cagirmak isyorsak kt dosyasi icinde yazilacaktir.
     *
     * elimizde cok buyuk class lar var ise bunlari ext ile bolerek gunu kurtarmak amacli extension yazilabilir. Ama ana problemi boyle cozemeyiz.
     */

    //normalde degiskenlere deger atayip, print islemini asagidakiler gibi yapariz.
    val pi: Double = 3 + 0.14
    println(pi)

    val schoolNumber: Int = 2
    println(schoolNumber)

    //yukaridaki kullanimlarin yerine normal bir log2 fonksiyonu yazilabilir ve asagidaki gibi kullanilabilir
    fun log2(number: Number){
        println(number)
    }
    log2(pi)
    log2(schoolNumber)


    //extension fonksiyonlar  direkt valueler uzerinden cagirilabilir.
    1341.log("")
    (3 + 0.14).log("")
    18121321321.log("")

    (3 + 0.14) log "" // hem infix hem extension kullanimi


    //istersek degiskenler uzerinden kullanabiliriz.
    schoolNumber.log("")
    pi.log("") // degisken uzerinden extension


}


    /**
     * Asagida Number (reciever) sinifina extension olarak yazilmis log fonksiyonu. Ayni zamanda infix yapilmistir.
     * illa infix olmasina gerek yoktur birden fazla parametreye ihtiyac varsa infix olmadan extension function tanimlayabiliriz.
     * this ifadesi, extension yapilan degeri verir. 3 log "4" yaparsaniz,
     * asagidaki kod size empyParam = "4", this = 3 olarak verilir.
     */
    infix fun Number.log(emptyParam: String){
    println(emptyParam + this)
}




/**
 *      Infix extension fonksiyon expression formunda kullanilabilir.
 * **/
infix fun String.extPlus(otherString: String): Int = this.toInt() + otherString.toInt()

// extension fonksiyonlar sari renkte gozukurler.
// infix fonksiyonlar,  tek parametreli extension fonksiyonlarla kullanilabilir demistik.
// extPlus infix extension oldugu icin . (nokta) kullanimina ihtiyac duymaz.

val result: Int = "3".extPlus("5") //8
val result2: Int = "2" extPlus "5" //7






