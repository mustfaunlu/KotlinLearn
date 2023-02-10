package functions

fun main() {


    /**
     * Daha okunakli kodlar yazmak icin kullanilir.
     * . (nokta) kullanimini kaldirir. true.or(false) yerine true or false yazmak infixtir.
     *      bir fonksiyonu infix hale getirebilmek icin 5 sart vardir;
     * 1. infix keywordu ile baslar
     * 2. fonksyon bir uye fonksiyon olmalidir. (class a ait olmali)
     * 3. ya da bir extension fonksiyon olmalidir
     * 4. sadece bir parametre olmalidir. Bu parametre vararg olamaz.
     * 5. infix methodun parametresi default deger olamaz
     *
     *       yapisal olarak; (class icerisinde oldugunu varsayalim)
     *
     *      infix fun infixMethodName (justOneParam : AwesomeParamType) : WhateverType{
     *      ....
     *      }
     *
     *      //extension fonksiyonlar ile yazilma sekli.
     *      infix fun ReceiverClass.infixMethodName (justOneParam : AwesomeParamType) : WhateverType{
     *            ....
     *            }
     *
     *
     */

    val isStudent = false
    val isMale = true

    /**
     * and, or, xor gibi onlarca infix method vardir.
     * operatorlerde bahsetmistik
     */
    isStudent and isMale // infix
    isStudent.and(isMale) // normal

    val awesomeInstance = AwesomeClass() //class in nesnesini olusturup asagidaki gibi kullanabilirz.
    awesomeInstance downloadImage "www.picture.com" //infix kullanimi
    awesomeInstance.downloadImage("www.picture.com") // normal kullanim

   // infix methodlarin da mantik operatorlerine gore onceligi vardir.
    val number = 5
    if(number == 3 && number < 5 || awesomeInstance specialPlus 4 == 5) {

    }

    // matematiksel operatorlerin, tip donusumlerin (type conversion), range kullanimin, infix methodlara karsi islem onceligi vardir.
    if (number + number - 2 * (awesomeInstance specialPlus 4) == 5) {

    }

    1 topla 2  // this(Int) = 1   x = 2
}

// infix fonksiyonlarin extensionlar ile birlikte kullanimi
//topla adinda infix fonksiyon yazip 2 sayiyi topluyoruz
infix fun Int.topla(x: Int): Int {
    return this.plus(x) //buradaki this Int'i niteliyor
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

    //class nesnesini vererek kullanabiliriz.
    AwesomeClass() downloadImage imageUrl
    AwesomeClass().downloadImage(imageUrl)
}



