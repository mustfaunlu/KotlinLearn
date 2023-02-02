package classes

/**
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
oraya basilmadikca calismasini istemedigimiz degiskenleri lateinit ya da by lazy kullaniriz. pop up a basinca calismasi icin lateinit var veya by lazy{} kullanilir.
 *
 * by lazy ile tanimlama yapildiginda ilk kez erisim yapildignda butun verileri alir ikinci erisimde lazy{} nin  kendi init blogunu {bu kisimm} calismaz.
 * lazynin init blogu icindeki en son satir ilgili degiskene tip olarak atanir
 * bylazy threadsafe mode ile ayni anda iki thread ayni anda obje olusturmasin diye kullanilabilir.z
 *
 * lateinitte bir lazy gibi init blogu yok. lateinitte ne zaman erisim saglanacagini belirlemek icin this::user2.isInitialize seklinde kontrol
 ederek yapariz.
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