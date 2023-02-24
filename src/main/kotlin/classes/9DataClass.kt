package classes

/**
 * En basit tanim veri tutmak icin kullanilan classlar.
 * Data class'lar en azindan mutlaka 1 parametre almak zorundadir.
 * Parametreler mutlaka val ya da var ile tanimlamak zorundadir.
 * Open, abstract, sealed, inner class yapilamaz.
 * Data Class'lar miras alinamaz. Interface i implement ederler child class olabilirler ama ust class olamazlar.
 * Tum data class'lar default olarak final oldugu icin final modifier'i redundant uyarisi verir.
 *
 * Data class'larda equals, hashCode, toString, copy, componentN fonksiyonlari arka planda default olarak olustururlar.
 * Bunlarin hicbiri duz classlarin arka planinda yoktur. Kendimiz yazabiliriz.
 *
 * Yukaridaki fonksiyonlardan biri overiride edilirse, oto generate edilen hali yazilmaz.
 *
 * Yukaridaki fonksiyonlar sadece primary const. icerisindeki degiskenlerle calisir.
 * Yani data class ozellikleri primary const. icindeki degiskenlerde calisir.
 *
 * componentN fonksiyonlari sebebiyle destructuring declaration olarak data class'lar set edilebiliryor.
 * componentN fonksiyonlari primary olarak verilen parametre sayisi kadar uretilir.
 *
 * toString gibi fonksiyonlarda primary const. degiskenleri kullanildigi icin val ya da var yazilmak zorunda.
 *
 * Pair, Triple ozellestirilmis generic data class'larda dil icinde mevcut.
 *
 * BAckendden gelen datalari biz data class yapariz sebepleri;
 *  gelen datayi loglamak cok kolay oluyor. data class in instance in dan gelen datayi toString ozellestirilmis old icin gorecegiz.
 *  Fakat duz class ile datayi cekseydik her class icin toString yazmak override etmek gerekecekti.
 */

 data class News(
    val title: String = "Title", //Component1
    val description: String, //Component2
    val hasMedaContent: Boolean, //Component3
    val mediaList: List<Media> //Component4
){
    val relatedNewsList : List<News> = arrayListOf() //data class ozellikleri bu degiskende calismaz. cunku primary const. disinda tanimlanmis

//    override fun toString(): String {
//        return "super.toString()"
//    }    kendimiz custom toString override edebilliriz. boylece butun bilgilerimiz ozellestirilmis toString fonksiyonu ile aciga cikmaz.
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

//    override fun toString(): String {
//        return "super.toString()"
//    }

    fun copy() : NewsData {
        return NewsData(title, description, hasMedaContent, mediaList)
    }


}

class  Media

fun main() {
    val newsOne = News( "dfa", description = "dakjsf",  true, mediaList = arrayListOf())
    val(title,description,hasMedaContent,mediaList) = newsOne
    val(title3,description3,hasMedaContent3) = newsOne
    val(title1,description1) = newsOne


    newsOne.mediaList
    mediaList //  bunu yapabilmek icin arka planda componentN fonksiyonlari olmasi gerekli  destructring declaration

    newsOne.toString()
    newsOne.hashCode()

    val newsThree = newsOne.copy(description = "farkli bir desc")
    // data class in birebir aynisi fakat sadece descriptionu farkli halinin verir


    // asagidaki gibi duz classda copy olmagidi icin butun bilgilerini bastan verip sifirdan asagidaki gibi olusturacaktik.
    val newsFour = NewsData(
        title = newsOne.title,
        description = "farkli bir desc",
        hasMedaContent= newsOne.hasMedaContent,
        mediaList = newsOne.mediaList
    )

    newsOne.component1() // newsOne:News(title = "dfa")

    val newsTwo = NewsData(title = "sdaf", description = "dfakdf", hasMedaContent = false, mediaList = arrayListOf())



    println("Data Class toString: $newsOne") // News(title=dfa, description=dakjsf, hasMedaContent=true, mediaList=[]) ciktisini veir
    // newsOne primary const'daki butun desgiskenleri verir bize. surekli toString override etmek zorunda degiliz. arkaplanda otomatik verir


    println("Class toString: $newsTwo") //Class toString: 4 Classes.NewsData@21bcffb5 ciktisi verir
// duzclass instance'i old icin icindeki veriyi okuyamayiz. Okumak icin toString override edip override i custom yazmak gerekecek.
}