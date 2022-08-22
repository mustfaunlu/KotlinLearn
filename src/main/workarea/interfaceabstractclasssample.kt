package workarea

interface CarAbility {
   val sunroofSpecies: String?
   fun sunroofRun()
    fun turboModule()
    val opsiyonelTabanAydinlatma: String?

}
abstract class Car {
    abstract val wheel: Int?
    abstract val engine: Int?
    abstract val chair: String?
    abstract val windows: Int?
    abstract val direksiyon: Int?

    abstract fun vitesGecis()
    abstract fun startEngine()
    abstract fun camAc()
    abstract fun run()

}

class BMW(
    override val wheel: Int?,
    override val engine: Int?,
    override val chair: String?,
    override val windows: Int?,
    override val direksiyon: Int?,
    override val sunroofSpecies: String?,
    override val opsiyonelTabanAydinlatma: String?
) : Car(), CarAbility {
    override fun startEngine() {
        println("Bmw calisti")
    }

    override fun camAc() {
        println("Bmw camlari aciliyor")
    }

    override fun run() {
        println("bmw hareket ediyor")
    }

    override fun vitesGecis() {
        println("bmw vites gecisi ")
    }

    override fun sunroofRun() {
        println("sunroof calisiyor.")
    }

    override fun turboModule() {
        println("Turbo module eklendi araba hizlandi")
    }

    override fun toString(): String {
        return "Arac BMW ozellikleri -> wheel: $wheel , engine: $engine, chairBrand: $chair, window: $windows, direksiyon: $direksiyon, opsiyoneller -> $sunroofSpecies, $opsiyonelTabanAydinlatma"
    }

}

fun main() {
    val bmw = BMW(4,1,"Drive",4,1,"atmosferik sunroof","opsiyonel aydinlatma mevcuttur.")
    println(bmw.toString())
    bmw.startEngine()
    bmw.run()
    bmw.camAc()
    bmw.sunroofRun()
    bmw.vitesGecis()
    bmw.turboModule()
}