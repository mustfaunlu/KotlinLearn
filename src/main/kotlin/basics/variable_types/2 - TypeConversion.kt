package basics.variable_types

fun main() {

    /**
     *      Implicit Type Conversion : Ortulu - belirgin olmayan sekilde tip donusumu.
     *      Explicit Type Conversion : Acik - belirgin tip donusumu
     * **/

    /**
     *      Kotlin'de implicit type conversion yoktur.
     * **/
//    val number : Int = (Int) 3L // Calismaz.

    /**
     *      Tip donusumu icin kullanabileceginiz fonksiyonlar;
     *      toByte(), toShort(), toInt(), toLong(), toDouble(), toFloat(), toChar(), toString(),
     *      toUByte(), toUShort(), toUInt(), toULong(), toDuration(), toBigDecimal(), toBigInteger()
     * **/

    /* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      1-Numbers.kt dosyasinin icerisindeki degisken tiplerinin deger araliklarini inceleyiniz.
     *      Deger araligi kucuk olan tipler buyuk olan tiplere, sorunsuz, acik olarak(explicit) donusturulebilir.
     * **/
    val schoolNumber = 126.toByte()
    val convertedValue: Short = schoolNumber.toShort()

    println("schoolNumber : " + schoolNumber)
    println("convertedValue : " + convertedValue)

    /* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Numbers.kt icerisindeki degisken tiplerinin deger araliklarini inceleyiniz.
     *      Deger araligi buyuk olan tipler kucuk olan tiplere acik olarak(explicit) donusturulurken dikkatli olunmalidir.
     *      Ust tipten bir degiskenin degeri, alt tipin deger araligindan pozitif yonde fazla buyuk,
     *      negatif yonde fazla kucuk ise bu tip donusumu sirasinda yanlis deger atamalari yapilacaktir.
     * **/

    val tcIdentityNumber = 15860826657
    val convertedInt = tcIdentityNumber.toInt()

    println("convertedInt : " + convertedInt) // -1319042527 long degeri kendinden kucuk olan int'e cast ettik yanlis sonuc verdi

    /* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Kapali(implicit) tip donusumu olmasa bile, iki number tip arasinda matematiksel islem yapilirsa, sonuc degeri,
     *      cikan degerin tipinde olacaktir.
     * **/

    val totalValue: Long = tcIdentityNumber + schoolNumber // Long + Byte = Long

    /* -------------------------------------------------------------------------------------------------------------------*/
    /**
     * bir degiskene explicit sekilde tip belirtmeden deger atarsak otomatik olarak Int olur
     */
    val numnum = 127 //Int
    val numnum2: Byte = 127 //Byte

    /* -------------------------------------------------------------------------------------------------------------------*/


    /**
     *      Kotlin'in sagladigi yukaridaki tip donusumlerinin yaninda, String to Number donusumler icin
     *      Java'dan asina oldugumuz tip donusumlerini de kullanabiliriz.
     *      Bunun icin ilgili tiplerin Java versionlarini kullanmalisiniz.
     *
     *      java.lang.Byte.parseByte(), java.lang.Short.parseShort(), java.lang.Int.parseInt(),
     *      java.lang.Long.parseLong(), java.lang.Double.parseDouble(), java.lang.Float.parseFloat(),
     *      java.lang.Byte.parseUByte(), java.lang.Short.parseUShort(), java.lang.Int.parseUInt(),
     *      java.lang.Long.parseULong(), java.lang.Double.parseUDouble(), java.lang.Float.parseUFloat()
     *  **/
    val str: String = "3"
    val intValue = Integer.parseInt(str)

    /* -------------------------------------------------------------------------------------------------------------------*/

    /**
     * Division of integers
     * Integerlar arasindaki bolme islemi her zaman bir integer verir. Kesirli kisim gozonunde bulundurmaz.
     *  Kesirli kisim ile isteniyorsa bolunecek sayilardan birini double'a cast etmeliyiz.
     */

    val x = 5 / 2
    //println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
    println(x == 2)

    val y = 5L / 2
    println(y == 2L) //Yine kesirli kisim gorunmez

    val z = 5 / 2.toDouble()
    println(z == 2.5)

}