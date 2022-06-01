package `1 Getting Started`

fun main() {
    val name: String  = "Twitter"  //val(value); dart dilindeki final gibi ikinci kez atama yapilamaz (immutable)
    var surName = "Social Media" //var(variable); degiskendir (mutable)

    val age = 23 //explicit type burada gereksizdir kotlin kendisi anlar type ckarimi yapar ide gucunden gelir


    var eyeColor: String // esittir ile atama yapmiyorsak sonradan atayacaksak type atamasi yapmamiz gerekir
    eyeColor = "Green" //memoryde atamasi yapildigi icin string bir ifadeyi eyeColor = 2 yapamayiz int e ceviremeyiz



    println(name)
    println(surName)

}