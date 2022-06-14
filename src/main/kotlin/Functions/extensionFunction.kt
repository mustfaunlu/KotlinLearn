package Functions

fun main() {
    /**
     * uzerinde degisiklik yapamadigimiz (readOnly) siniflara, ya da yapmak istemedigmiz siniflara, bu siniflarin
     * icerisinde yazmadan fonksiyon tanimlayabilmemizi saglar. Boylece o sinifa uye bir fonksiyon kazandirabiliriz.
     * Bunu yaparken unutmamaniz gereken; yazdiniz extension fonksiyon aslinda o sinifin gercek bir fonksiyonu olmayacaktir.
     *
     * Reciver diye adlandiracagimiz bir sinifa gerek duyar. Extension yazacagimiz sinifi ifade eder.
     *
     * yapisal olarak;
     *
     *      fun String.extPrint(handsomeValue : HandsomeOne) : Unit {
     *
     *      //hangi sinifi buyutmek istiyorsak onu yazip . koyuyoruz. (String.extPrint) gibi Stringi genisletmek istemisiz.
     *              ...
     *
     *      }
     */

    val pi: Double = 3 + 0.14
    println(pi)

    val schoolNumber: Int = 2

    schoolNumber.log("")

    log2(pi)  // normal fun ile

    (3 + 0.14).log("")  //infix ve extension ile
    pi.log("") // degisken uzerinden extension

}


    /**
     * Number (reciever) sinifina extension olarak yazilmis log fonksiyonu. Ayni zamanda infix yapilmistir.
     * this ifadesi, extension yapilan degeri verir. 3 log "4" yaparsaniz,
     * asagidaki kod size empyParam = "4", this = 3 olarak verilir.
     */
    infix fun Number.log(emptyParam: String){
    println(emptyParam + this)
}

fun log2(number: Number){
    println(number)
}