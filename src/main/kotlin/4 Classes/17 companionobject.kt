package `4 Classes`

/**
 * arka planda statik final class olarak tutulur.
 * bu statik class icinde constructori finaldir. yani bir instance olusturulmaz.
 *
 * interface icinde comp object tanimlanabilir.
 * interface icinde state tutamiyorduk tutuyor gibi oluyoruz ama property old icin init edemiyoruz.
 * ama comp object ile interface icinde state tutabilmis oluyoruz. Ama yapilmamasi gerekir.
 *
 * companion eslik eden anlamina gelir yani class imiza yardimci olurlar.
 * class in tamamini degilde icindeki belli kismi singleton yapmak icin kullanilir.
 *
 *
 * companion objectin nesnesi companionu icine yazgidimiz classda yer alir.HomeFragment.TAG seklinde ulasabilir.z
 */
interface HomeFragmentPresenter {
    fun navigate()

    companion object{  //
        val name = "ali"
    }
}
abstract class BaseFragment() {
// companion object abstract class i da extend edebilir.}
    //hecky olarak companion object ile multiinheritance yapilabilir.
}
class HomeFragment: HomeFragmentPresenter {
    //const val TAG : String = "HomeFragment"
    var color = "Red"

    companion object NamedorNameless : HomeFragmentPresenter, BankAccount2(124234, 23213){
        const val TAG : String = "HomeFragment"

        var homeFragment: HomeFragment? = null
        fun newInstance() : HomeFragment{
            homeFragment = HomeFragment()
            return homeFragment as HomeFragment
        }

        override fun navigate() {
            TODO("Not yet implemented")
        }
    }

    override fun navigate() {
        TODO("Not yet implemented")
    }
    fun ss() {
    HomeFragmentPresenter.name // interface icinde state tutmus olduk ama GUNAHHH
    }
}


open class BankAccount2(i: Int, i1: Int) {

}

fun main() {
    val homeFragment = HomeFragment.newInstance() //instance(classismi.) olmadan ulastigi icin arka planda statik oldugunu anlariz.
    homeFragment.color = "Blue"
    val homeFragment2 = HomeFragment.newInstance()
    homeFragment2.color = "Yellow"
    val homeFragment3 = HomeFragment.newInstance()
    val homeFragment4 = HomeFragment.newInstance()
    homeFragment4.color = "Purple"
    val homeFragment5 = HomeFragment.newInstance()
    homeFragment5.color = "Grey"

    println("homeFragment color : ${homeFragment.color}")
    println("homeFragment2 color : ${homeFragment2.color}")
    println("homeFragment3 color : ${homeFragment3.color}")
    println("homeFragment4 color : ${homeFragment4.color}")
    println("homeFragment5 color : ${homeFragment5.color}")
}