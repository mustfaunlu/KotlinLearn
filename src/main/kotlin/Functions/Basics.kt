package Functions

/**
 * fun keywordu ile fonksiyonlar baslar.
 * fonksiyon ismi verilir.
 * parametre parantezleri acilir ve parantezler girilir.
 * : operatoru ve geri donus degeri yazilir.
 * fonksiyon body'si aciliir ve kapatilir
 * geri donus degeri verilmeyen fonksiyonlar Unite tipini geri dondurur.
 * Unit = void
 */

fun main() {
    //Fonksiyon cagirilirken ismi ve parametreleri kullanilir.
    // Eger bir geri donusu varsa bir degiskene atabilir.
    //first class citizen = bir degiskene deger olarak atanabilime bir degiskeni deger alabilme tek basina dosya uzerine yazilabilme
    // first class citizen olan methodlara fucntion deriz.
    // javada ise class disinda tek basina func yazilamaz methoddur o.

    takeSquare(2)
    val squareValue = takeSquare(2)

    Math.pow(2.0, 4.0) // bir class in fonksiyonnunu cafirirken ise nokta isareti kullaniriz.
    // ayni sayfada ise direk cagirabiliriz.


    /**
     * = ile default degeri olan parametrelerde  tanimlayabiliriz.
    default deger atamasi yapmak function overload islemi yapmanizi saglar.
    Tekrar tekrar ayni fonksiyonun farkli varyasyonlarini yazmak durumunda kalmayiz.
     */

    fun reformatMessage(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {}

    /**
     * defaul degeri olan parametrelere sahip bir fonksiyon cagirilirken default degeri olan parametrelere deger atamak sart degildir.
     * Default degeri olan bu parametreler opsiyonel parametrelerdir.
     * Default degeri olan parametrelere ddeger atanmadan fonksyiyon cafirilacaksa bu durumda parametre sirasi degisir.
     * Ide ye hangi parametreye degera atadignizi soylemek icin opsiyonel parametrelerde Named Argument kullanmalliyiz
     * BU DURUMA KOTLINDE FUNCTION OVERLOAD DENIR.
     */
    reformatMessage("mesage", true, 7, "tr")
    reformatMessage(message = "mesage", size = 7, lang = "tr")
    reformatMessage("message", true, 7)
    reformatMessage("message", size = 7)

    /* -------------------------------------------------------------------------------------------------------- */

    /**
     * cok uzun sayida parametreniz olacaksa "variable number of arguments" = vararg tanimlanabilir.
     * bu sayede fonksiyon tek bir parametre aliyor gibi gozukurken kendisine cok m iktarda degisken atanabilir.
     * bu degiskenlere array e erisir gibi erisebiliriz. [index] ya da .get(index) seklinde
     * vararg tek yada son parametre olarak yazilirsa, jvm e hazirlanirken javadaki "String..." gibi ayni kod derlenirken
     * ancak vararg  param birden fazla tanimlanirken ortada ya da baska yer alirsa, jvm e hazirlanirken, array'e donusuturur
     * bu da performans farki yartir
     *
     * ayni fonksiyon icerisiinde ikikere vararg tanimlanamaz
     */

    fun getUserInfo(vararg userInfo: String, key: Int) {
        userInfo[3]
        userInfo.get(3)
    }

    fun getUserInfo2(key: Int, vararg userInfo: String) {
        userInfo[3]
        userInfo.get(3)
        print(key)
    }

    //vararg kullanimina ornek. key = 3 den onceki parametreler vararg parametresine denk gelir.
    getUserInfo("ahmet", "ahmet", "ahmet", "ahmet", "ahmet", "ahmet", key = 4)

    //vararg parametresi olarak arrayOf kullanmak istinirse * operatoru eklenmelidir. (spread operatoru)
    getUserInfo(*arrayOf("ahmet", "ahmet", "atmaca", "istanbul", "caddebostan", "sirlisokak"), key = 5)

    getUserInfo2(3, "ali", "kurcu", "istanbul", "baagcilar")


    /**
     * bir fonksiyona = koyularak da return edecegi deger yazilabilir. (Single-Expression kullanimi)
     */

    val userList = arrayOfNulls<String>(5)

    fun getListCount(): Int = userList.size         // kisa kullanim

    fun getListCount2(): Int {                      // uzun kullanim
        return userList.size
    }

}


// kotlinde disarda tek basina tanimlayabilriz

fun takeSquare (number: Int): Int {

    //some codes
    //some codes
    //some codes
    //some codes

    return number * number
}