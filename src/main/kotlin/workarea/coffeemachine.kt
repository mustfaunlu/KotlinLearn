fun main() {
    print("Write how many ml of water the coffee machine has: ")
    val water = readln().toInt()
    print("Write how many ml of milk the coffee machine has: ")
    val milk = readln().toInt()
    print("Write how many grams of coffee beans the coffee machine has:")
    val coffeeBeans = readln().toInt()
    print("Write how many cups of coffee you will need: ")
    val count = readln().toInt()

    makeCoffee(water, milk, coffeeBeans, count)
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

fun makeCoffee (water: Int, milk: Int, coffeeBeans: Int, count: Int) {
    val r1 = water / 200
    val r2 = milk / 50
    val r3 = coffeeBeans / 15

    val cof = minOf(r1, r2, r3)
    if (count > cof) {
        println("No, I can make only $cof cups of coffee")
    } else if (count == cof) {
        println("Yes, I can make that amount of coffee")
    } else {
        println("Yes, I can make that amount of coffee (and even ${cof - count} more than that)")
    }





//    println("""
//    For $count cups of coffee you will need:
//    ${count * water} ml of water
//    ${count * milk} ml of milk
//    ${count * coffeeBeans} g of coffee beans
//    """.trimIndent()
//    )

}