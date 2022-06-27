package `4 Classes`


/**
 * abstract classlarin temel amaci sozlesmedir.
 * child classlarda yapilmasini zorunlu olarak koydugun yapilarin templatedir.
 * bu sayede child classlarda fazla kod yazmaktan bizi kurtarir.
 * abstract property(deger almaz) ve functionlar(body si olmaz) deger almazlar.
 * abstract class inherit alabilen classdir. Final yapmanin anlami olmaz
 * abstract classlarda normal open bir fonksiyon ve  degisken yazilmamali. cok gerekli degilse.
 * 1 classda kullanilacak open bir fonksiyonu yeni bir class extend ederek openi onun icine koymak mantiklidir.
 * final ve open modifierlarei kullanmak anlamsiz ve yanlistir.
 *
 * abstract olarak yazilmis class a yeni eklenen tum abstract yapilar
 *
 * bir abstract class in instance olusturamayiz. open bir class ile abstract class in farki budur.
 * base class bu yuzden abstract yapilir ki instance olusturulamasin.
 *
 * bir abstract class bir diger abstract class i inherit ediyorsa ust classin  func ve variablelarini zorunlu overridelarini etmek istersek ederiz opsiyoneldir.
 * ama child class abstract degilse mecburen ust abstract classdaki overridelari etmelisin
 * eger bir abs class baska bir abs class tarafindan miras alindiysa bu kendi icinde override edilmesi zorunlu olan deg veya func override ederse yine override zorunlulugu kalkar. cunku override edilen bir function open olur body alir. hic override edilmesi istenmiyorsa final koyariz. override edilmez
 *
 *
 */
abstract class  MCDonalds {
    abstract val fridge: Fridge
    abstract val superVisor: SuperVisor
    abstract val employeeOne: Employee
    abstract val employeeTwo: Employee
    abstract val employeeThree: Employee
    abstract val menuList:  List<McHamburger>

    abstract fun clean(clock: Int)

    //opsiyonel
    open val policeOfficer: Police = Police()
}


fun main() {
    val mcdonald =
}

class Fridge
class SuperVisor
class Police
class McHamburger
class McCoffee


