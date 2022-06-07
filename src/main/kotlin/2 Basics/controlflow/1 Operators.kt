package `2 Basics`.controlflow

fun main() {
    var numberOne = 10
    val numberTwo = 5

    println("NumberOne : $numberOne" )
    println("NumberOne : ${numberOne++}" ) // sonuna ++ koyulursa once yapilacak islemler yapilir sonra artirilir, printte hala 10 gozukur printten sonra artmis olur is gorusmesinde soruluyor.
    println("NumberOne : $numberOne" ) // burada 11 oldu deger
    println("NumberOne : ${++numberOne}" ) // bu durumda ise degisken degeri artirilir sonra yapilmasi gerekenler yapilir

    // + operatoru yerine .plus
    // - yerine .minus
    // * yerine .times
    // / yerine .div
    // % kalani verir, yerine .rem kullanilabilir

    val grade = 11
    /**  compareTo 1. sayi ikinci sayidan kucukse -1, esitse 0, buyukse 1 , dondurur
     * equals fonk ise verilen degerle parametredeki degeri karsilastirir true false dondurur
     */
    grade.compareTo(100) > 0
    grade.equals(1)
    !grade.equals(2)

    /**
     * var a = 20
     * var b = 5
     * once islemi yap sonra cikan sonucu soldaki degiskene esitle
     * a+=b     //25
     * a-=b     //20
     * a*=b     //100
     * a/=b     //20
     * a%=b     //0
     */

    var x = 10
    var y = 5
    var flag = true

    /**
     * +x  //10      pozitiflik verdi
     * -y  //-5   negatiflik verdi
     * !flag tersini alir false dondurur
     *
     *
     *
     */


    /**
     *  === ifadesi isaret edilen referans tiplerisi karsilastirir
     *  == ifadesi degeri karsilastirir. if case lerde bu kullanilir cunku karsilastirma yapariz
     *  = ifadesi deger atamasi yapar
     */

}