package `4 Classes`

/**
 * Auto -> MiniCooper -> John -> JohnCabrio
 *      -> Beetle
 *
 * Bycle -> Bisan -> BlackBisan
 *       -> Corelli
 */

/**
 * parametre olarak verilecek hiyerarsiyi kisitlamak icin kullanilan mukemmel bir ozellik
 * olaya buyuk cerceveden bakmaya saglar.
 * parametre olan yerlerde kullanialbilir.
 * constructorlarda, fonksiyonlarda, higher orderlarda, extensinon, inline, functionlarda


 *Bir T arayuzu yazarken kesinlikle classin arayuzu base olarak verilmeli <T: Auto> veya <T: Bycle> gibi
 base arayuz vermezsek sadece T yazarsak herhangi bir class i da base olarak alabilir bu da mantik hatasina goturebilir.


 * out verilirse class in kendisi ve childlari , in verilirse class in kendisi ve ust classlari
 * out ve in keywordleri ihtiyaci ;



 */

// function ornegi
//fun <T: BaseFragment> log(loginFragment: T) {
//    (loginFragment as BaseFragment).log()
//}

interface TransportationFunctions {
    fun run()
}

open class Auto : TransportationFunctions {
    open val namec: String = ""
    open val color: String = ""
    override fun run() {
        println("run runn")
    }

}

open class Bycle {
    open val namec: String = ""
    open val color: String = ""

}

//===================================================
open class MiniCooper(
    override val namec: String = "MiniCooper", override val color: String = "Red"
) : Auto() {

    override fun toString(): String {
        return "name $namec , color: $color"
    }

    init {
        super.run()
    }
}

open class John : MiniCooper() {
    init {
        super.run()
    }
}

class JohnCabrio : John() {
    init {
        super.run()
    }
}

class Beetle(
    override val namec: String = "Beetle",
    override val color: String = "Yellow"
) : Auto() {
    override fun toString(): String {
        return "name $namec color: $color"
    }

    init {
        super.run()
    }
}

open class Bisan(
    override val color: String = "Bisan",
    override val namec: String = "Brown"
) : Bycle(), TransportationFunctions {
    override fun run() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "name $namec color $color"
    }
}

class BlackBisa() : Bisan()

class Corelli(
    override val namec: String = "Corelli",
    override val color: String = "Gray"
) : Bycle() {
    override fun toString(): String {
        return "name: $namec color: $color"
    }
}


class TransportFactory<out T: Auto>(transportationVehicle: T) {
    init {
        println(transportationVehicle.toString())
    }
}

fun main() {
    val miniCooper: MiniCooper = MiniCooper()
    val john: John = John()
    val johnCabrio = JohnCabrio()
    val beetle: Beetle = Beetle()

    val bycle = Bycle()
    val bisan = Bisan()
    val blackBisan = BlackBisa()
    val corelli = Corelli()

    val miniCooperFActory: TransportFactory<MiniCooper> = TransportFactory<MiniCooper>(miniCooper)
    val johnFActory: TransportFactory<John> = TransportFactory<John>(john)
    val johnCabrioFActory: TransportFactory<JohnCabrio> = TransportFactory<JohnCabrio>(johnCabrio)
    val beetleFActory: TransportFactory<Beetle> = TransportFactory<Beetle>(beetle)

   // val johnFactory2: TransportFactory<John> = TransportFactory<MiniCooper>(miniCooper) //in yazarsak calisir  // john yazdik ust classini bekliyrouz
    val johnFactory3: TransportFactory<John> = TransportFactory<JohnCabrio>(johnCabrio) //out yazarsak calisir // John  yazdik alt classini bekliyoruz.
    val johnFactory4: TransportFactory<John> = TransportFactory<John>(john)


//    val bisanFactory2: TransportFactory<Bisan> = TransportFactory<Bycle>(bycle)
//    val bisanFactory3: TransportFactory<Bisan> = TransportFactory<BlackBisa>(blackBisan)
//    val bisanFactory4: TransportFactory<Bisan> = TransportFactory<Bisan>(bisan)
//
//    val bisanFactory: TransportFactory<Bisan> = TransportFactory<Bisan>(bisan)
//    val corelliFactory: TransportFactory<Corelli> = TransportFactory<Corelli>(corelli)

//    val something: Car = Car(2,"red")
//    val somethingFactory: TransportFactory<Car> = TransportFactory<Car>(something)


    calculate<Int>(2,5)
    calculate<String>(2,5)
}

inline fun <reified T> calculate(n1: Int, n2: Int): T {
    return when (T::class.java) {
        String::class.java -> {
            (n1 + n2) as T
        }
        else -> {
            (n1 + n2) as T
        }
    }
}


/**
 * reified keyword u sadece inline functionlarda kullanilir.
 * generic tipler derleme zamaninda hangi tipte oldgunun bilgisinde degildir.
 * run tusuna basildigin hala ide hangi tipte old bilmez.
 * ne zaman kod run time da okunur oyle haberi olur.
 * reified kullanirsak derleme zamaninda tipi bilinir.
 * bunun hangi tip olacagi bilinirse  generic tiplerle ilgili 2 onemli kontrol var
 * 1 generic tipin hangi tipte oldugunu anlamak icerde iki tipide kullaniyor olabilir.
 * bunun icin tipi belli olmali reified bunun belli olmasini saglar.
 */

/**
 * bunu anlamak icin inline i anlamak gerekir.
 * inline functionlarin body si run time da cagrildigi yere yapistirilir.
 * bu ornekte aslinda arka planda calculate diye bir function yaratilmaz.
 * bu yuzden reified ile tipi belli edilirki arka planda bu functionlarin tipi belli olsun
 */


