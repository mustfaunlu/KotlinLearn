package `4 Classes`

/**
 * Nested Classlar outer(dis) class in uye propertylerine ya da fonksiyonlarina erisemezler.
 * Nested classlar static olarak saklanirlar.  Bundan dolayi da outer class uzerinden nested class a
 erismek icin Outer.NestedClass() seklinde erisebiliriz.
 *
 * Inner class a baktigimizda ise static olarak tutulmazlar.. Bundan dolayi erismek icin
 Outer().InnerClass() seklinde outer class in intance indan erisiriz.
 * Inner class in icine ye ni bir nested class eklenemez.
 */

class Outer {
    private  val name = "Mustafa"
    val surName = "Unlu"

    fun getAge(): Int = 25

    class NestedClass {   // genelde tek dosyadan farkli classlari gorebilmek icin yazilirlar.
        fun printName(){
            //name     outer class in hicbir uyesine erisemeyiz
            //surName
            //getAge()
        }
    }
}

interface OuterInterface {
    class DenemeA
    interface  NestedInterface
}

class  Outer2 {
    private val name = "Mustafa"
    val surName = "unlu"

    fun getAge() : Int = 24

    inner class InnerClass {
        fun printName() { //static olsaydi Outer2 de memoryde yer kaplayacak ve memory leak e neden olacakti
            name
            surName
            getAge()
        }
    }
}
fun main() {
    val outer = Outer()
    outer.getAge()
    outer.surName

    Outer.NestedClass().printName()
    //Outer().NestedClass().printName()  boyle yazarsak nested outer in bir parcasi gibi olur o yuzde instance ile erisemeyiz.

    val outer2 = Outer2()
    outer2.surName
    outer2.getAge()
    Outer2().InnerClass().printName()

}