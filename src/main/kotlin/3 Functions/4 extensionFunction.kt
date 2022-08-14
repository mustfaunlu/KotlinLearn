package `3 Functions`

fun main() {
    /**
     * uzerinde degisiklik yapamadigimiz (readOnly) siniflara, ya da yapmak istemedigmiz siniflara, bu siniflarin
     * icerisinde yazmadan fonksiyon tanimlayabilmemizi saglar. Boylece o sinifa uye bir fonksiyon kazandirabiliriz.
     * Bunu yaparken unutmamaniz gereken; yazdiginiz extension fonksiyon aslinda o sinifin gercek bir fonksiyonu olmayacaktir.
     *
     * Reciver diye adlandiracagimiz bir sinifa gerek duyar. Extension yazacagimiz sinifi ifade eder.
     *
     * yapisal olarak;
     *
     *      fun String.extPrint(handsomeValue : HandsomeOne) : Unit {
     *
     *      //hangi sinifi buyutmek istiyorsak onu yazip . koyuyoruz.
     *      (String.extPrint) gibi Stringi genisletmek istemisiz.
     *              ...
     *
     *      }
     *
     * elimizde cok buyuk class lar var ise bunlari ext ile bolerek gunu kurtarmak amacli extension yazilabilir. Ama ana problemi boyle cozemeyiz.
     */

    //normalde degiskenlere deger atayip, print islemini asagidakiler gibi yapariz.
    val pi: Double = 3 + 0.14
    println(pi)

    val schoolNumber: Int = 2
    println(schoolNumber)

    //yukaridaki kullanimlarin yerine normal bir log2 fonksiyonu yazilabilir ve asagidaki gibi kullanilabilir
    log2(pi)
    log2(schoolNumber)


    //extension fonksiyonlar ister direkt valueler uzerinden cagirilabilir.
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

fun log2(number: Number){
    println(number)
}


/**
 *      Infix extension fonksiyon expression formunda kullanilabilir.
 * **/
infix fun String.extPlus(otherString: String): Int = this.toInt() + otherString.toInt()

// extension fonksiyonlar sari renkte gozukurler.
// infix fonksiyonlar extension fonksiyonlarla kullanilabilir demistik.
// extPlus infix extension oldugu icin . (nokta) kullanimina ihtiyac duymaz.

val result: Int = "3".extPlus("5") //8
val result2: Int = "2" extPlus "5" //7






