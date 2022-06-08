package `2 Basics`

//while döngüsü, belirtilen bir koşul doğru olduğu sürece bir kod bloğu boyunca döner:

fun main() {
    val condition =true
    while (condition) {
        // code block to be executed
    }

    //Aşağıdaki örnekte, sayaç değişkeni (i) 5'ten küçük olduğu sürece döngüdeki kod tekrar tekrar çalışacaktır:

    var i = 0
    while (i < 5) {
        println(i)
        i++  //Koşulda kullanılan değişkeni artırmayı unutmayın, aksi takdirde döngü asla bitmez.
    }

    /*do..while döngüsü, while döngüsünün bir çeşididir.
        Bu döngü, koşulun doğru olup olmadığını kontrol etmeden önce kod bloğunu bir kez çalıştıracak,
            ardından koşul doğru olduğu sürece döngüyü tekrarlayacaktır. */
    do {
        // code block to be executed
    }
    while (condition);

    /*
    Aşağıdaki örnekte bir do/while döngüsü kullanılmaktadır.
    Kod bloğu koşul test edilmeden önce yürütüldüğünden,
    koşul yanlış olsa bile döngü her zaman en az bir kez yürütülür:
     */

    var j = 0
    do {
        println(j)
        j++
    }
    while (j < 5)
}