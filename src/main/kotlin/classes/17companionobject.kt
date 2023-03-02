package classes

/**
 * Companion objectler arka planda statik final class olarak tutulur.
 * bu statik class icinde constructori finaldir. yani bir instance olusturulmaz.
 *
 * interface icinde comp object tanimlanabilir.
 * ama companion object ile interface icinde state tutabilmis oluyoruz. Ama yapilmamasi gerekir.
 *
 * companion eslik eden anlamina gelir yani class imiza yardimci olurlar.
 * class in tamamini degilde icindeki belli kod blogunu singleton yapmak icin kullanilir.
 * Bu sayede class'in belli bir kismina Classismi.companionMember seklinde ulasabiliriz.
 * Diger classlarin icindende  Classismi.companionMember seklinde ulasabiliriz.
 *
 * Arka planda companion objectin nesnesi companionu icine yazgidimiz classin icinde yer alir.
 * HomeFragment.TAG seklinde ulasabiliriz
 * fakat class icinde object declaration kullaniminda HomeFragment.Deneme.TAG seklinde ulasiriz.
 * arka planda bu yapi nested class olarak yazildigi icin statik ve singleton seklinde yazilir.
 *
 * class icinde object declaration yazilmaz, companion object yazilir.
 *
 */
interface HomeFragmentPresenter {
    fun navigate()

    companion object {  // hatali kullanim ; interface icinde companion object ile state tutmak oop acisinda hatalidir. Interface icinde state tutmamaliyiz.
        val name = "ali"
    }
}

abstract class BaseFragment() {
// companion object abstract class i da extend edebilir.
//companion object ile multiinheritance yapilabilir ama oop acisindan hatali.
}

class HomeFragment : HomeFragmentPresenter {
    //const val TAG : String = "HomeFragment"
    var color = "Red"

    companion object NamedorNameless : HomeFragmentPresenter, BaseFragment() {
        const val TAG: String = "HomeFragment"

        private var homeFragment: HomeFragment? = null
        fun newInstance(): HomeFragment {
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

    fun dontDoThis() {
        HomeFragmentPresenter.name // interface icinde state tutmus olduk ama hatali kullanimdir.
    }
}


open class BankAccount2(i: Int, i1: Int) { // companion object normal bir class i da extends edebilir.

}

fun main() {
    val homeFragment =
        HomeFragment.newInstance() //instance(classismi.) olmadan ulastigi icin arka planda statik oldugunu anlariz.
    homeFragment.color = "Blue"
    val homeFragment2 = HomeFragment.newInstance()
    homeFragment2.color = "Yellow"
    val homeFragment3 = HomeFragment.newInstance()
    val homeFragment4 = HomeFragment.newInstance()
    homeFragment4.color = "Purple"
    val homeFragment5 = HomeFragment.newInstance()
    homeFragment5.color = "Grey"

    HomeFragment.TAG




    println("homeFragment color : ${homeFragment.color}")
    println("homeFragment2 color : ${homeFragment2.color}")
    println("homeFragment3 color : ${homeFragment3.color}")
    println("homeFragment4 color : ${homeFragment4.color}")
    println("homeFragment5 color : ${homeFragment5.color}")
}


/**
Android'de, companion object özellikle bir sınıftaki sabitler,
sınıf seviyesinde fonksiyonlar ve varsayılan değerler gibi öğeleri
tanımlamak için kullanılır. Örneğin, bir Fragment sınıfı içinde
companion object ile bir newInstance() fonksiyonu tanımlanabilir.
Bu fonksiyon, fragment'i oluşturmak için kullanılır ve bu sayede
Fragment'in standart bir constructor'ına ihtiyaç duyulmadan,
argümanlarla birlikte oluşturulabilir. Örnek kod şöyle görünebilir:

class MyFragment : Fragment() {

    companion object {
        fun newInstance(param1: String, param2: String) =
            MyFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

// ...

}
 val fragment = MyFragment.newInstance("a","b") seklinde kullanilir.
 */


