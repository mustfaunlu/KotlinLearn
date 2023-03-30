package classes

/**
 * En basit tanim veri tutmak icin kullanilan classlar.
 * Data class'lar en azindan mutlaka 1 parametre almak zorundadir.
 * Parametreler mutlaka val ya da var ile tanimlamak zorundadir.
 * Open, abstract, sealed, inner class yapilamaz.
 * Data Class'lar miras alinamaz. Interface i implement ederler child class olabilirler
 ama ust class olamazlar.
 * Tum data class'lar default olarak final oldugu icin final modifier'i redundant uyarisi verir.
 *
 * Data class'larda equals, hashCode, toString, copy, componentN fonksiyonlari arka planda
 default olarak olustururlar. Ornegin toString override edip Kendimiz custom olarak
 yazmamiza gerek yoktur direkt icindeki datayi okuyabiliriz.

 * Bunlarin hicbiri duz classlarin arka planinda yoktur. Kendimiz yazabiliriz.
 *
 * Yukaridaki fonksiyonlardan biri override edilirse, oto generate edilen hali yazilmaz.
 *
 * Yukaridaki fonksiyonlar sadece primary const. icerisindeki degiskenlerle calisir.
 * Yani data class ozellikleri primary const. icindeki degiskenlerde calisir.
 *
 * componentN fonksiyonlari sebebiyle destructuring declaration olarak data class'lar set edilebiliyor.
 * componentN fonksiyonlari primary olarak verilen parametre sayisi kadar uretilir.
 *
 * toString gibi fonksiyonlarda primary const. degiskenleri kullanildigi icin val ya da
 var yazilmak zorunda.
 *
 * Pair, Triple ozellestirilmis generic data class'larda dil icinde mevcut.
 *
 * Backendden gelen datalari biz data class yapariz sebepleri;
 *  -gelen datayi loglamak cok kolay oluyor. data class in instance in dan gelen datayi
 * toString ozellestirilmis old icin gorecegiz.
 *  -Fakat duz class ile datayi cekseydik her class icin toString yazmak override etmek gerekecekti.
 *  -copy gibi fonksiyonlari bize kolayliklar saglar.
 */

 data class News(
    val title: String = "Title", //Component1
    val description: String, //Component2
    val hasMedaContent: Boolean, //Component3
    val mediaList: List<Media> //Component4
){
    val relatedNewsList : List<News> = arrayListOf() //data class ozellikleri bu degiskende calismaz. cunku primary const. disinda tanimlanmis

/*
   Asagidaki gibi kendimiz custom toString override edebilliriz.
   Bunu yapmanin artisi; eger toString ile direkt okunmamasini istedigimiz
   verilerimiz var ise custom kendimiz override etmeliyiz veya ilgili bilgiyi iceren
   degiskeni primary const. yerine burada tanimlamaliyiz.

 override fun toString(): String {
        return "super.toString()"
    }
    */
    fun log(){
        println("Title: $title, description : $description")
    }
}

class NewsData(
    val title: String = "Title",
    val description: String,
    val hasMedaContent: Boolean,
    val mediaList: List<Media>
){

    val relatedNewsList : List<NewsData> = arrayListOf()

    fun copy() : NewsData {
        return NewsData(title, description, hasMedaContent, mediaList)
    }


}

class  Media

fun main() {

    // Destucturing declaration
    val newsOne = News( "dfa", description = "dakjsf",  true, mediaList = arrayListOf())
    //yukaridaki newsOne nesnesini asagidaki gibi variablelarina ayirabiliriz. Bu kullanima destructuring declaration denir.
    val(title,description,hasMedaContent,mediaList) = newsOne
    val(title3,description3,hasMedaContent3) = newsOne
    val(title1,description1) = newsOne

    //aslinda yukaridaki kod asagidaki gibi derlernir.
    val title2 = newsOne.component1()
    val description2 = newsOne.component2()
    val hasMedaContent2 = newsOne.component3()
    val mediaList2 = newsOne.component4()

    newsOne.mediaList //normal kullanim
    mediaList // destructuring decleration kullanimi bunu yapabilmek icin arka planda componentN fonksiyonlari olmasi gerekli
    newsOne.component4() //medaListi verir


    val collection = arrayListOf<News>()
    //aslinda for dongulerindede componentN fonksiyonlari kullanilir.
    for ((a, b) in collection) {  } // a = component1(), b = component2()



    //copy fonksiyonu
    val newsThree = newsOne.copy(description = "farkli bir desc")
    // data class in birebir aynisi fakat sadece descriptionu farkli halinin verir


    // asagidaki gibi duz classda copy olmagidi icin butun bilgilerini bastan verip sifirdan asagidaki gibi olusturacaktik.
    val newsFour = NewsData(
        title = newsOne.title,
        description = "farkli bir desc",
        hasMedaContent= newsOne.hasMedaContent,
        mediaList = newsOne.mediaList
    )



    val newsTwo = NewsData(title = "sdaf", description = "dfakdf", hasMedaContent = false, mediaList = arrayListOf())
    newsOne.component1() // newsOne:News(title = "dfa")


    println("Data Class toString: $newsOne") // News(title=dfa, description=dakjsf, hasMedaContent=true, mediaList=[]) ciktisini veir
    // newsOne primary const'daki butun desgiskenleri verir bize. surekli toString override etmek zorunda degiliz. arkaplanda otomatik verir


    println("Class toString: $newsTwo") //Class toString: 4 Classes.NewsData@21bcffb5 ciktisi verir
// duzclass instance'i old icin icindeki veriyi okuyamayiz. Okumak icin toString override edip override i custom yazmak gerekecek.
}

/*
 Jvm tarafinda generated edilen data classlarin parametresiz bir constructor'u
 olmasi gerekiyorsa, asagidaki gibi default degerler verilmelidir. Aksi halde
 parametresiz constructor olusturulmaz.
 */
data class a (val a : Int = 0, val b : String = "")