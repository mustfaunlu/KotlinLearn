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

val grid = MutableList(9) { ' ' }

fun main() {
    input()
    takeCoordinate()
    //gameState()
}


fun input(){
    val input = readln()
    for (i in input.indices) {
        grid[i] = input[i]
    }
    printer()
}
fun printer(){
     println(
        """
        ---------
        | ${grid[0]} ${grid[1]} ${grid[2]} |
        | ${grid[3]} ${grid[4]} ${grid[5]} |
        | ${grid[6]} ${grid[7]} ${grid[8]} |
        ---------
        """.trimIndent().replace('_', ' ')
    )
}
fun takeCoordinate() {
    var switch = true
    var x = 0
    var o = 0
    try {
         do {
            val cordinate = readln().replace("\\s".toRegex(), "").toInt()
             if (cordinate !in 11..13 && cordinate !in 21..23 && cordinate !in 31..33) println("Coordinates should be from 1 to 3!")
            when(cordinate) {
                11 -> if (grid[0].isLetter()) return println("This cell is occupied! Choose another one!") else grid[0] = 'X'
                12 -> if (grid[1].isLetter()) return println("This cell is occupied! Choose another one!") else grid[1] = 'X'
                13 -> if (grid[2].isLetter()) return println("This cell is occupied! Choose another one!") else grid[2] = 'X'
                21 -> if (grid[3].isLetter()) return println("This cell is occupied! Choose another one!") else grid[3] = 'X'
                22 -> if (grid[4].isLetter()) return println("This cell is occupied! Choose another one!") else grid[4] = 'X'
                23 -> if (grid[5].isLetter()) return println("This cell is occupied! Choose another one!") else grid[5] = 'X'
                31 -> if (grid[6].isLetter()) return println("This cell is occupied! Choose another one!") else grid[6] = 'X'
                32 -> if (grid[7].isLetter()) return println("This cell is occupied! Choose another one!") else grid[7] = 'X'
                33 -> if (grid[8].isLetter()) return println("This cell is occupied! Choose another one!") else grid[8] = 'X'
                //!in 11..13, !in 21..23, !in 31..33 -> println()
            }
            for (i in grid.indices) {
                if (grid[i] == 'X') x++
                if (grid[i] == 'O') o++
            }
            if (x + o >= 9) {
                switch = false
            } else {
                x = 0
                o = 0
            }
            printer()
        } while (switch)
    } catch (e: NumberFormatException) {
         println("You should enter numbers!")
    }
}

fun gameState() {
    var ex = 0
    var oh = 0
    var check = 0
    for (i in grid.indices) {
        if (grid[i] == 'X') ex++
        if (grid[i] == 'O') oh++
    }
// --------------horizontal lines -------------
    if (grid[0] == grid[1] && grid[1] == grid[2]) check++
    if (grid[3] == grid[4] && grid[4] == grid[5]) check++
    if (grid[6] == grid[7] && grid[7] == grid[8]) check++

    // --------- vertical lines ----------
    if (grid[0] == grid[3] && grid[3] == grid[6]) check++
    if (grid[1] == grid[4] && grid[4] == grid[7]) check++
    if (grid[2] == grid[5] && grid[5] == grid[8]) check++

    // ---------- diagonal lines -------
    if (grid[0] == grid[4] && grid[4] == grid[8]) check++
    if (grid[2] == grid[4] && grid[4] == grid[6]) check++

    if ((ex - oh == 1 || ex - oh == 0) && check == 1) return println("X wins")
    if ((oh - ex == 1 || oh - ex == 0) && check == 1) return println("O wins")
    if (check > 1) return println("Impossible")
    if (check == 0 && (ex == 5 || oh == 5)) return println("Draw")
    if (ex - oh >= 2 || oh - ex >= 2) return println("Impossible")
    if (ex < 4 || oh < 4) return println("Game not finished")
}