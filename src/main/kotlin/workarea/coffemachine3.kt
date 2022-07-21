package workarea



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
        print("Write action (buy, fill, take, remaining, exit): ")
        val input = readln()
        when (input) {
            "buy" -> toBuy()
            "fill" -> toFill()
            "take" -> toTake()
            "remaining" -> toRemaining()
            "exit" -> return
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

    fun toBuy() {
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
        val cof = readln()
        when(cof){

            "1" -> {

        water -= 250
        milk -= 0
        beans -= 16
        cup -= 1
        money += 4

    }
            "2" -> {
        water -= 350
        milk -= 75
        beans -= 20
        cup -= 1
                money += 7
  }
            "3" -> {
        water -= 200
        milk -= 100
        beans -= 12
        cup -= 1
                money += 6
            }
            "back" -> process()

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






