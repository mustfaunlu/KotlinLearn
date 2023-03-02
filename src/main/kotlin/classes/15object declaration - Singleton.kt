package classes



/**  IS GORUSMESI KESIN SORUDUR!!
                          *** singleton pattern nedir??? ***
 * basitce herhangi bir t aninda bir class in nesnesine erismek istedigimizde
bize her zaman ayni nesne donecegini garanti eden design patterndir.

 * bir classin memoryde her erisildiginde ayni nesneyi vermesi yani memoryde bir obje tutar o class hep ayni nesneyi verir.

                        *** bir class in nesnesine kac kere erisildigini ogrenmek icin ne yapabilirim??? ***
 * singleton pattern yapariz. pattern icine counter degiskeni koyup her eristigimde bir artiririm.


                            * singleton pattern dezavantaji nedir?
 * amacina uygun kullanilmazsa mesela ekranlar arasi  veri tasima icin kullanilirsa memoryde silinemeyen
birsuru alan isgal edilmis olacak. sonuc olarak memory leak(outofmemory exception) orani artacak. Bu nedenle Antipattern olmaya musaittir.
 *
 *
 *                      **bir class i singleton teknik olarak nasil yapariz(javadaki hali)?
 *     1 - constructoru private yap ve baska public constructor bulundurma
 *     2 - class icinde class'in referansini verecegimiz private volatile static degisken olustur.
 *     3 - olusturdugun bu degiskeni null check yapip geri donderen public synchronized static fonksiyon yaz.
 *     4-  disardan bu fonksiyonu Class.getInstance() seklinde cagir ve her cagirimda ayni nesneye eris.
 *
 *                      **nerelerde kullaniriz ornek ver???
 *                      local db instance i singleton tutulur.
 *                      retrofit instance i singleton tutulur.
 *
 * static? garbage collector memory temizlerken static keywordlu fieldlara dokunmaz onlari silmez.
 * bu sayede herhangi bir t aninda o class in nesnesine ihtiyac duydugumuzda hali hazirdaki silinemeyen objeyi geri donduruyoruz.
 *
 */

/**
 * Kotlinde singleton yapmak icin object declaration kullanilir.
 * object keywordu yanina isim yazilir suslu parantezler icine gerekli memberlar yazilir.
 * Bu durumda singleton bir class olusturmus oluruz.
 * Object declaration, object expression olamaz, bir variable'a atanamaz.
 * Object declaration thread safedir. Istenir companion object ile thread detaylari eklenebilir.
 * Object declaration, super type(inteface/class) extend edebilir.
 * Object declaraion fonksiyon icinde local olarak yazilamaz.
 * Object icinde object yazilabilir. Icerideki object arka planda static class olarak yazilir dikkatli olmak gerekli.
 * Object declaration, inner olmayan(non-inner) class icinde yazilabilir. Ama arka planda static class olarak tutulur.
 Arka planda class icinde class yazmis oluruz. Genelde class icinde yazilmaz illa class icinde yazilacaksa bunun yerine companion object yazilir.
 * ObjectName.memberName seklinde erisim saglanabilir.
 *
 */


object ProfileKotlin{
    var nickName: String? = null
    var counter: Int = 0
}

fun main() {
    ProfileKotlin.nickName = "Must"
    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++
    println(ProfileKotlin.counter) // ayni objeye 3 kere eristigimiz icin sonuc 3
}






/**
 * once is yap
 * teknik detaylar
 * platform detaylari
 * patternler architectial mimari - design pattern
 */