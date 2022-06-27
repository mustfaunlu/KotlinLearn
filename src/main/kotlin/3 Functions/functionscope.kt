package `3 Functions`

/**
 * bir fonksiyon herhangi bir sinifin icerisinde degilde bir dosyanin icerisinde boslukta tanimlaniyorsa top level function adini alir
 * bir fonksiyona fonksiyon diyebilmek icin top level function olmali aksi takdirde methoddur.
 *
 *
 * fonksiyon icinde fonksiyon kotlinde vardir buna local functions denir.
 * sebebi ise yazilan fonksiyona kendi sinifindan bile erisilemez. gizlilik saglatir. reflection ile bile erisemeyiz.
 * local fuctiona sadece yazildigi fonksiyon icinde erisilir.
 * ekstra gizlilik istenildiginde kullanilabilir. Genelde sdk yazarken kullanilir.
 */

fun main() {
     calculateAtomPhysics()
     //getValuesFromUserAndPrint() erisemeyiz
}

fun calculateAtomPhysics() {
    val userName = "Codemy"
    println("Initialize Process...")

    fun getValuesFromUserAndPrint(){  //local function,  reflection yapsak bile erisemeyiz.
        userName.length
        val numberOne = readln().toInt()
        val numberTwo = readln().toInt()
        val result = numberOne + numberTwo
        println("$result")
    }

    getValuesFromUserAndPrint()

    println("Process has been done")
}


/**
 * bir sinifin icerisindeki fonksiyonlara member function denir
 */
class Car {
    fun setColor(colorCodeId: Int){}
}


/**
 *  bir fonksyon Generic tip aliyorsa, Generic Function olarak adlandirilr.
 *  degisken tipi bilinmiyorsa veya degisken tipi birden fazla tipte kullanilir olmasi isteniyorsa kullanilabilir.
 */
fun <T> setColor(colorCodeId: T){ }