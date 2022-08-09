package `4 Classes`

import kotlin.properties.Delegates

/**
 *                                          OBSERVABLE
 *
 * live datalar ile calisirken observable pattern isimize yarayacak
 * harici kotlin icindede Delegates.observable seklinde yer alir.
 * bir degiskenin her an degeri degistiginde haber almak istiyorsak  observable pattern kullanilir.
 * oldValue ve newValue sini bize gosterir.
 * ornek olarak doviz degerlerini surekli akis halinde tutuyoruz newValue oldValue den yuksekse yesil dusukse kirmizi oluyor.
 *
 *
 * android tarafindaki livedata larda arka planda observable pattern kullanir fakat orda eski value alamayiz surekli yeni gelir
 *
 *
 * bazen is gorusmelerinde sorulabilir
 * bir degiskenin degeri set edilirken degerlerinin bir interface veye highorder ile disari bildirilmesi.
 *
 *
 *
 *                                              VETOABLE
 * higher orderi boolean doner. observable ise unit doner.
 * observable olay sadece gozlemlemek, vetoable ise gozlemlerken icine business rule da eklenir.
 * vetoable son satiri true ise newValue atanir. eger false donuyorsa oldValue kalir. newValue atanmaz veto edilir.
 *
 *

 */
fun main() {
    val deneme = User85 {oldValue, newValue -> println("old: $oldValue, new: $newValue") }  // custom observable cagirdik
    deneme.aram = 324  //custom observable miza newValue atadik

        //asagida ise kotlinin bize sagladigi kisa yoldan observable ve vetoable patternlerimizi kullandik.
    var x: Int by Delegates.observable(31) { property, oldValue, newValue -> println("old: $oldValue, new: $newValue") }

    x =40043

    x = 3

    var str: String by Delegates.observable("alkali metal") { _, oldValue, newValue -> println("old: $oldValue, new: $newValue") }

    str = "celik "

    var xxx: Int by Delegates.vetoable(22) { property, oldValue, newValue -> oldValue < newValue }

    xxx = 23124
    println(xxx)
}


class User85(val notify: (Int, Int) -> Unit) { //custom olarak observable pattern yazdik

    var aram = 565
        set(value) {
            notify(field,value)
            field = value
        }
}

//high order yerine interface de kullanabiliriz.

//interface Notify {
//    fun notify1(oldValue: Int, newValue:Int)
//}