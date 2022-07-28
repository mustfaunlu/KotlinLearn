package workarea

class Site(val address: String, val foundationYear: Int)

fun makeReddit(): Site {
    return Site("reddit.com", 2005)
}

class Kar : Zar(a = "ada", b = 23) {
    override fun wakeUp() {
        print("Zart ")
        super.wakeUp()

    }
}

open class Zar(val job: String, val name: String = "Aslan"){

    constructor(a: String, b: Int) : this("terzi",){

    }

    open fun wakeUp(){
        println("uyandi")
    }


}

class ArithmeticOperations(val x: Int, val y: Int){
    fun addition() : Int {
        return x + y
    }
    fun subtraction() : Int {
       return  x - y
    }
    fun multiplication() : Int {
        return x * y
    }
    fun division() : Int {
        return x / y
    }
}

fun main() {
    val sd = ArithmeticOperations(2,5)
    sd.multiplication()
    sd.addition()
    val k = Kar()
    k.wakeUp()
    makeReddit()
}