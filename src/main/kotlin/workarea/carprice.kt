package workarea

fun main() {
    carPrice()
}
// complete this function, add default values
fun carPrice(price: Int = 20000, old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false){
    var price = price
    price -= old * 2000
    if (maximumSpeed < 120) {
        price -= (120 - maximumSpeed) * 100
    } else {
        price += (maximumSpeed - 120) * 100
    }
    val priceK = kilometers / 10000
    price -= priceK * 200

    if (automatic) price += 1500

    println(price)
}