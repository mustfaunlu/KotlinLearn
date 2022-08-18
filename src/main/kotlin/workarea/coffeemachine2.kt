package workarea

fun main() {
    defaultValues()
    inputFun()
}

fun defaultValues () {
    val w = 400
    val mi = 540
    val b = 120
    val c = 9
    val m = 550

    println("""
        The coffee machine has:
        $w ml of water
        $mi ml of milk
        $b g of coffee beans
        $c disposable cups
        $$m of money
         
       
    """.trimIndent())

}

fun inputFun() {
    print("Write action (buy, fill, take, remaining, exit): ")
    val input = readln()
    when (input) {
        "buy" -> buy()
        "fill" -> fill()
        "take" -> take()
        "remaining" -> remaining()
        "exit" -> return
    }
}

fun fill() {
    print("Write how many ml of water do you want to add: ")
    val water = readln().toInt()
    print("Write how many ml of milk do you want to add: ")
    val milk = readln().toInt()
    print("Write how many grams of coffee beans do you want to add: ")
    val coffeeBeans = readln().toInt()
    print("Write how many disposable cups of coffee do you want to add: ")
    val cupCount = readln().toInt()

    val w = 400
    val mi = 540
    val b = 120
    val c = 9
    val m = 550

    println("""
        The coffee machine has:
        ${w + water} ml of water
        ${mi + milk} ml of milk
        ${b + coffeeBeans} g of coffee beans
        ${c + cupCount} disposable cups
        $$m of money
         
       
    """.trimIndent())

}

fun buy() {
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
    val cof = readln().toInt()
    when(cof){
        1 -> {
            val w = 400
            val mi = 540
            val b = 120
            val c = 9
            val m = 550

            println("""
        The coffee machine has:
        ${w - 250} ml of water
        $mi ml of milk
        ${b - 16} g of coffee beans
        ${c - 1} disposable cups
        $${m + 4} of money
         
       
    """.trimIndent())}

        2 -> {
            val w = 400
            val mi = 540
            val b = 120
            val c = 9
            val m = 550

            println("""
        The coffee machine has:
        ${w - 350} ml of water
        ${mi - 75} ml of milk
        ${b - 20} g of coffee beans
        ${c - 1} disposable cups
        $${m + 7} of money
         
       
    """.trimIndent())}
        3 -> {
            val w = 400
            val mi = 540
            val b = 120
            val c = 9
            val m = 550

            println("""
        The coffee machine has:
        ${w - 200} ml of water
        ${mi - 100} ml of milk
        ${b - 12} g of coffee beans
        ${c - 1} disposable cups
        $${m + 6} of money
         
    """.trimIndent())
        }
    }
}

fun take() {
    val w = 400
    val mi = 540
    val b = 120
    val c = 9
    val m = 550

    println("""
        I gave you $$m
        
        The coffee machine has:
        $w ml of water
        $mi ml of milk
        $b g of coffee beans
        $c disposable cups
        $${m - m} of money
         
       
    """.trimIndent())
}

fun remaining(){

}

