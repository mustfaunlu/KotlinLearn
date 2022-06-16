package Functions

fun main() {
    val name = "mustafa"
    val surnmae = "unlu"
    val fullName = name + " " + surnmae

    fun deneme(fullName: String) : String{
        return "Merhaba $fullName"
    }
    fun deneme2(fullName: String) : String{
        return "Merhaba $fullName"
    }

    val welcomeMessage = deneme(fullName)

    deneme(deneme2(fullName))

    //buraya kadar first class citizen function mevzusu normal kotlindeki functionarin ozellikleridir.

    //higher order functionlar ise en basit olarak fonksiyon bodysidir diyebiliriz.
    //higher orderin interface  gore artisi nedir.
    //higher order fonksiyonlarda parametre kismina veya geri donus kismina fonksiyon bodysini verebiliyoruz.
                //funcname     :  //varName: vartype(burasi aslinda functype)     //returntype
    fun foo(higherOrderFunction: (message:String)->Unit){
        higherOrderFunction("Codemy")
    }

    //cagirirken;
    foo({message -> println("Message: $message")  })
}