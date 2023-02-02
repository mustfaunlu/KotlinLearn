package classes

/**
 * Nested Classlar outer(dis) class in uye propertylerine ya da fonksiyonlarina erisemezler.
 * Nested classlar static olarak saklanirlar.  Bundan dolayi da outer class uzerinden nested class a
 erismek icin Outer.NestedClass() seklinde erisebiliriz.
 * Nested class in icerisine ise bir nested ya da inner fark etmeksizin class ekeleyebiliriz.
 *
 * Inner class a baktigimizda ise static olarak tutulmazlar.. Bundan dolayi erismek icin
 Outer().InnerClass() seklinde outer class in intance indan erisiriz.
 * Inner class in icine yeni bir nested class eklenemez. Ancak yine inner class eklenebilir.
 */

class Outer {
    private  val name = "Mustafa"
    val surName = "Unlu"

    fun getAge(): Int = 25

    class NestedClass {   // genelde tek dosyadan farkli classlari gorebilmek icin yazilirlar
        fun printName(){
            //name     outer class in hicbir uyesine erisemeyiz cunku NestedClass statictir
            //surName
            //getAge()
        }

        fun printName2(outer: Outer){   //direk memory leak bunu yapmak gunahtir. :))) bunu yapmak yerine inner yap!!
            outer.name
            outer.surName
            outer.getAge()
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

    inner class InnerClass { //static olsaydi Outer2 de memoryde yer kaplayacak garbage collector silmeyecekti
        // ve memory leak e neden olacakti
        fun printName() {
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

    //asagidaki gibi yazarsak nested outer in bir parcasi gibi olur o yuzde instance ile erisemeyiz.
    //outer.NestedClass().printName()
    //Outer().NestedClass().printName()


    val outer2 = Outer2()
    outer2.surName
    outer2.getAge()
    outer2.InnerClass().printName()
    Outer2().InnerClass().printName()

}