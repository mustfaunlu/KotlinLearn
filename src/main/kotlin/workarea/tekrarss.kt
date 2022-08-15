package workarea

fun main() {

    val bunu = Lol()
    bunu printEt  "Recep iveidk" //infix

    4 topla 5 //extension infix int
    100 carp 4 //extension infix int
    "MUS" birlestir  "TI" //extension infix string


    // operator overloading
    val op = op(3,5)
    val op2 = op(5,3)
    val sonuc = op - op2
    println(sonuc)

    //ic ice for
    for (i in 1..6) {
        for (j in 1..6-i) {
            print(" ")
        }
        for (k in 1 until 2 * i) {
            print("*")
        }
        println()
    }

    alsooo("Ali","Gerd","TR","1996", "26")

}



class Lol {
    infix fun printEt(biseyYaz: String) {
        println(biseyYaz)
    }

}

infix fun Int.topla(num: Int){
    println(this + num)
}

infix  fun Int.carp(num: Int){
    println(this * num)
}

infix fun String.birlestir(str: String) {
    println(this + str)
}

data class op(val name: Int, val surName: Int) {
    operator fun minus(pair: op): op {
        return op(name - pair.name, surName - pair.surName)
    }
}

enum class YserInfo (index: Int) {
    NAME(0),
    SURNAME(1),
    COUNTRY(2),
    BORN(3),
    AGE(4),
}

fun alsooo(vararg st: String){
    println(st[YserInfo.NAME.ordinal]) //enum class ile kullanmak hatayi en aza indirir. indexoutofbound hatasini.
    //println(st[0]) yazmak yerine
}