package `4 Classes`



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
 *     2 - class in kendi nesnesini private volatile(multithread durumunda tek bir threadin ulasmasi icin) static olarak icerde olustur.
 *     3 - olusturdugun bu nesneyi null check yapip geri donderen public fonksiyon yaz.(getter)
 *                          disardan bu fonksiyonu cagir ve ayni nesneye eris.
 *
 *                      **nerelerde kullaniriz ornek ver???
 *                      local db instance i singleton tutulur.
 *                      retrofit instance i singleton tutulur.
 *
 * static? garbage collector memory temizlerken static keywordlu fieldlara dokunmaz onlari silmez.
 * bu sayede herhangi bir t aninda o class in nesnesine ihtiyac duydugumuzda hali hazirdaki silinemeyen objeyi geri donduruyoruz.
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