package `4 Classes`

import java.lang.reflect.Field

/**
 * private field lara erismek icin kullanilir.
 * kendi class inda reflection yapmak sacma olur thirth party kutuphanelerde kullanilabilir.
 * Kullanirken progguard dan kaynakli sorunlara dikkat etmek lazim.
 * Cok lazimsa kullanilmali.
 *
 *     * !NOTTT
 * Eger yazilan uygulama kodlarken sikintisiz calisiyorsa apkyi imzalarken proguarddan gecirdigimiz durumda
 * problemli calisiyorsa kesinlikle ilk bakmamiz gereken yer icerde calistigimiz sdk veya biz reflection kullaniyoruzdur.
 * isimler proguardda degistigi icin sikinti vardir.
 *
 */

class Walpaper {
    private var imageUrl: String = "www.unludev.com"
    private var id: Int = 1232
    private var type: Int = 2
    private var width: Int = 1399
    private var height: Int = 970
    private var isGif: Boolean = false
    private var previewUrl: String = "www.unludevprw.com"

    private fun printer() {}
}

fun main() {
    val walPaper = Walpaper()
    /**class in instance olusturup*/
//    walPaper.imageUrl
//    walPaper.id
//    walPaper.type
//    walPaper.width
//    walPaper.height
//    walPaper.isGif
//    walPaper.previewUrl
    //println(walPaper.imageUrl)
    /**instance uzerinden javaClass a gectik
     * getDeclaredField fonksiyonuna ulasmak istedigmiz degiskenin ismini string olarak veriyoruz.
     * reflection kullanabilmek icin degisken isimlerini bilmemiz gerekiyor ve bu degisken isimleri degismemeli
     * butun bunlar okey olduktan sonra ilgili fieldi isAccessible function ile true yapiyoruz.
     * boylece artik degisken erisebiliriz. fieldIsmi.get(nesneIsmi) seklinde private field a erismis olruz.
     *
     * bu kullanimda apk dosyasini proguard ile obfuscate ederken sikinti cikabilir.
     * cunku obfuscate yapilirken proguard propery isimlerini kafasina gore harflere mapler.
     * bu ornekte imageUrl propertysinin ismini rastgele atadigi harfe maplerse getDeclaredField("imageUrl") olarak kalir.
     * cunku proguard String ifade ile yazilmis olan ifadenin propery olacagini anlayamaz.
     * bunun onune gecmek icin proguard in rulesetlerine tanimlamayi unutmamiz gerekir.
     *
     *

     * */
    val imageUrlField: Field = walPaper.javaClass.getDeclaredField("imageUrl")
    imageUrlField.isAccessible = true
    val imageUrlString = imageUrlField.get(walPaper)
    println(imageUrlString)


//2. yontem
    /**
     * bu yontemde class icindeki propertylerin siralamasinin degismeyecegini garanti etmemiz gerekir
     * comment ile bilgi verilmesi gerrekir yeri degismemesi icin.
     * cunku class siralamasi uzerinden index e gore property e ulasiyoruz.
     * */
    val imageUrlFieldName = walPaper.javaClass.declaredFields[0].name
    val imageUrlField2 = walPaper.javaClass.getDeclaredField(imageUrlFieldName)
    imageUrlField2.isAccessible = true
    val imageUrlString2 = imageUrlField.get(walPaper)
    println(imageUrlString2)


}