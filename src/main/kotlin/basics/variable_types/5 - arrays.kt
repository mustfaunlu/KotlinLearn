package basics.variable_types


/**
 * Dizi tanimlamalari icin kullanilirlar.
 * arrayOf(ayni tip degerler) seklinde tanimlanabilir.
 * arrayOf<any>(farkli tip degereler) seklinde tanimlanabilir.
 * arrayOfNulls<Type>(size) seklinde ise verilen boyut kadar null deger iceren dizi tanimlanabilir.
 * index 0 dan baslar.
 * Arraylere plus ile ekleme yaptigimizda yeni bir array olusturur. Orjinal array degismez.
 */

fun main() {
    val studentNumber = arrayOf(12,34,532,621,52)
    val studentNames = arrayOf("ali", "veli", "deli")
    val firstCharOfNames = arrayOf('a', 'b', 'C', '1')
    val mixedArray = arrayOf<Any>(12,"ahmet", 'v', true) // Any mumkun oldukca kullanmamak lazim belli tip vermeliyiz
    val arrayOfNulls = arrayOfNulls<String>(4) // dosyadan okunacak olabilir,serverdan gelecektir. Type bilinmiyor olabilir.



    /**
     *  Array<Type>(size){higher order function} seklinde de tanimlanabilir
     *  bu durumda higher ordr function icerisinde son satira denk gelen degerler diziyi olusturer.
     *  Higher order funtion, icerisi dizinin boyutu kadar index'i(it) bir artirarak calisir.
     */

    //5 elemanli, tum elemeanlari 3.14 x indexDegeri olan bir dizi olusturer.
    val carNamesMini = Array<Double>(5){
        //pseudo codes
        //pseudo codes
        //pseudo codes
        3.14 * it
    }

    //["0", "1", "4", "9", "16"] değerlerine sahip bir Array<String> oluşturur.
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }

    /**
     * ByteArray, ShortArray, IntArray, LongArray, DoubleArray, FloatArray tnaimlanabilir.
     * primitive array tanimlamalarida yapilabilir.
     * Bu tarz tanimlamalarda ilgili index degerine atama icin set(index, value) ya da [index] = value kullanilir.
     * Bu tarz tanimlamalarda iligili index degerindeki degisken degereine get(index) ya da [index] seklinde erisilir.

     */

    val firstCharOfCountries = CharArray(4)
    firstCharOfCountries[0] = 't' // atama islemi
    firstCharOfCountries.set(1,'I') // atama islemi
    firstCharOfCountries.set(3,'A') // atama islemi
    firstCharOfCountries[2] = 'b' // atama islemi

    //set atama yapar arraye eklem yapmaz ekleme yapmak icin plus operatoru kullanilir. ama plusda yeni bir array olusturur.


    println("firstCharOfCourse index 2 :" + firstCharOfCountries.get(2)) // okuma islemi
    println("firstCharOfCourse index 2 :" + firstCharOfCountries[2]) // okuma islemi


    /**
     * val ile tanimlanmis bir array'in herhangi bir index' indeki deger degistirebilir.
     * val indexdeki degerlerin degismesine karismaz.
     * Ancak iligili diziyi baska bir dizi ile esitlemenize izin verilmez.
     * Bunun icin tanimlamayi var ile degistirmeniz gerekir.
     */

    val awesomeArray = arrayOfNulls<String>(4)
    awesomeArray[2] = "Ali"
    //awesomeArray = arrayOf("foo","goo","coo","doo") // calismaz val bu arrayin baska arraye esitlenmesini engeller. index degerine karismaz.

    //!TAVSIYE ayni array i kodun alt kisimlarinda tamamen degistirmeyin


    /**
     * index degeri = size - 1 dir  yani 4 elemanli bir arrayin 3 indexi vardir cunku index 0 dan baslar
     * array size disina cikarsaniz 4 elemanli bir arraydan [4]. indexi isterseniz indexOutOfBoundException hatasi alirsiniz
     */

}
