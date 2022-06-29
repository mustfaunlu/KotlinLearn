package `4 Classes`

interface  McDonaldsService {
    fun motoCarrier()
}

/**
 * abstract classlarin temel amaci sozlesmedir. abstract class sablon classlardir. kopya kagidi gibidir.
 * child classlarda yapilmasini zorunlu olarak koydugun yapilarin sablonudur..
 * bu sayede child classlarda fazla kod yazmaktan bizi kurtarir.
 *
 * abstract property(initial default degeri almaz) ve functionlar(body si olmaz) deger almazlar.
 * abstract class inherit alabilen classdir. Final yapmanin anlami olmaz
 *
 * eger abstracyt classiniza eklemek isteginiz opsiyonel yapilar varsa, bunlari child classlarin tamaminda override
etmek zorunda olmayalim diye, open keyword u ile tanimlayabiliriz.
 * abstract classlarda normal open bir fonksiyon ve  degisken yazilmamali. cok gerekli degilse.
 * 1 classda kullanilacak open bir fonksiyonu yeni bir class extend ederek openi onun icine koymak mantiklidir.
 * final ve open modifierlari kullanmak anlamsiz ve yanlistir.
 *
 * abstract olarak yazilmis class a yeni eklenen tum abstract yapilar, tum child classlarda override edilmek zorundadir.
 *
 * bir abstract class in instance olusturamayiz. open bir class ile abstract class in farki budur.
base class bu yuzden abstract yapilir ki instance olusturulamasin. singleton pattern abstract classlarla olusabilir.
 *
 * abstract class bir diger abstract class i inherit ediyorsa abstract yapilari override etmek zorunda degildir.
ama child class abstract degilse mecburen ust abstract classdaki overridelari etmelisin
 *
 * eger bir abs class baska bir abs class tarafindan miras alindiysa bu kendi icinde override edilmesi zorunlu olan deg veya func override ederse yine override zorunlulugu kalkar.
cunku override edilen bir function open olur body alir. hic override edilmesi istenmiyorsa final koyariz. override edilmez
 *
 *
 */
abstract class  MCDonaldsFranchize {
    //abstract val fridge: Fridge = Fridge() diyemeyiz cunku biz sablon veriyoruz. Belli bir buzdolabi istemiyoruz.
                                    //Sadece buzdolabi olmasi gerekiyor. Franchize sozlesmesinde bir buzdolabin olsun der.

    abstract val fridge: Fridge
    abstract val superVisor: SuperVisor
//    abstract val employeeOne: Employee
//    abstract val employeeTwo: Employee
//    abstract val employeeThree: Employee
    abstract val menuList:  List<McHamburger>

    abstract fun clean(clock: Int)

    //opsiyonel
    open val policeOfficer: Police = Police()

    // bazi mcdonaldslar kahve hizmetide veriyor opsiyonel olarak kullanilabilir.
}

abstract class McDonaldsExpress : MCDonaldsFranchize(){  //bir abs diger abs class i miras alabilir
    abstract  fun sellCoffee(): McCoffee

    override fun clean(clock: Int) {
        println("Clean time: $clock")
    }

    override val fridge: Fridge   // abstract propertyleride override edebiliriz.
        get() = TODO("Not yet implemented")
}

class McDonaldsMaltepe : MCDonaldsFranchize(), McDonaldsService { //bir duz class abs class i inherit alabilir ama ust classdaki butun abstract yapilari override etmek zorundadir.
    override val fridge: Fridge
        get() = TODO("Not yet implemented")
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")
//    override val employeeOne: Employee
//        get() = TODO("Not yet implemented")
//    override val employeeTwo: Employee
//        get() = TODO("Not yet implemented")
//    override val employeeThree: Employee
//        get() = TODO("Not yet implemented")
    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }

    override fun motoCarrier() {
        TODO("Not yet implemented")
    }

}


fun main() {

}

class Fridge
class SuperVisor
class Police
class McHamburger
class McCoffee
//class Employee


