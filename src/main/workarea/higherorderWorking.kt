package workarea

fun main() {
re(::la)
    val zimb = zimb("ali")
    val zimb2 = zimb("ali", "ata")

}

fun la(a:String){
    println(a)
}

fun re(high: (String) -> Unit){
    high("remdir")
}

class zimb {

    constructor(name: String) {
        //logics
        println("cons1")
    }
    constructor(name: String, surname: String) {
        //logics
        println("cons2")
    }

    init {
        println("init calisti")
    }
}
