package basics.control_flows

fun main() {
    var numberOne = 10
    val numberTwo = 5

    println("NumberOne : $numberOne")
    println("NumberOne : ${numberOne++}") // sonuna ++ koyulursa once yapilacak islemler yapilir sonra artirilir, printte hala 10 gozukur printten sonra artmis olur is gorusmesinde soruluyor.
    println("NumberOne : $numberOne") // burada 11 oldu deger
    println("NumberOne : ${++numberOne}") // bu durumda ise degisken degeri artirilir sonra yapilmasi gerekenler yapilir

    // + operatoru yerine .plus()
    // - yerine .minus()
    // * yerine .times()
    // / yerine .div()
    // % kalani verir, yerine .rem() kullanilabilir

    val grade = 11
    /**  compareTo 1. sayi ikinci sayidan kucukse -1, esitse 0, buyukse 1 , dondurur
     * equals() fonk ise verilen degerle parametredeki degeri karsilastirir true false dondurur
     */
    grade.compareTo(100) //-1
    grade.compareTo(11) //0
    grade.compareTo(1) //1
    grade.equals(1) //false
    !grade.equals(2) //true


    var a = 20
    val b = 5

    //once islemi yap sonra cikan sonucu soldaki degiskene ata
    a += b     //a = 25
    a -= b     //a = 20
    a *= b     //a = 100
    a /= b     //a = 20
    a %= b     //a = 0



    val x = 10
    val y = 5
    val flag = true
    println(+x)  //10      pozitiflik verdi
    println(-y)  //-5   negatiflik verdi
    println(!flag)  //tersini alir false dondurur


    /**
     *  === ifadesi isaret edilen referanslarini karsilastirir. yani memory adreslerini karsilastirir.
     *  == ifadesi degeri karsilastirir. if case lerde bu kullanilir cunku karsilastirma yapariz
     *  = ifadesi deger atamasi yapar
     */

}