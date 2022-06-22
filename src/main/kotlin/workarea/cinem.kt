//7 sira 8 koltuk matris

fun main() {
    var num = 1
    println("Cinema:")
    println("  1 2 3 4 5 6 7 8")
    for (x in 0..6){
        val arr2 = mutableListOf("$num S S S S S S S S")
        for(element in arr2){
            num++
            print(element)
        }
        println()
    }

    println("Enter the number of rows:")
    val row = readln().toInt()
    println("Enter the number of seats in each row:")
    val seat = readln().toInt()
    val totalSeat = row * seat
   var frontTicketPrice = 10
    var backTicketPrice = 8

    var backAmount = (row / 2 + row % 2) * seat * backTicketPrice
    var frontAmount = row / 2  * seat * frontTicketPrice
    if(totalSeat <= 60){
        println("Total income:\n$${totalSeat * frontTicketPrice}")
    } else {
        println("Total income:\n$${frontAmount + backAmount}")
    }
}