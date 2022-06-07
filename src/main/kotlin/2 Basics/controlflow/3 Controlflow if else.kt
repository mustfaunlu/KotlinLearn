package `2 Basics`.controlflow

import java.io.IOException

fun main() {
    /**
     * if else case lerinden sonra suslu parantez acilir ve kapanir
     * ancak bu suslu parantezler arasina tek satir kod yazacaksak suslu parantez kullanmak zorunda degiliz
     * if else caselerinin state ve expression olmak uzere 2 kullanimi vardir
     * State kullanimi sadece if else kullanarak sartli durumlarimizi kodlamaktir.
     *  expression kullanimi ise bir value ya deger olarak esitligin karsi tarafina if else kodlarimizi yazaariz
     *  expression olarak yapilan kullanimda, if else bloklari icindeki en son satir degiskene deger olarak verilir.
     */

    print("Ogrenci misin?")
    val answer = readln()

    //state kullanimi
    if (answer.contains("Evet", ignoreCase = true)){  //ignoreCase => buyuk kucuk harfe dikkat etsin true, etmesin false
        println("ogrenci")
    } else {
        println("ogrenci  degil")
    }

    // expression kullanimi. {} icerisindeki son satir, deger olarak degiskene atanir.
    var result: String = if (answer == "Evet"){
        "ogrenci"
    } else {
        "ogrenci degil" // bu satir result a atanir.
    }
    println(result) // ogrenci degil

    /**
     * Kotlin de if elselerin Expression kullanimindan oturu ternary ooperatoru yoktur
     * Ternary yerine asagidaki gibi kullanim yapabliriz.
     */
    val isStudent = false
    val isStudent2 = if (isStudent) {"true"} else {"false"}

    /**
     * else if lerden olusan bloklarda kullanabilirz. farkli kosullari bu bloklarda kullanabilirz
     * her zaman iki secenegimiz olmaz 4 5 6 secenek varsa else if leri if case ekleyebiliriz
     * harf notu hesaplamasi orneginde kullanabiliriz en bariz ornek
     */

    // true && true = true
    // true && false = false
    // false && false = false
    // false && true = false

    // true || true = true
    // true || false = true
    // false || true = true
    // false || false = false

    /**
     * .equals,  ==  ile karsilastirma yaparken once tipler karsilastirilir tipler uymuyorsa hata verir
     */

  //  if(10 == 10L) {} bu kod calismaz quiz sorularinda gelebilir. Bu kod derlenmez.

    if(10 == 10L.toInt()){
        println("true")
    }

    /**
     * else if ile alt alta if if if yazmak arasindaki fark nedir?
     * else if de dogru kontrol bulununca  alttaki caseler calistirilmaz
     * ama alt alta if if if caseleri yazilirsa hepsi calisacaktir.
     * Else if li bir case yaziyorsak farkli bir seyi kontrol etmeyiz ayni seyi kontrol ederiz.
     * birbirinden farkli durumlari kontrol eden caselerde Alt alta if ile kontrol etmeliyiz.
     */

    /**
     * bazi durumlarda if else yazmaktansa, if casini yazip return ya da throw gibi kodun devam etmesini bozabiliriz
     * kod calisirken bu if case ine girmezse devam eden kod blogu calisir
     * bu da pratikte else case i demek olur. Bu sekkilde kodu biraz daha temiz gosterecektir.
     */
    if(isStudent){
        println("Student")
    }else{
        otherMethod()
    }


    if(isStudent){
        println("Student")
        throw  IOException()
        //return
    }
    var grade = 10
    if(grade == 100){
        return
    }
    otherMethod()
}
private  fun otherMethod(){}


