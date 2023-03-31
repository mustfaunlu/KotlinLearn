package classes

/*
 *                                 DELEGATION
  Kotlin'de delegation, bir sınıfın bazı işlevlerini başka bir sınıfa aktarmanın bir yoludur.
Bu sayede, sınıfın davranışını değiştirmeden yeni işlevler ekleyebilir veya mevcut işlevlerin
uygulanışını değiştirebilirsiniz.

  Delegation yapmak için, by anahtar kelimesi kullanılır. Örneğin, aşağıdaki örnekte, SomeClass
sınıfı, MyInterface interface'ini implement eder ve MyInterface interface'ndeki işlevleri MyInterfaceImpl
sınıfına delegeler:

 */

interface MyInterfac {
    fun doSomething()
}

class MyInterfacImpl : MyInterfac {
    override fun doSomething() {
        println("Doing something in MyInterfaceImpl")
    }
}


class SomeClass(delegate: MyInterfac) : MyInterfac by delegate


fun main2() {
    val delegate = MyInterfacImpl()
    val someObject = SomeClass(delegate)
    someObject.doSomething() // prints "Doing something in MyInterfaceImpl"

}

/*

Yukarıdaki örnekte, SomeClass sınıfı MyInterface arayüzünü delegate parametresi ile alır.
SomeClass sınıfı aynı zamanda MyInterface arayüzünü de uygular ve by delegate ifadesi ile
MyInterface arayüzündeki işlevleri delegate nesnesine delegeler.

Bu sayede, SomeClass nesnesi MyInterfaceImpl nesnesindeki doSomething() işlevini çağırdığında,
MyInterfaceImpl nesnesi üzerindeki doSomething() işlevi çalışır ve Doing something in MyInterfaceImpl
çıktısı verilir.

Delegation (devir) patterni kullanarak, bir sınıfın yerine getirmesi gereken bir arayüzü uygulamak için
kod tekrarını önleyebilir ve kodun yeniden kullanılabilirliğini artırabiliriz. Ayrıca, bir sınıfın
sorumluluklarını farklı sınıflar arasında bölerek daha düzenli ve okunaklı bir kod yazabiliriz.

Bu örnekte, SomeClass sınıfı doğrudan MyInterface'i uygulayabilir ve işlevleri kendisi geçersiz kılabilir.
Ancak, MyInterfaceImp sınıfı ile delegation kullanarak, SomeClass sınıfı, MyInterface işlevlerini MyInterfaceImp
sınıfına devreder ve kendisi sadece gerekli olan işlevleri çağırdığında işlevselliği gerçekleştirir. Bu şekilde,
SomeClass sınıfı daha az kod içerir ve daha temiz ve okunaklı hale gelir. Ayrıca, MyInterfaceImp sınıfı farklı
sınıflarda yeniden kullanılabilir, böylece kod tekrarı önlenir ve uygulamanın bakımı kolaylaştırılır.

 */



/*--------------------------------------------------------------------------------------------------------------------*/


/**                                        DELEGATION PROPERTIES
 * Uygulamanin her hangi bir aninda direkt olarak ihtiyac olmayan tum degiskenleri
 * daha sonra kullanildigi andan itibaren memoryde yer kaplama  kullanimina lazy denir.
 *
 * bu sekilde yazacagimiz degisken val ise by lazy{} ile var ise lateinit var seklinde yazariz.
 *
 * o class ayaga kalkar kalkmaz yer kaplamaz, ne zaman yer kaplayacagina biz karar vermis oluyoruz.
 * ekran cizildikten sonra veya kullanicidan aksiyom alinacaksa kullanilmalidir.
 * app ayaga kalkar kalkmaz calismasi gereken bir degiskense bu kullanim yapilmamalidir.
 * mesela ilk calisacak olan init icinde bu tanimlama yapilmasi mantiksizdir.
 * mesela class ayaga kalkti ui cizildi uida birde pop up var
oraya basilmadikca calismasini istemedigimiz degiskenleri mutable ise lateinit var
seklinde ya da immutable ise by lazy seklinde kullaniriz.
 *
 * by lazy ile tanimlama yapildiginda ilk kez erisim yapildignda butun verileri alir ikinci erisimde lazy{} nin
 * kendi init blogunu {bu kisimm} calismaz.
 * lazynin init blogu icindeki en son satir ilgili degiskene tip olarak atanir
 * by lazy(istenilen thread mod yazilir) {} threadsafe mode ile ayni anda iki thread ayni anda obje olusturmasin diye kullanilabilir.z
 *
 * lateinitte bir lazy gibi init blogu yok. lateinitte ne zaman erisim saglanacagini belirlemek icin
 * this::user2.isInitialize seklinde kontrol ederek yapariz.
 * ifInitialized kontrolu yapilmazsa ikitane user2  objesi olur mantik hatasi olur. ilk nesneye erisim kaybolur yeni bir nesne olusur.
 *
 */

data class User5(
    val name: String = "mustafa",
    val surName: String = "unlu"
)

class CardDetailFragment {
    val user: User5 by lazy(LazyThreadSafetyMode.PUBLICATION) {
        println("User5 Init")
        User5() //en son blogu tip olarak ataniyor.
    }

    lateinit var user2: User5

    lateinit var userType: String

    fun printUserInfo() {
        val localVariable = "dfada"
        //mesela bu degisken compiler bu fonksiyonun scope na girince calisir
        // scopedan cikinca garbage collector ne zaman temizlerse, memoryden silinir.
        // by lazy kullanilsaydi bu degisken ne zaman cagirilirsa orda calisacakti scope a girse bile calismayacakti.


        println("name: ${user.name}, surname: ${user.surName}")
        if (this::user2.isInitialized.not()) {
            user2 = User5()
        }
        println("name: ${user2.name}, surname: ${user2.surName}")
    }

    init {
        userType = "Premium" //atama burada yapildiktan sonra lazy ve late init degiskenleri null dan Premiuma gecer.


        //aslinda bu kullanim ornegi yanlis initte verilen bir degiskeni lateinit yapmanin anlami yok zaten class ayaga kalkar kalkmaz init calisacak
        //androidde kullanilacak yerlerde ornekler netlesecek.
        // mesela class ayaga kalkti ui cizildi uida birde pop up var oraya basilmadikca calismasini istemedigimiz degiskenleri lateinit ya da by lazy kullaniriz.
    }
}


fun main() {
    val cardDetailFragment = CardDetailFragment()

    //bir buton icinde cagriyormusuz gibi dusunelim butona basilmis printUserInfo() calismis gibi
    cardDetailFragment.printUserInfo()
    cardDetailFragment.printUserInfo()
}