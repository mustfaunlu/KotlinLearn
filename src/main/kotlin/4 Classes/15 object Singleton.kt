package `4 Classes`



/**  IS GORUSMESI KESIN SORUDUR!!
                          *** singleton pattern nedir??? ***
* basitce herhangi bir t aninda bir class in nesnesine erismek istedigimizde
bize her zaman ayni nesne donecegini garanti eden design patterndir.

* bir classin memoryde her erisildiginde ayni nesneyi vermesi yani memoryde bir obje tutar o class hep ayni nesneyi verir.

                         *** bir objeye kac kere erisildigini ogrenmek icin ne yapabilirim??? ***
* singleton pattern yapariz. pattern icine counter degiskeni koyup her eristigimde bir artiririm.


                            * singleton pattern dezavantaji nedir?
 * amacina uygun kullanilmazsa mesela veri tasima icin kullanilirsa memoryde silinemeyen birsuru alan isgal edilmis olacak.
sonuc olarak memory leak(outofmemory) orani artacak. Antipattern olmaya musaittir.
 *
 *
 */


object ProfileKotlin{
    var nickName: String? = null
}

fun main() {
    ProfileKotlin.nickName = "Musti"
}






/**
 * once is yap
 * teknik detaylar
 * platform detaylari
 * patternler architectial mimari - design pattern
 */