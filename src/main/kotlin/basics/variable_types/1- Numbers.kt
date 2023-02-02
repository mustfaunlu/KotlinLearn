package basics.variable_types

/**
 *      Degiskene deger atamasi yapilirken maksimum performans almak icin dogru degisken tipini kullanmak onemlidir.
 *      Tip cikarimi (Type Inference) sirasinda eger sayi Int ifadeden buyuk degilse tipi default olarak Int set edilir.
 *      Tip cikarimi (Type Inference) sirasinda eger sayi Int ifadeden buyukse tipi default olarak Long set edilir.
 */

fun main() {
    val longNumber = 1586L
    val floatNumber1 = 19.90F
    val floatNumber2 = 13f
    val doubleNumber = 3.14
    val doubleNumber2 = 3.14e10
    val decimalNumber = 1907
//    val octalNumber = 0197    // Calismaz. Comment'i kaldir kontrol et istersen keko
    val hexadecimalNumber = 0x759
    val binaryNumber = 0b01000011



    /**
     *      Boxed   : Degiskenin obje referansi olarak tutulmasidir.
     *      UnBoxed : Degiskenin primitive olarak tutulmasidir.
     *
     *      Kotlinde tanimladigimiz degiskenlerin tipleri int seklinde degilde
     *      Int seklinde class olarak yazilir, fakat bunlar jvmde primitive(unboxed) tip olarak
     *      tutulur. Ancak istisna olarak siz bir degiskeni;
     *      Int? seklinde nullable yaparsaniz veya generic olarak <Int> seklinde verirseniz
     *      bu degiskenler referans(boxed) tipli tutulacaktir.
     *
     *     ===  operatoru degiskenlerin referansını karsilastirirken kullanilir.
     *     ==   operatoru degiskenlerin degerini karsilastirirken kullanilir.
     */

    val number: Int = 10000 // int
    println(number === number) // true cunku primitive tipli (unboxed)
    val boxedNumber: Int? = number
    val anotherBoxedNumber: Int? = number
    println(boxedNumber === anotherBoxedNumber) // false cunku referans tipli(boxed)

    //degerini karsilastiriyoruz degeri 10000 ise true dondur
    val number2: Int = 10000
    println(number2 == number2) // true
    val boxedNumber2: Int? = number2
    val anotherBoxedNumber2: Int? = number2
    println(boxedNumber2 == anotherBoxedNumber2) // true

    /**
     *      Backend'ten donen Double ve Float degiskenleri kullanirken dikkatli olmaniz gerekiyor.
     *      Eger backend'ten donen deger uzerinde "." isaretine gore bir split isi yapacaksaniz basiniz agriyabilir.
     *      Cunku backend'ten donen Double ve Float degiskenleri her zaman "." ile ayrismiyor olabilir.
     *      Database dilinin farkli olmasina gore (turkce-ingilizce gibi) "." yerine "," ile de ayrisiyor olabilir.
     *      hocanin anisini hatirla . :)))
     */
}