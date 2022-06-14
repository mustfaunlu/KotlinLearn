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
     *       yapisal olarak; (class icerisinde oldugunu varsayalim)
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
        downloadImage(imageUrl)
        //downloadImage imageUrl   calismaz.
        this downloadImage  imageUrl //AwesomeClass() downloadImage imageUrl
    }


}

//bir sinifin disindayken infix method cagirimi yapilirsa this kullanilamaz

fun logWhenImageDownloaded(imageUrl: String){
    //this downloadImage imageUrl     calismaz. class disinda this isaret edecek bir sey bulamaz.
}