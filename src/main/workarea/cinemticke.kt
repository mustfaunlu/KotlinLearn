package workarea

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

    var frontTicketPrice = 10
    var backTicketPrice = 8


    if(row in 1..4){
        println("Total cost:\n$$frontTicketPrice")
    } else {
        println("Total income:\n$$backTicketPrice")
    }
}