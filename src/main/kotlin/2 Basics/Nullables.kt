package `2 Basics`

fun main() {
    /**
     * bir degiskene null deger atamasi yapabilmek icin degisken tipinin sonuna ? isarieti konulur
     * eger degiskene tip verilmez ve direkt null deger atamasi yapilirsa ide tip cikarimi yaparken Nothing? diye isaretler.
     * hangi tipe karsilik geldigini bilemez. Nothing bos bir classdir
     * eger degiskenin null gelip gelmeyecegi bilinmiyorsa nullable yapma cunku performans farki olacak
     *  bu fark null verilmis tip boxed oluyor ve referanst tipli oluyor primitive olmuyor yani performans farki ort cikiyor.
     */

    val name: String? = null
    val age: Int? = null
     val number = null //Nothing? tipi oldu
    /**
     * null degilse calissin demek icin tipin yanina ?. koyariz
     * Best practice olarak debug modda calisirken kodlarimiza !! seklinde yazmaliyiz
     */

    val result: Int? = null
    result!!.plus(325) // nullsa da degilsede bana birak gerekirse uygulama patlasin yinede ben bunu goze aliyorum
    result?.plus(325) // burada ise null gelirse uygulamayi patlama o kod blogunu calistirma yani null degilse calissin diyorsak boyle kullaniriz.



}