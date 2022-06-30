package `4 Classes`

interface  McDonaldsService {
    fun motoCarrier()
}

/**
 1-  abstract classlarin temel amaci sozlesmedir. abstract class sablon classlardir. kopya kagidi gibidir.
 child classlarda yapilmasini zorunlu olarak koydugun yapilarin sablonudur..
 bu sayede child classlarda fazla kod yazmaktan bizi kurtarir.


 2- abstract property(initial default degeri almaz) ve functionlar(body si olmaz) deger almazlar.

 3- abstract class inherit alabilen classdir. final ve open modifierlari kullanmak anlamsiz ve yanlistir.

 4- eger abstract classiniza eklemek isteginiz opsiyonel yapilar varsa, bunlari child classlarin tamaminda override
 etmek zorunda olmayalim diye, open keyword u ile tanimlayabiliriz.
 abstract classlarda normal open bir fonksiyon ve  degisken yazilmamali. cok gerekli degilse.
 Bir abstract classda kullanilacak open bir fonksiyonu yeni bir class inherit ederek openi onun icine koymak mantiklidir.


 5- abstract olarak yazilmis class a yeni eklenen tum abstract yapilar,
 tum child abs olmayan classlarda override edilmek zorundadir.

 6- bir abstract class in instance olusturamayiz. open bir class ile abstract class in farki budur.
 base class bu yuzden abstract yapilir ki instance olusturulamasin.
 bu sebeple singleton pattern abstract classlarla olusabilir.

 7- abstract class bir diger abstract class i inherit ediyorsa abstract yapilari override etmek zorunda degildir.
 ama child class abstract degilse mecburen ust abstract classdaki overridelari etmelisin


 8- eger bir abstract class baska bir abstract class tarafindan miras alindiysa ve bu kendisi icerisinde,
 zaten ust clasindaki herhangi bir override edilmesi zorunlu olan degiskeni veya functionu,
 kendi icinde override ederse bu durumda bu class i yani child olaan abs classi,
 miras alan duz bir classta, bu functionun yine override zorunlulugu ortadan kalkar.
 cunku override edilen bir function open olur body alir.
 childlarin birinden sonra hic override edilmesi istenmiyorsa final koyariz. override edilmez

 */
abstract class  MCDonaldsFranchize {
    //abstract val fridge: Fridge = Fridge()  diyemeyiz cunku biz sablon veriyoruz. Belli bir buzdolabi istemiyoruz.
    //Sadece buzdolabi olmasi gerekiyor. Franchize sozlesmesinde bir buzdolabin olsun der belli bir dolap belirtmez

    abstract val fridge: Fridge
    abstract val superVisor: SuperVisor
    abstract val employeeOne: Employee
    abstract val employeeTwo: Employee
    abstract val employeeThree: Employee
    abstract val menuList:  List<McHamburger>

    abstract fun clean(clock: Int)

    //opsiyonel
    open val policeOfficer: Police = TODO()


}



abstract class McDonaldsExpress : MCDonaldsFranchize(){  //bir abs diger abs class i miras alabilir
    abstract  fun sellCoffee(): McCoffee //bazi mcdonaldslar kahvede satiyor expresse kendi abst func ile kahvesatisinida ekliyoruz.
                                        // open olarak class icinde yazmaktansa yeni bir child olusturup icinde tanimlamak onemli
                                            //10 franxhizeda kahve yokken birinde varsa bunu base abstracta yazmak yerine boyle yapilmali
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
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")
    override val employeeThree: Employee
        get() = TODO("Not yet implemented")
    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }

    override fun motoCarrier() {
        TODO("Not yet implemented")
    }

}

class McDonaldsMaltepeExpress : McDonaldsExpress(){
    override fun sellCoffee(): McCoffee {
        TODO("Not yet implemented")
    }

    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")
    override val employeeThree: Employee
        get() = TODO("Not yet implemented")
    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {  //8. madde ornegi 2. child classda override old icin 3. child classta opsiyoneldir.
        super.clean(clock)
    }

}


fun main() {
    //val mcdonalds = MCDonaldsFranchize()   olusturamazsin 6. maddeye bak
}

class Employee
class Fridge
class SuperVisor
class Police
class McHamburger
class McCoffee



