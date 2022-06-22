package workarea

fun main() {
    callMe { print("Bu bir higher order funct.") }

    sayHello("mustafa"){
            name -> println(name) //println(it)  seklindede yazabiliriz.
    }

    foo("kotlin") {it.reversed()} //niltok

    add(3,5) { println(it) }

    fooBar {func1()
        func2()
        func3()
    }


}




fun callMe(higherFunc: () -> Unit){     //  callMe { print("Bu bir higher order funct.") }
        higherFunc()
}

fun sayHello(name: String, body:(String)-> Unit){    /* sayHello("mustafa"){  name -> println(name)   }*/
    body("Hello, $name")
}

fun foo (str: String, func: (String) -> String){    // foo("kotlin") {it.reversed()} //niltok
    var x = func(str)
    println(x)
}

fun add (a: Int, b:Int, action: (Int)->Unit){    // add(3,5) { println(it) }
    action(a + b)
}

class Bar{
    fun func1()= println("func1")
    fun func2()= println("func2")
    fun func3()= println("func3")
}

fun fooBar(block: Bar.()->Unit){
    var bar = Bar()
    bar.block()

    /*
 fooBar {func1()
        func2()
        func3()
    }*/
}