package `4 Classes`

/**
 * Uygulamanin her hangi bir aninda direkt olarak ihtiyac olmayan tum degiskenleri
 * daha sonra kullanildiginda memoryde yer kaplama  kullanimina lazy denir.
 *
 * o class ayaga kalkar kalkmaz yer kaplamaz, ne zaman yer kaplayacagina biz karar vermis oluyoruz.
 * ekran cizildikten sonra veya kullanicidan aksiyom alinacaksa kullanilmalidir.
 *
 * by lazy ile tanimlama yapildiginda ilk kez erisim yapildignda butun verileri alir ikinci erisimde lazy kendi init blogunu calismaz.
 * ifInitialized kontrolu yapilmazsa ikitane user2  objesi olur mantik hatasi olur. ilk nesneye erisim kaybolur yeni bir nesne olusur.
 *
 *
 *
 * bylazy threadsafe mode ile ayni anda iki thread ayni anda obje olusturmasin diye kullanilabilir.z
 */

data class User5(
    val name: String = "mustafa",
    val surName: String = "unlu"
)

class CardDetailFragment {
    val user: User5 by lazy(LazyThreadSafetyMode.PUBLICATION) {
        println("User5 Init")
        User5()
    }

    lateinit var user2: User5

    lateinit var userType: String

    fun printUserInfo() {
        val localVariable = "dfada"
        println("name: ${user.name}, surname: ${user.surName}")
        if (!this::user2.isInitialized.not()) {
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
    cardDetailFragment.printUserInfo()
    cardDetailFragment.printUserInfo()
}