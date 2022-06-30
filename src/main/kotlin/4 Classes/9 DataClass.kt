package `4 Classes`

/**
 * Data class'lar en azindan mutlaka 1 parametre almak zorundadir.
 * Parametreler mutlaka val ya da var ile tanimlamak zorundadir.
 * Open, abstract, sealed, inner class yapilamaz.
 * Data Class'lar miras alinamaz. Interface i implement ederler child class olabilirler ama ust class olamazlar.
 * Tum data class'lari default olarakfinal oldugu icin final modifier'i redundant uyarisi verir.
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
 *
 * toString gibi fonksiyonlarda primary const. degiskenleri kullanildigi icin val ya da var yazilmak zoru
 *
 * Pair, Triple ozellestirilmis generic data class'lar mevcut.
 */

data class News(
    val title: String = "Title",
    val description: String,
    val hasMedaContent: Boolean,
    val mediaList: List<Media>
){
    val relatedNewsList : List<News> = arrayListOf()

//    override fun toString(): String {
//        return "super.toString()"
//    }    kendimiz custom toString override edebilliriz. boylece butun bilgilerimiz tek fonksiyonla aciga cikmaz.
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

    override fun toString(): String {
        return "super.toString()"
    }

    fun copy() : NewsData {
        return NewsData(title, description, hasMedaContent, mediaList)
    }

}

class  Media

fun main() {
    val newsOne = News(title = "dfa", description = "dakjsf", hasMedaContent = true, mediaList = arrayListOf())
    val(title,description,hasMedaContent,mediaList) = newsOne
    val(title3,description3,hasMedaContent3) = newsOne
    val(title1,description1) = newsOne

    newsOne.mediaList
    mediaList //  bunu yapabilmek icin arka planda componentN fonksiyonlari olmasi gerekli  destrcuting declaration

    newsOne.toString()
    newsOne.hashCode()

    val newsThree = newsOne.copy(description = "farkli bir desc")
    // data class in birebir aynisi fakat sadece descriptionu farkli halinin verir
    // duz classda copy olmagidi icin butun bilgilerini bastan verip sifirdan asagidaki gibi olusturacaktik.
    val newsFour = News(
        title = newsOne.title,
        description = "farkli bir desc",
        hasMedaContent= newsOne.hasMedaContent,
        mediaList = newsOne.mediaList
    )

    newsOne.component1() // newsOne:News(title = "dfa")

    val newsTwo = NewsData(title = "sdaf", description = "dfakdf", hasMedaContent = false, mediaList = arrayListOf())


    println("Data Class toString: $newsOne") // newsOne primary const'daki butun desgiskenleri verir bize. surekli toString override etmek zorunda degiliz. arkaplanda otomatik verir
    println("Class toString: $newsTwo") //
}