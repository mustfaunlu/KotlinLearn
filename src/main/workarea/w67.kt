
fun main() {
    // Get number of rows
    println("Enter the number of rows:")
    val rows: Int = readln().toInt()

    // Get number of seats in each row
    println("Enter the number of seats in each row:")
    val seatsPerRow: Int = readln().toInt()




    // Create bi-dimensional Mutable list of size rows * seatsPerRow
    // Initialize it with 'S'
    val cinema = MutableList(rows) {
        MutableList(seatsPerRow) { 'S' }
    }

    while (true){
            println("""
        1. Show the seats
        2. Buy a ticket
        0. Exit
       
         """.trimIndent())
        val  input = readln().toInt()

        when(input){
            0 -> return
            1 -> printCinema(cinema,rows,seatsPerRow)
            2 -> {// Get the row of the seat to book
                println("\nEnter a row number:")
                val bookSeatRow: Int = readln().toInt()

                // Get the seat number in that row to book
                println("Enter a seat number in that row:")
                val bookSeatColumn: Int = readln().toInt()
                val ticketPrice: Int = calculateSeatPrice(rows, seatsPerRow, bookSeatRow)
                println("\nTicket price: \$$ticketPrice")
                // Book the seat
                cinema[bookSeatRow - 1][bookSeatColumn - 1] = 'B'
            }
        }
    }
}

fun calculateSeatPrice(rows: Int, seatsPerRow: Int, bookSeatRow: Int): Int {
    if (rows * seatsPerRow <= 60) return 10
    else if (bookSeatRow <= (rows / 2)) return 10
    else return 8
}

fun printCinema(cinema: MutableList<MutableList<Char>>, rows: Int, seatsPerRow: Int) {
    println("\nCinema:")
    print("  ")
    for (seat in 1..seatsPerRow) {
        print("$seat ")
    }
    println()
    for (row in 0 until rows) {
        print("${row + 1} ")
        println(cinema[row].joinToString(" "))
    }
}

fun totalIncome() {
    /*    val totalIncome: Long = if (rows * seatsPerRow <= 60) {
         (10 * rows * seatsPerRow).toLong()
     } else {
         val frontRows: Int = rows / 2
         val backRows: Int = rows / 2 + rows % 2
         ((10 * frontRows * seatsPerRow) + (8 * backRows * seatsPerRow)).toLong()
     }
     println("Total income:")
     println("$$totalIncome")*/
}