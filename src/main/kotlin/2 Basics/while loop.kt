package `2 Basics`

//while döngüsü, belirtilen bir koşul doğru olduğu sürece bir kod bloğu boyunca döner:

// for varken neden while var? Cunku for + if else kullanmak yerine while kullanabilirsiniz.

fun main() {
    val condition =true
    while (condition) {
        // code block to be executed
    }



    //Aşağıdaki örnekte, sayaç değişkeni (i) 5'ten küçük olduğu sürece döngüdeki kod tekrar tekrar çalışacaktır:

    var i = 0
    while (i < 5) {
        println(i) // i yi buradada artirabiliriz
            i++  //Koşulda kullanılan değişkeni artırmayı unutmayın, aksi takdirde döngü asla bitmez.
    }
     //for if kullanmak yerine yukardaki while kullanabiliriz
    for(value in 0..5){
        if(value < 5){
            print("$value ,")
        }
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