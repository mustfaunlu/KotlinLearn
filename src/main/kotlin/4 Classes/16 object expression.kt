package `4 Classes`

interface Print2 {
    fun onPrint()
}

open class User(val age: Int){
    open fun getUserFullName(){}
}

val fullName: User = object : Print2, User(23){
    val firstName = "Mustafa"
    val surName = "Unlu"

    override fun onPrint() {
        println("Full name = $firstName $surName")
    }

    override fun getUserFullName() {  //open old. icin override etmek zorunda degiliz icerisinde harici birsey yapmadigimzi icin gri uyari veriyor.
        super.getUserFullName()
    }

    override fun toString(): String {
        return "$firstName $surName"
    }
}

fun main() {
    // fullName.onPrint()
    fullName.getUserFullName()
    println("Full name = $fullName")

//textView.addTextWatcher(object: TextWatcher(){
//          before
//          after
//          on
//          })

// object: CountDownTimer(10000, 1000){
// override fun onTick(){}
// override fun onFinish(){}
// }

    "Mustafa".print("Unlu")
    "Mustafa" print "Unlu"
}

infix fun String.print(secondText: String){
    println(this + secondText)
}