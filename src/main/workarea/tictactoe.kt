package workarea

/**
 * Description
It's time to make our game interactive! Now we're going to add the ability for a user to make a move. To do this, we need to divide the grid into cells. Suppose the top left cell has the coordinates (1, 1) and the bottom right cell has the coordinates (3, 3):

(1, 1) (1, 2) (1, 3)
(2, 1) (2, 2) (2, 3)
(3, 1) (3, 2) (3, 3)

The program should ask the user to enter the coordinates of the cell where they want to make a move.

In this stage, the user plays as X, not O. Keep in mind that the first coordinate goes from top to bottom and the second coordinate goes from left to right. The coordinates can include the numbers 1, 2, or 3.

What happens if the user enters incorrect coordinates? The user could enter symbols instead of numbers, or enter coordinates representing occupied cells or cells that aren't even on the grid. You need to check the user's input and catch possible exceptions.

Objectives
The program should work as follows:

Get the initial 3x3 grid from the input as in the previous stages. Here the user should input 9 symbols representing the field, for example, _XXOO_OX_.
Output this 3x3 grid as in the previous stages.
Prompt the user to make a move. The user should input 2 coordinate numbers that represent the cell where they want to place their X, for example, 1 1.
Analyze user input. If the input is incorrect, inform the user why their input is wrong:
Print This cell is occupied! Choose another one! if the cell is not empty.
Print You should enter numbers! if the user enters non-numeric symbols in the coordinates input.
Print Coordinates should be from 1 to 3! if the user enters coordinates outside the game grid.
Keep prompting the user to enter the coordinates until the user input is valid.
If the input is correct, update the grid to include the user's move and print the updated grid to the console.
To summarize, you need to output the field 2 times: once before the user's move (based on the first line of input) and once after the user has entered valid coordinates (then you need to update the grid to include that move).
 */


fun main() {
    val input = readln()

    val line1 = mutableListOf(input[0], input[1], input[2])
    val line2 = mutableListOf(input[3], input[4], input[5])
    val line3 = mutableListOf(input[6], input[7], input[8])

    val list = mutableListOf(line1, line2, line3)

    println("""
        ---------
        | ${list[0][0]} ${list[0][1]} ${list[0][2]} |
        | ${list[1][0]} ${list[1][1]} ${list[1][2]} |
        | ${list[2][0]} ${list[2][1]} ${list[2][2]} |
        ---------
        """.trimIndent().replace('_', ' ')
    )
    try {
        while (true) {
        val(x, y) = readln().split(" ")
        val cor1 = x.toInt()
        val cor2 = y.toInt()

        if (cor1 !in 1..3 || cor2 !in 1..3) {
            println("Coordinates should be from 1 to 3!")
        } else if (list[cor1 - 1][cor2 - 1] == 'X' || list[cor1 - 1][cor2 - 1] == 'O') {
            println("This cell is occupied! Choose another one!")
        } else
            list[cor1 - 1][cor2 - 1] = 'X'
            println(
                """
            ---------
            | ${list[0][0]} ${list[0][1]} ${list[0][2]} |
            | ${list[1][0]} ${list[1][1]} ${list[1][2]} |
            | ${list[2][0]} ${list[2][1]} ${list[2][2]} |
            ---------
            """.trimIndent().replace('_', ' ')
            )
        return
        }
    } catch (e: IndexOutOfBoundsException) {
        println("You should enter numbers!")
    }
}




//package tictactoe

//fun workarea.workarea.workarea.main() {
//    println("Enter cells:")
//    val symbols = readln()
//
//    val line1 = mutableListOf(symbols[0], symbols[1], symbols[2])
//    val line2 = mutableListOf(symbols[3], symbols[4], symbols[5])
//    val line3 = mutableListOf(symbols[6], symbols[7], symbols[8])
//
//    val list = mutableListOf(
//        line1,
//        line2,
//        line3
//    )
//
//    println(
//        """
//        ---------
//        | ${list[0][0]} ${list[0][1]} ${list[0][2]} |
//        | ${list[1][0]} ${list[1][1]} ${list[1][2]} |
//        | ${list[2][0]} ${list[2][1]} ${list[2][2]} |
//        ---------
//        """
//    )
//
//    while (true) {
//        println("Enter the coordinates:")
//
//        val (number1, number2) = readln().split(" ")
//        val coordinate1 = number1.toInt()
//        val coordinate2 = number2.toInt()
//
//        if (coordinate1 !is Int || coordinate2 !is Int) {
//            println("You should enter numbers!")
//        } else if (coordinate1 < 1 || coordinate1 > 3 || coordinate2 < 1 || coordinate2 > 3) {
//            println("Coordinates should be from 1 to 3!")
//        } else if (list[coordinate1 - 1][coordinate2 - 1] == 'X' || list[coordinate1 - 1][coordinate2 - 1] == 'O') {
//            println("This cell is occupied! Choose another one!")
//        } else {
//            list[coordinate1 - 1][coordinate2 - 1] = 'X'
//            println(
//                """
//            ---------
//            | ${list[0][0]} ${list[0][1]} ${list[0][2]} |
//            | ${list[1][0]} ${list[1][1]} ${list[1][2]} |
//            | ${list[2][0]} ${list[2][1]} ${list[2][2]} |
//            ---------
//            """
//            )
//            return
//        }
//    }
//}
//fun gameState() {
//    var ex = 0
//    var oh = 0
//    var check = 0
//    for (i in grid.indices) {
//        if (grid[i] == 'X') ex++
//        if (grid[i] == 'O') oh++
//    }
//// --------------horizontal lines -------------
//    if (grid[0] == grid[1] && grid[1] == grid[2]) check++
//    if (grid[3] == grid[4] && grid[4] == grid[5]) check++
//    if (grid[6] == grid[7] && grid[7] == grid[8]) check++
//
//    // --------- vertical lines ----------
//    if (grid[0] == grid[3] && grid[3] == grid[6]) check++
//    if (grid[1] == grid[4] && grid[4] == grid[7]) check++
//    if (grid[2] == grid[5] && grid[5] == grid[8]) check++
//
//    // ---------- diagonal lines -------
//    if (grid[0] == grid[4] && grid[4] == grid[8]) check++
//    if (grid[2] == grid[4] && grid[4] == grid[6]) check++
//
//    if ((ex - oh == 1 || ex - oh == 0) && check == 1) return println("X wins")
//    if ((oh - ex == 1 || oh - ex == 0) && check == 1) return println("O wins")
//    if (check > 1) return println("Impossible")
//    if (check == 0 && (ex == 5 || oh == 5)) return println("Draw")
//    if (ex - oh >= 2 || oh - ex >= 2) return println("Impossible")
//    if (ex < 4 || oh < 4) return println("Game not finished")
//}