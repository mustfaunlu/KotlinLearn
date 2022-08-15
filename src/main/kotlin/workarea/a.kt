package workarea

fun main() {
 val kalem = Kalem()
    kalem.daf
    kalem.exto(2)

    high { s, s2 -> println("$s $s2") }

    bax { i, i2 -> println("$i $i2")  }


    cax(2) {
        n1, n2 -> println("$n1 $n2")
    }

    mex(::lex)

    val a = okeee()
    a.er { a -> println(a) }
}

class okeee {

}

fun okeee.er (block: (String) -> Unit) {
    block("daskjf")
}

fun lex(param: Int, param2: Int): String {
    return "$param + $param2"
}

fun mex(high: (Int, Int) -> String) {
    high(5,2)
}

fun cax (times: Int, action: (Int,Int) -> Unit) {

    repeat(times) {
        action(times * 2,4)
    }

}

fun bax (zimbirti: (Int,Int) -> Unit) {
    zimbirti(8,88)
}
fun high (higher: (String, String) -> Unit) {
    higher("ali", "velir")
}

open class Kalem {

    var daf = "akdjfa".ext()


    open fun String.ext(){
        println("extim")

//        ext() //ext fun called
//        this.ext() //ext func called

        this@Kalem.ext()  //member function called
    }



    fun ext(){
        println("ext degilim")
    }

    fun exto(i: Int) {
        println(i * i)
    }
}

fun Kalem.exto(i: Int){    //classin icindeki birebir ayni fonksiyona extension ile ulasamayiz. bu durumda yazdigimiz extension yok hukmundedir.
    daf.toString()  //cunku extension yazdigimizda receiver class in butun memberlarina eriiyoruz ama fonksiyonlarina bu sekilde erisemeyiz.
    println("kalem icindeyim")

}

