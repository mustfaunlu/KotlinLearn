package classes

interface  McDonaldsService {
    fun motoCarrier()
}

/**
 1-  abstract classlarin temel amaci sozlesmedir. abstract class sablon classlardir. kopya kagidi gibidir.
 child classlarda yapilmasini zorunlu olarak koydugun yapilarin sablonudur..
 bu sayede child classlarda fazla kod yazmaktan bizi kurtarir.


 2- Abstract classlarin icinde; abstract property(initial default degeri almaz) ve functionlar(body si olmaz) yazilabilir.

 3- abstract class inherit alabilen classdir. final ve open modifierlari kullanmak anlamsiz ve yanlistir.

 4- eger abstract classiniza eklemek isteginiz opsiyonel yapilar varsa, bunlari child classlarin tamaminda override
 etmek zorunda olmayalim diye, open keyword u ile tanimlayabiliriz.

 NOT;abstract classlarda normal open bir fonksiyon ve  degisken yazilmamali. cok gerekli degilse. Cunku abstract classlar
 sozlesme oldugu icin, child classlar bu sozlesmeyi zorunlu uygulamak zorundadir. Bu yuzden abstract classlarin icinde
 open bir fonksiyon yazmak mantikli degildir. Child classlar bu open fonksiyondan haberdar olmak icin abstract classin
 icine bakmak zorunda kalirlar.
 Bir abstract classda kullanilacak open bir fonksiyonu yeni bir class inherit ederek openi onun icine koymak mantiklidir.


 5- abstract olarak yazilmis class a yeni eklenen tum abstract yapilar(fonksiyon, property),
 tum  abstract olmayan child classlarda override edilmek zorundadir.

 6- bir abstract class in instance olusturamayiz. open bir class ile abstract class in farki budur.
 base classlar bu yuzden abstract yapilir ki instance olusturulamasin. Projenin herhangi bir yerinde anlami degistirilmesin diye.
 Instance'i olusturulamadigi icin singleton pattern abstract classlarlada olusturulabilir.

 7- abstract class bir diger abstract class i inherit ediyorsa abstract yapilari override etmek zorunda degildir.
 ama child class abstract degilse mecburen ust abstract classdaki overridelari etmelidir

 8 - x adli abstract bir class i miras alan, y adli abstract class zorunlu olmadigi halde x classinin butun abstract yapilarini
 override ederse ; y classini miras alan duz bir class artik bu abstract yapilari override etmek zorunda degildir. Cunku override
 edilmis bir yapi  body almis olur.


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

    //opsiyonel yapilar
    open val policeOfficer: Police = TODO()
    open fun getPoliceOfficer(): Police = TODO()


}



abstract class McDonaldsExpress : MCDonaldsFranchize(){  //bir abs diger abs class i miras alabilir fakat memberlari override etmek zorunda degildir.
    abstract  fun sellCoffee(): McCoffee /*bazi mcdonaldslar kahvede satiyor expresse kendi abst func ile kahve satisinida ekliyoruz.
                                           open olarak class icinde yazmaktansa yeni bir child olusturup icinde tanimlamak onemli
                                           10 franchizeda kahve yokken birinde varsa bunu base abstracta yazmak yerine boyle yapilmali*/
     override fun clean(clock: Int) {
        println("Clean time: $clock")
    }

     override val fridge: Fridge   // abstract propertyleride override edebiliriz.
        get() = TODO("Not yet implemented")

}


  class McDonaldsMaltepe : MCDonaldsFranchize(), McDonaldsService { /*bir duz class abs class i inherit alabilir ama abstract
                                                                      classdaki butun abstract yapilari override etmek zorundadir.*/
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
    override fun clean(clock: Int) {  //8. madde ornegi; 2. child classda override old icin 3. child classta opsiyoneldir.
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

/**
    --Kotlin'de abstract sınıfları kullanmanın avantajları:
    1-Abstraction: Abstract sınıflar, implementasyon detaylarını belirtmeden farklı sınıflar arasında ortak bir
    sözleşme tanımlamak için bir yol sağlar. Bu, kodunuzun modülerliğini ve sürdürülebilirliğini artıran soyutlamalar
    oluşturmanıza olanak tanır.

    2-Polimorfizm: Abstract sınıflar, aynı arayüze sahip farklı türlerde nesneler oluşturmanıza olanak tanır,bu da
    polimorfik davranışı mümkün kılar.

    3-Kod Yeniden Kullanılabilirliği: Abstract sınıflar, birden fazla sınıfın aynı abstract sınıfı miras almasina ve
    aynı abstract methodlari ve propertyleri paylaşmasına izin vererek kodu yeniden kullanmanın bir yolunu sağlar.

    4-Ortak Davranışların Uygulanması: Abstract sınıflar, kendi alt sınıflarına ortak davranış uygulamak için bir yol
    sağlayarak her bir alt sınıfta yazılması gereken kod miktarını azaltır.

    --Kotlin'de abstract sınıfları kullanmanın dezavantajları:
    1-Limited Instantiation: Abstract sınıflar instance olusturamaz, bu nedenle sınırlı instantiation detayı sağlarlar.

    2-Complexity: Abstract sınıflar kodunuzu daha karmaşık hale getirebilir, özellikle de birden fazla abstract sınıfı
    miras alan çok sayıda sınıfınız varsa.
 */

