package workarea

class CoffeeMachine{

    fun method(str: String){

    }
}

class Building(val numberOfFloor: Int, val area: Double, val yearOfConstruction: Int)

class Plane(val name: String, val passangerCapacity: Int, val speed: Int) {
    fun transfer(currentCoordinate: String, to: String){
        println("$name isimli ucak $passangerCapacity kisi ile, $speed km/s hizla, $currentCoordinate shrinden $to sehrine ucmaktadir.")
    }
}

fun main() {
    val building1 = Building(3,2400.16,1966)
    val building2 = Building(6,3400.54,2001)
    val plane1 = Plane("Boing 232",22,700)
    plane1.transfer("Ankara", "Istanbul")
}