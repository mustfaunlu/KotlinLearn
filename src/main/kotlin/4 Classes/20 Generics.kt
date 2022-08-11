package `4 Classes`

/**
 * Auto -> MiniCooper -> John -> JohnCabrio
 *      -> Beetle
 *
 * Bycle -> Bisan -> BlackBisan
 *       -> Corelli
 */

/**
 * hiyerarsiyi kisitlamak icin kullanilan mukemmel bir ozellik
 * olaya buyuk cerceveden bakmaya saglar.
 * parametre olan yerlerde kullanialbilir.
 * constructorlarda fonksiyonlarda higher orderlarda extensinon inline functionlarda
 *
 *
 *
 * out verilirse class in kendisi ve childlari , in verilirse class in kendisi ve ust classlari
 *
 *
 * reified keyword u sadece inline functionlarda kullanilir.
 * generic tipler derleme zamaninda hangi tipte oldgunun bilgisinde degildir.
 * run tusuna basildigin hala ide hangi tipte old bilmez.
 * ne zaman kod run time da orasi okunur oyle haberi olur.
 * reified kullanirsak derleme zamaninda tipi bilinir.
 * bunun hangi tip olacagi bilinirse  generic tiplerle ilgili 2 onemli kontrol var
 * 1 generic tipin hangi tipte oldugunu anlamak icerde iki tipide kullaniyor olabilir.
 * bunun icin tipi belli olmali reified bunun belli olmasini saglar.
 */

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

    val johnFactory3: TransportFactory<John> = TransportFactory<JohnCabrio>(johnCabrio)
    val johnFactory4: TransportFactory<John> = TransportFactory<John>(john)
}