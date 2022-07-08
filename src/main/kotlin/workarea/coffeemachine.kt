package workarea

fun main() {

    print("Write how many ml of water the coffee machine has:")
    val water = readln().toInt()
    print("Write how many ml of milk the coffee machine has:")
    val milk = readln().toInt()
    print("Write how many grams of coffee beans the coffee machine has:")
    val beans = readln().toInt()
    print("Write how many cups of coffee you will need:")
    val cups = readln().toInt()

    makeCoffee(water,milk, beans)







    // println("""

    // Starting to make a coffee
    // Grinding coffee beans
    // Boiling water
    // Mixing boiled water with crushed coffee beans
    // Pouring coffee into the cup
    // Pouring some milk into the cup
    // Coffee is ready!
    // """.trimIndent())
}

fun makeCoffee (water: Int, milk: Int, beans: Int){
    if (water >= 200 && milk >= 50 && beans >= 15) {

    }else{
        println("I can make only 0 cups of coffee")
    }
}

fun oneCoffee (){
    val water = 200
    val milk = 50
    val beans = 15
}
