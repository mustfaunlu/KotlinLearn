package `4 Classes`

/**
 * Interfacelerin, Abstract classlardan en buyuk farki state tutamiyor! oluslari.Yani icinde bir veri tanimlayip tutamiyoruz.
 * interface fonksiyonlari bir class icindeki hicbir yapiya ihtiyac duymazlar bir yerde tetiklenmeyi bekleyip baska bir yerde calismayi bekler.
 *
 * Interface icerisindeki initial degeri olmayan bir property(field) ya da body si olmayan bir fonksiyon
 * abstract olarak da tanimlanabilir.ama abstract tanimlama geregi yoktur.
 *
 * interfaceleri anlami geregi final yapamazsiniz. open yazilmasi da gereksizdir.(redundant)
 *
 * class lar inherit edilirken, interfaceler implement edilir. open koyma mantigi yoktur zaten amac implementtir.
 *
 * abstractlar; sozlesmeyken kesinlikle(override) sahip olmasi gerenkenleri soyler, default olarak yapilanlar
 * interfaceler; ise herhangi bir classin interface e sahip olmasi demek yeteneklerini artiryor demektir. harici beceri seti kazandirir
 *
 * Eger bir class a harici beceri seti kazandirmak isteniyorsa interface e yazmak gerekiyor.
 * abstract class a open function tanimlamak yerine interface ile yapilmalidir.
 * bu functionu interface verip class a implement edersin daha temiz kod yazmis olursun.
 *
 * open bir fonksyionu abstract icine yaziyorsak abstract icindeki bir bilgiye ihtiyac duyoyorsa tanimlariz. yani superi cagirarak is yapiyorsa tanimlanir.
 * fakat hicbirseye ihtiyac duymuyorsa abstract yerine interface tanimlamaliyiz.
 */

interface MyInterface {
    val prop: Int //abstract


    /*
    aslinda burada veri tutmuyoruz bu bir propertydir.
    property set get functionlari old icin interfacelerdede
    function tanimlandigi icin veri tutuyormusuz gibi oluyour.
     */
    val propertyWithImplementation: String
    get() = "Foo"

    fun foo(){
        print(prop)
    }

    fun foo2()
}

/**
 * Interfacelere tanimlanan propertylerde (field) initial deger alma zorunlulugu yoktur.
 */

interface Named{
    val fullName: String?
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val fullName: String?
        get() = "$firstName $lastName"

}

/**
 * Eger implement edilen interface, baska bir interfaceden implement ediliyorsa
 * ve bu interrface in uyerleri child interfacede override  edilmis ise.
 * Child interface i implement eden classda bu propertynin override edilme zorunlulugu kalkar.
 *
 * Eger bir abstract class bir interface i implment ediyorsa, o interfacesin override edilmesi
 * zorunlu fonksiyonlarini override etmeyebilir. Abstract classlar icin bu opssiyoneldir.
 */

//abstract class Employee : Person {
//
//}

class Employee: Person{

}

/**
 * bir interface icerisindeki fonksiyonlardan bodysi olanlar override edilmek zorunda degildir.
 * Bodysi olmayan tum fonksyonlar ise class a implement edildiginde override edilmek zorunda.
 *
 * Propertyler de interfacelere tanimlanailirer.
 * Propertylerden de deger atamassi yapilamamis olanlar zorunlu olarak override edilirler,
 * eger property initial degeri aldiysa(get() i ne statik geri donus vermek), override etme zorunlulugu ortadan kalkar.
 *
 * Interface icerisine tanimli ve override edilme zorunlulugu olan propertyler primary constructor icerisinde de override edilebilirler.
 *
 * Bodysi olan (override edilme zorunlulugu olmayan) bir interface fonksiyonu override edilirise.
 * override edildigi yerde bodysi icerisinden superi cagirabilir. ( cagirmak zorunda degilsiniz)
 */

class Child(override val prop: Int = 29) : MyInterface {

    //override edilmesi zorunlu degildi
    override val propertyWithImplementation: String
        get() = "implemented prope"

    //bodysi old icin override edilme zorunlulugu yook.
    override fun foo() {
        super.foo()  //body si varsa superi cagrilir. yoksa cagiramayiz.
    }


    override fun foo2() {
        TODO("Not yet implemented")
    }

}

interface A {
    fun foo()
}

interface B {
    fun bar()
}

/**
 * birden fazla interface bir class a tanimlanabilr. Abstractlar ise bir clasa miras verilir.
 * birden fazla interface aralarina virgul ile tanimlanir
 *
 *
 * : isaretinden sonra eklenen yapilarin hangilareini class (inheritance)
 * hangisinin interface(implements)
 */

open class E()
/**
 * 2 farkli interface in ayni fonksiyonlari olmasi durumunda,
 * bu fonksiyonlarin override edilmesi sirasinda ayni fonksiyonu 2 kere yazarak override edemeyiz.
 *
 * Eger implement ettigmiz interfacelerin ayni isimde fonksiyonlari bulunuyorsa, tek bir fonksiyon
 * override islemi yapilir. Bunun icersinden  hangisiniin bodysine erismek istiyorsak
 * o interface in ismini <> isarelteri arasina yazmamiz gerekyor.
 *
 * Eger implement edilen 2 interfacedede ayni fonksiyonlar var ise bu durumda bodyleri olsada
 * override edilmeleri zorunludur.
 */
class D : E(), A, B {
    override  fun foo(){
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar(){
        super.bar()  //A nin barinin bodysi olmadigi icin super burada B interfacenindir. <> yazmamiz gerekmez.
    }

}


