package `1 Getting Started`

fun main() {

    /**
     * Her variable'in tipi vardir. Mesela kimlik uzerinda adinizin ve soyadinizin oldugu
     * alan sadece harflerle yazilir, tcno ise 12 haneli bir sayi ile yazilir harf ile yazilamaz.
     * Bunlar variable tipleridir.


    Variable Types :
    Numbers(Byte, Short, Int, Long, Double, Float) & Unsigned Types
    Characters
    Booleans
    Arrays
    String
    Decimals [0-9]
    Octals [0-7] Kotlin tarafindan desteklenmiyor.
    Binary [0-1]
    Hexadecimals [0-9A-Fa-f]
     */

    /* -------------------------------------------------------------------------------------------------------------------*/

    val number: Int? = null
    /**
     *      Kotlin'de primitive tipler direkt olarak tanimlanamazlar.
     *      Ancak yazdiginiz program makina koduna derlenirken primitive tiplere donusturulur.
     *      Eger degisken "nullable" veya "generic" olarak tanimlanirsa referans tipli olarak donusturulur.
     *      Degisken nullable olsa bile hic null deger atamasi yapilmazsa yine primitive tip olarak donusturulur.
     *      Bundan dolayı performans olarak Java'dan farkli degildir.
     *      Kontrol etmek icin:
     *      1- Bir programı calistirin.
     *      2- Ctrl + Shift + A -> Show Kotlin Bytecode
     *      3- Isterseniz decompiler diyerek Java kodundaki karsiligini da gorebilirsiniz.
     */

    /* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Multi thread programlama yaparken performans artisi saglamak icin olabildigince val degisken kullanmaya calisin.
     *      Best Practice olarak aliskanliginiz val tanimlamak seklinde olsun.
     *      Eger degiskenin degerini sonradan degismeniz gerekirse var'a cevirirsiniz.
     */

    /* -------------------------------------------------------------------------------------------------------------------*/

    val immutableValue: String = "Degismez Degisken"
    var mutableVariable: String = "Degisebilir Degisken"

//  immutableValue = "val ifadesi ile tanimlanan degisken sonradan degistirilemez. Comment'i kaldir kontrol et istersen keko"
    mutableVariable = "var ifadesi ile tanimlanan degiskene ise yeniden deger atanabilir."

    /* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Degisken tanimi sirasinda deger atamasi yapilirsa, degisken tipi gereksizdir.
     */
    val name = "Gökhan" // Kotlin tip cikarimini destekler. (Type Inference) -> String
    val age = 29        // Kotlin tip cikarimini destekler. (Type Inference) -> Int

    /* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Degisken tanimi yapildiktan sonra atama yapilabilir.
     */
    val surname: String
    //surname = "ÖZTÜRK"

    /**
     *      Ancak, deger atamasi sonradan yapilacaksa degisken tipi belirtilmelidir.
     *      Asagidaki kod calismaz. Comment'i kaldir kontrol et istersen keko
     */
//    val middleName
//    middleName = "Keko"
}