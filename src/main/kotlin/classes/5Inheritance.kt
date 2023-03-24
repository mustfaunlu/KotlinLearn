package classes

/**
 * javada extends keywordu kullanilirken kotlinde inherit edilmesi icin class open olmalidir ve : operatoru ile inherit alinir.
 * kotlinde classlar default olarak finaldir. final olan class inherit edilemez. final yazmamiza gerek yoktur default olarak finaldir.
 *
 * miras alirken parent class in istegidimiz constructori ile miras alabiliriz.

 * bir child class varsa o child class ana classdan daha fazla ozellige sahiptir.(her zaman degil)
 * ust classlar child classlardan her zaman memory olarak ddaha performanslidir.
 * hic kullanilmayan bir fonksiyonu ust classa vermek yerine ust class'i miras alan child class a verirsin
 ve performansini etkilemezsin hemde okunakligi artar. Mesela 10 tane class var ve 9 tanesi ayni fonksiyonu kullaniyorsa
 bir tanesi farkli kullanim yapiyorsa ust classa yazmak yerine ust classi miras alan child class a yazarsin.


 * bazen ust classin yetkinliklerini child classlar ile ihtiyaca uygun olarak degistirmek isteyebiliriz.
 * yani ust classi sablon olarak kullanabiliriz.
 * alt classda ozelligi degistiririz bunada "override" deriz.
 * ust classdaki bir beceri setini her zaman eklemeyebiliriz.(superi her zaman eklemek istemeyiz)
 *
 * bazen fonksiyonlarda ve degiskenlerdede open keywordu olacak. Bunun sebebi class open olursa miras alinir
 * degisken veya fonksiyon open olursa bunlarin kendisini override edebliriz.
 *
 * polimorfizm: ust class a yazilan bir islemin anlamini degistirme yetenegi.
 * asagidaki ornektekteki drawShape() fonksiyonun her child classda farkli gorevi yapmasi polimorfizmdir(cokbicimlilik).
 *
 *
 * bazen ust class i miras alindigi gibi alt classida baska bir class miras alabilir.
 * bir child class ustundeki butun atalarinin private olmayan open olan butun ozelliklerini miras alir.
 *
 *access modifier; open ve finaldir (miras alinabilir alinamazligi ve override edilip edilemezi duzenler)
 *visibility modifier; public private internal protected (encapsulation saglar)
 *
  */

// open bir func. varken class in final olmasi sacma bir kullanim olacaktir. open func. bir espirisi kalmaz.

open class Shape(val name: String) {
    var mColor: String = ""
    open var mEdgeCount: Int = 0

    constructor(name: String, color: String, edgeCount: Int): this(name){
        mColor = color
        mEdgeCount = edgeCount
    }

    constructor(name: String, color: String): this(name){
        mColor = color

    }

    open fun drawShape(){
        println("name: $name")
        println("color: $mColor")
        println("edgecount: $mEdgeCount")
    }

    fun calculateArea(): Int = if(mEdgeCount != 0){
        mEdgeCount * mEdgeCount
    }else{
        0
    }
}

class Rectangle(name: String) : Shape(name){   //miras alinan class in herhangi bir constructoru verilmelidir name gibi


    override fun drawShape(){

        super.drawShape() //ust classtaki(shape) fonksiyonuda calistirir. isimize yaramiyorsa gerek yok yazmayabiliriz.
        this.drawShape() // bagli olunan classtaki(rectangle) fonksiyonu calistiirr.
        calculateArea()

        val rectangle = "dikdortgen cizildi."
        println(rectangle)
    }

    override var mEdgeCount: Int
        get() = 213213 // istersek super.mEdgeCount   dondurebiliriz.
        set(value) {}



}

open class Square(name: String,color: String,edgeCount: Int) : Shape(name, color, edgeCount){ //shape'in farkli constructor'i ile miras aldik
    final override fun drawShape() {  //ust classda open olan bir fonksiyonu alt classda final yaparsak final kalir. ama alt classda sifirdan yazilabilir
        val square = "kare cizildi"
    }
}
/*------------------------------------------------------------------------------------------------------------------------------------------------*/

/**
 * Ayrıca bir val property'i bir var property olarak override edebilirsiniz, ancak tersini yapamazsınız.
 Buna izin verilir çünkü bir val property'si esasen bir get metodu bildirir ve var olarak override edilmesi
 ek olarak türetilmiş sınıfta bir set metodu bildirir. Tersi durumunda set metodunu silemeyecegimiz icin olmaz.
 *
 * Primary constructor'daki property bildiriminin bir parçası olarak override anahtar sözcüğünü kullanabileceğinizi unutmayın:
 */
interface Xoo {
    val vertexCount: Int
}

class Loo(override val vertexCount: Int = 4) : Xoo // Always has 4 vertices

class Polygon : Xoo {
    override var vertexCount: Int = 0  // Can be set to any number later
}

/*------------------------------------------------------------------------------------------------------------------------------------------------*/


fun main() {
    val shape = Shape("Shape")
    val rectangle = Rectangle("rectangle")
    val square = Square("Square", "Cyan",4)


    //compiletime polimorfizm cagirimlari
    fun main (args: Array<String>) {
        println(doubleof(4))
        println(doubleof(4.3))
        println(doubleof(4.323))
    }


    //runtime polimorfizm cagirimlari
    var a = Sup()
    a.method1()
    a.method2()

    var b = Sum()
    b.method1()
    b.method2()
}

/**
 * Compile-time polimorfizmde, fonksiyonların adı, yani imzası aynı kalır ancak parametreleri veya dönüş tipi farklıdır.
 Compile time'da compiler, parametrelerin türüne ve daha fazlasına bağlı olarak hangi fonksiyonları çağırmaya
 çalıştığımızı çözer. Bu örneğe göz atın:
 */

fun doubleof(a: Int):Int {
    return 2*a
}

fun doubleOf(a:Float):Float {
    return 2*a
}

fun doubleof(a:Double):Double {
    return 2.00*a
}

 /** Şimdi run-time polymorphism hakkında konuşalım. Run-time polymorphism'de compiler, runtime'da overridden/overloaded
 metotlara yapılan bir çağrıyı çözümler. Metot overriding kullanarak run-time polymorphism elde edebiliriz.
 Bir üst sınıfı miras aldigimiz ve member metodlarindan birini override ettigimiz bir örnek deneyelim:
 */

 open class Sup{
     open fun method1(){
         println("printing method 1 from inside Sup")
     }
     fun method2(){
         println("printing method 2 from inside Sup")
     }
 }

class Sum:Sup(){
    override fun method1(){
        println("printing method 1 from inside Sum")
    }
}