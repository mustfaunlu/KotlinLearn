package workarea

import kotlin.system.exitProcess


fun main() {
    process()
}

    var water = 400
    var milk = 540
    var beans = 120
    var cup = 9
    var money = 550

fun process() {
    while (true){
        print("Write action (buy, fill, take, remaining, exit):")
        val input = readln()

        when (input) {
            "buy" -> toBuy()
            "fill" -> toFill()
            "take" -> toTake()
            "remaining" -> toRemaining()
            "exit" -> break
        }
    }

}



    fun toRemaining(){
        println("""
          The coffee machine has:
          $water ml of water
          $milk ml of milk
          $beans g of coffee beans
          $cup disposable cups
          $$money of money  
        """.trimIndent())
    }

fun minResource(waterMin: Int, milkMin: Int, beansMin: Int, cupMin:Int, moneyMin:Int){
    if (water < waterMin){
        println("Sorry, not enough water!")
    } else if (milk < milkMin){
        println("Sorry, not enough milk!")
    }else if (beans < beansMin){
        println("Sorry, not enough coffee beans!")
    }else if (cup < cupMin){
        println("Sorry, not enough cup!")
    } else {
        println("I have enough resources, making you a coffee!")
        water -= waterMin
        milk -= milkMin
        beans -= beansMin
        cup -= cupMin
        money += moneyMin
    }
}
    fun toBuy() {
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
        val cof = readln()
        when(cof){
            "1" -> minResource(250,0,16,1,4)
            "2" -> minResource(350,75,20,1,7)
            "3" -> minResource(200,100,12,1,6)
            else -> return
        }
    }
    fun toTake(){
        println("I gave you $$money")
        money -= money
    }

fun toFill() {
    print("Write how many ml of water do you want to add: ")
    val w= readln().toInt()
    print("Write how many ml of milk do you want to add: ")
    val m = readln().toInt()
    print("Write how many grams of coffee beans do you want to add: ")
    val c = readln().toInt()
    print("Write how many disposable cups of coffee do you want to add: ")
    val cu = readln().toInt()

    water += w
    milk += m
    cup += cu
    beans += c
}






