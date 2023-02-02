package classes

/**
 * bir child class varsa o child class ana classdan daha fazla ozellige sahiptir.(her zaman degil)
 * ust classlar child classlardan her zaman memory olarak ddaha performanslidir.
 * hic kullanilmayan bir fonksiyonu ust classa vermek yerine miras alan child class a veririsin ve performansini etkilemezsin hemde okunakligi artar
 * bazen ust classin yetkinliklerini child classlar ile ihtiyaca uygun olarak degistirmek isteyebiliriz.
 * yani ust classi sablon olarak kullanabiliriz.
 * alt classda ozelligi degistiririz bunada override deriz.
 * ust classdaki bir beceri setini her zaman eklemeyebiliriz.(superi her zaman eklemek istemeyiz)
 *
 * inherit alirken ana class in istegidimiz constructori ile inherit alabiliriz.
 *
 * javada extends keywordu kullanilirken kotlinde inherit edilmesi icin class open olmalidir ve : operatoru ile inherit alinir.
 * kotlinde classlar default olarak finaldir. final olan class inherit edilemez. final yazmamaoza gerek yoktur default olarak finaldir.
 *
 * bazen fonksiyonlarda ve degiskenlerdede open keywordu olacak. Bunun sebebi class open olursa miras alinir
 * degisken veya fonksiyon open olursa bunlarin kendisini override edebliriz.
 *
 * polimorfizm: ust class a yazilan bir islemin anlamini degistirme yetenegi.
 * asagidaki ornektekteki drawShape() fonksiyonun her child classda farkli goreve yapmasi.
 *
 *
 * bazen ust class i miras alindigi gibi alt classida baska bir class miras alabilir.
 * bir child class ustundeki butun atalarinin private olmayan open olan butun ozelliklerini miras alir.
 *
 *access modifier; open ve finaldir (miras alinabilir alinamazligi ve override edilip edilemezi duzenler)
 * visibility modifier; public private internal protected (encapsulation saglar)
 *
  */

// open bir func. varken class in final olmasi sacma bir kullanim olacaktir. open func. bir espirisi kalmaz.

open class Shape(val name: String){
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
        //this.drawShape() // bagli olunan classtaki(rectangle) fonksiyonu calistiirr.
        calculateArea()

        val rectangle = "dikdortgen cizildi."
        println(rectangle)
    }

    override var mEdgeCount: Int
        get() = 213213 // istersek super.mEdgeCount   dondurebiliriz.
        set(value) {}



}

open class Square(name: String,color: String,edgeCount: Int) : Shape(name, color, edgeCount){
    final override fun drawShape() {  //ust classda open olan bir fonksiyonu alt classda final yaparsak final kalir. ama alt classda sifirdan yazilabilir
        val square = "kare cizildi"
    }
}

fun main() {
    val shape = Shape("Shape")
    val rectangle = Rectangle("rectangle")
    val square = Square("Square", "Cyan",4)
}