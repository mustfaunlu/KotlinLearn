package Functions

/**
 * bir fonksiyon herhangi bir sinifin icerisinde degilde bir dosyanin icerisinde boslukta tanimtalniyorsa top level function adini alir
 * bir fonksiyona fonksiyon diyebilmek icin top level function olmali aksi takdirde methoddur.
 * fonksiyon icinde fonksiyon kotlinde vardir buna local functions denir.
 * sebebi ise yazilan fonksiyona kendi sinifindan bile erisilemez. gizlilik saglatir. reflection ile bile erisemeyiz.
 * local fuctiona sadece yazildigi fonksiyon icinde erisilir.
 * ekstra gizlilik istenildiginde kullanilabilir.
 */

fun main() {

}


/**
 * bir sinisin icerisindeki fonksiyonlara member function denir
 */
class Car {
    fun setColor(colorCodeId: Int){}
}


/**
 *  bir fonksyon Generic tip aliyorsa, Generic Function olarak adlandirilr.
 */
fun<T> setColor(colorCodeId: T){}