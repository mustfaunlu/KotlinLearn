package `4 Classes`

/**
 1- Interfacelerin, Abstract classlardan en buyuk farki state tutamiyor! oluslari.
 Yani icinde bir veri tanimlayip tutamiyoruz.

 2- Interface icerisindeki initial degeri olmayan bir property(field) ya da body si olmayan bir fonksiyon
 abstract olarak da tanimlanabilir.ama abstract tanimlama geregi yoktur.(redundant)

 3- interfaceleri anlami geregi final yapamazsiniz. open yazilmasi da gereksizdir.(redundant)

 4- abstractlar; sozlesmeyken kesinlikle(override) sahip olmasi gerenkenleri soyler, default olarak yapilmasi gerekli olanlar
 interfaceler; ise herhangi bir classin interface e sahip olmasi demek yeteneklerini artiryor demektir. harici beceri seti kazandirir

 5- Eger bir class a harici beceri seti kazandirmak isteniyorsa interface e yazmak gerekiyor.
 abstract class a open function tanimlamak yerine interface ile yapilmalidir.
 bu functionu interface verip class a implement edersin daha temiz kod yazmis olursun.

 6- open bir fonksyionu abstract icine , abstract icindeki bir membera ihtiyac duyoyorsa tanimlariz.
 yani abstract class in fonksiyonu abstract classdaki herhangi bir yapiyi kullanarak override edildigi chield classda superin cagrilmasiyla
 bir is yapiyordur. fakat hicbirseye ihtiyac duymuyorsa abstract yerine interface tanimlamaliyiz. Zaten interfacelerin icine yazdigimiz
 fonksiyonlarin genelde bodysi olmaz.

 7- interface fonksiyonlari bir class icindeki hicbir yapiya ihtiyac duymazlar bir yerde tetiklenmeyi bekleyip baska bir yerde calismayi bekler.

 8- class lar inherit edilirken, interfaceler implement edilir. open koyma mantigi bu yuzden yoktur zaten amac implementtir.

 9- abstract classlar bir kez extends edilirken, interfaceler birden fazla implement edilebilir

 */

interface MyInterface {
    val prop: Int //abstract


    /*
    aslinda burada veri tutmuyoruz bu bir propertydir.
    property set get functionlari old icin interfacelerdede
    function tanimlandigi icin veri tutuyormusuz gibi oluyour.
    Bu state tuttugu anlamina gelmez  Foo yu degistiremeyiz.
     */
    val propertyWithImplementation: String
    get() = "Foo"

    fun foo(){
        print(prop)
    }

    fun foo2()

    abstract fun bar() // abstract olabilir ama gereksizdir.
}

/**
 * Interfacelere tanimlanan propertylerde (field) initial deger alma zorunlulugu yoktur.
 */

interface Named{
    val fullName: String?
    //val fullName: String? = "fdafda"   yapamayiz cunku interface state tutmaz.
}

interface Person : Named { //interfaceler birbirni implement edebilir inherit gibi : ile yaparlar birden fazla implementler , ile ayrilir.
    val firstName: String
    val lastName: String

    override val fullName: String?
        get() = "$firstName $lastName"

}

interface A {
    fun foo(){
        print("A")
    }

    fun bar()


}



interface B {
    fun foo(){
        print("B")
    }
    fun bar(){
        print("Bar")
    }
}

/**
 * Eger implement edilen interface, baska bir interfaceden implement ediliyorsa
 * ve bu interrface in uyerleri child interfacede override  edilmis ise.
 * Child interface i implement eden classda bu propertynin override edilme zorunlulugu kalkar.
 *
 *
 *
 * Eger bir abstract class bir interface i implment ediyorsa, o interfacesin override edilmesi
 * zorunlu fonksiyonlarini override etmeyebilir. Abstract classlar icin bu opssiyoneldir.
 *
 */
//abstract class Employe(
//    override val firstName: String, zorunlu degil  cunku abs class
//    override val lastName: String, zorunlu degil
//    override val fullName: String?,  zorunli degil
//    val position : Int
//
//): Person
 class Employe : Person {
    override val firstName: String
        get() = TODO("Not yet implemented")
    override val lastName: String
        get() = TODO("Not yet implemented")

    override val fullName: String? //zorunlu degiliz cunku person icinde override edilmisti.
        get() = super.fullName
}


/**
 * bir interface icerisindeki fonksiyonlardan bodysi olanlar override edilmek zorunda degildir.
 * Bodysi olmayan tum fonksyonlar ise class a implement edildiginde override edilmek zorunda.
 *
 * Propertyler de interfacelere tanimlanailirer.
 * Propertylerden de deger atamassi yapilmamis olanlar zorunlu olarak override edilirler,
 * eger property initial degeri aldiysa(get() ine statik geri donus degeri verildiyse), override etme zorunlulugu ortadan kalkar.
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

    override fun bar() {
        TODO("Not yet implemented")
    }

}





/**
 * birden fazla interface bir class a tanimlanabilr. Abstractlar ise bir clasa miras verilir.
 * birden fazla interface aralarina virgul ile tanimlanir
 *
 * : isaretinden sonra eklenen yapilarin hangileriini class (inheritance)
 * hangilerinin interface(implements) oldugunu karitirmamak icin
 * bu yapilarin sonuna bakmamiz lazim. Sonunda () paranezlerino goruyorsak :'dan sonra
 * gelen yapi classtir(inheritance) miras alma islemi yapiliyordur. () yoksa intereface dir.
 */

open class E()
/**
 * 2 farkli interface in ayni fonksiyonlari olmasi durumunda,
 * bu fonksiyonlarin override edilmesi sirasinda ayni fonksiyonu 2 kere yazarak override edemeyiz.
 *
 * Eger implement ettigmiz farkli interfacelerin, birebir ayni (isimde parametrede geri donuste) fonksiyonlari bulunuyorsa, tek bir fonksiyon
 * override islemi yapilir. Bunun icersinden  hangisiniin bodysine erismek istiyorsak
 * o interface in ismini <> isarelteri arasina yazmamiz gerekyor.
 *
 * Eger implement edilen 2 interfacedede birebir ayni (isimde parametrede geri donuste)fonksiyonlar var ise bu durumda bodyleri olsada
 * override edilmeleri zorunludur.
 */
class D : E(), A, B {
    override  fun foo(){
        //super.foo() birebir ayni foo fonksiyonu old icin ide bunu bilemez asagidaki gibi tanimlamaliyiz.
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar(){
        //super.bar()  //A nin barinin bodysi olmadigi icin super burada B interfacenindir. <> yazmamiz gerekmez.

    }

}


