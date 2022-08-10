package `1 Getting Started`

fun main() {
    val name: String  = "Twitter"  //val(value); dart dilindeki final gibi ikinci kez atama yapilamaz (immutable)
    var surName = "Social Media" //var(variable); degiskendir (mutable)
    surName = "Traditional Media" // var mutable oldugu icin degistirebilirz.
    //name = "Facebook"     //val ile atama yapilan degiskenler immutabledir ikinci atamayi yapamayiz.

    val age = 23 //explicit type burada gereksizdir kotlin kendisi anlar type ckarimi yapar ide gucunden gelir
    // ozel tip belirtilmedikce deger araligi int icindeyse int olur


    var eyeColor: String // esittir ile atama yapmiyorsak sonradan atayacaksak type atamasi yapmamiz gerekir
    eyeColor = "Green" //memoryde atamasi yapildigi icin string bir ifadeyi eyeColor = 2 yapamayiz int e ceviremeyiz



    println(name)
    println(surName)
    // == value degerini kontrol eder
    // === nullable(?) degerin referans degerini kontrol eder ramde tutulan yerleri kontrol edilir
    // eger bir degisken nullable ise referans tipli degisken olur primitive olmaz

   val oneMillion = 1_000_000 // seklinde yazilabilir daha okunakli olmasi icindir ciktisi 1000000 dur. isleme tabi tutulabilir

    //type conversion lar toString(), toShort(), toInt(), toLong() vb. fondksiyonlarla olur.
    // Donusturuulmek istenen type in Deger araligi icerisinde olma zorunlulugu var.


}

fun mainer() {
    /**
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
    surname = "ÖZTÜRK"

    /**
     *      Ancak, deger atamasi sonradan yapilacaksa degisken tipi belirtilmelidir.
     *      Asagidaki kod calismaz. Comment'i kaldir kontrol et istersen keko
     */
//    val middleName
//    middleName = "Keko"
}