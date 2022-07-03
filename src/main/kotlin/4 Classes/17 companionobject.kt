package `4 Classes`

interface HomeFragmentPresenter {
    fun navigate()
}

class HomeFragment {
    //const val TAG : String = "HomeFragment"
    var color = "Red"

    companion object : HomeFragmentPresenter, BankAccount2(124234, 23213){
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
}

open class BankAccount2(i: Int, i1: Int) {

}

fun main() {
    val homeFragment = HomeFragment.newInstance()
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