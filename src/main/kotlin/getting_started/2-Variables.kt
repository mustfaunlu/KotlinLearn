package getting_started


/**
 * kotlinde top-level variable tanimlayabiliriz.
 * bu variablelar private degilse tum program dosyasinin her yerinden erisilebilir.
 * private yapilirsa sadece bu .kt dosyasi icinden butun yapilar icinden erisilir.
 */
val PI = 3.14
var x = 0
var str = "string"
fun main() {

    /**
     * Etrafta gordugumuz herhangi bir esya uzerinden ornek verecek olursak;
     * bu esya ile ilgili herhangi bir bilgi o esyanin degiskeni(variable)dir.
     * Mesela sizin kimliginizde ad soyad tcno fotograf gibi alanlarin herbiri
     * bir degiskendir. Bu degiskenlerin tamami bir kimligi tanimlamis olur.

     */
    val name: String  = "Twitter"  //val(value); ikinci kez atama yapilamaz (immutable)
    var surName = "Social Media" //var(variable); ikinci kez atama yapilabilen degiskendir (mutable)
    surName = "Traditional Media" // var mutable oldugu icin degistirebilirz.
    //name = "Facebook"     //val ile atama yapilan degiskenler immutabledir ikinci atamayi yapamayiz.

    /**
     * Type Inference(Tip cikarimi)
     * Variable'a bir atam yaptiginizda ide tipini kendisi cikarir.
     * Bu yuzden tipini yazmaniza gerek yoktur(asagidaki age ornegi gibi)
     * Buna implicit type denir.
     * Yukaridaki name: String seklinde yazdigimizda explicit type dir.
     *
     */
    val age = 23 //explicit type burada gereksizdir kotlin kendisi anlar type cikarimi yapar ide gucunden gelir
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