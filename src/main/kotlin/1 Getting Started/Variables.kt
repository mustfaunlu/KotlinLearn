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