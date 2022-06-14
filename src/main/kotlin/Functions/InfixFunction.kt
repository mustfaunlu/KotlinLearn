package Functions

fun main() {


    /**
     * Daha okunakli kodlar yazmak icin kullanilir.
     * . nokta kullanimi kaldirir. true.or(false) yerine true or false yazmak infixtir.
     * 1. infix keywordu ile baslar
     * 2. fonksyon bir uye fonksiyon olmalidir. (class a ait olmali)
     * 3. ya da bir extension fonksiyon olmalidir
     * 4. sadece bir parametre olmalidir. Bu parametre vararg olamaz   true or false true olmaz. tek parametre olmalidir.
     * 5. infix methodun parametresi default deger olamaz
     *
     *       yapisal olarak; (class icerisinde oldugunu varsayalim veya extension fuc old. varsayalim)
     *
     *      infix fun infixMethodName (justOneParam : AwesomeParamType) : WhateverType{
     *      ....
     *      }
     */

    val isStudent = false
    val isMale = true

    /**
     * and, or, xor gibi onlarca infix method vardir.
     * operatorlerde bahsetmistik
     */
    isStudent and isMale // infix
    isStudent.and(isMale) // normal

    val awesomeInstance = AwesomeClass()
    awesomeInstance downloadImage "www.picture.com" //infix kullanimi
    awesomeInstance.downloadImage("www.picture.com") // normalde boyle



}

class AwesomeClass {
    infix fun downloadImage(imageUrl: String){

    }

    infix fun specialPlus(number: Int): Int {
        return 4
    }

    //bir sinifin icindeyken this kullanimi size bulundigi sinifi isaret eder
    // asagidaki kullanumda AwesomeClass().downloadImage(imageUrl) kullanimi olusur aslinda. (implicit)

    fun logWhenImageDownloaded(imageUrl: String){
        downloadImage(imageUrl) // infix degil duz cagirim bu
        //downloadImage imageUrl   calismaz.
        this downloadImage  imageUrl // bu infixtir.   //AwesomeClass() downloadImage imageUrl     this = AwesomeClass()
    }


}

//bir sinifin disindayken infix method cagirimi yapilirsa this kullanilamaz

fun logWhenImageDownloaded(imageUrl: String){
    //this downloadImage imageUrl     calismaz. class disinda this isaret edecek bir sey bulamaz.
}