package workarea

import kotlin.math.abs
import kotlin.system.exitProcess

fun main() {
    val str = readln().toList()
    var x = 0
    var o = 0
    var blank = 0
    for (j in str){
        if (j == 'X') x++
        if (j == 'O') o++
        if (j == '_') blank++
    }

    println("---------")
    for (i in 0..2){
        println("| ${str[3 * i]} ${str[3 * i + 1]} ${str[3 * i + 2]} |")
    }
    println("---------")
    if (x - o >= abs(2) || o - x >= abs(2) ) {
        println("Impossible")
        exitProcess(0)
    }
    ifLogic(str)
}

fun ifLogic(str: List<Char>){
    var xWins: Int = 0
    var yWins: Int = 0
    if ((str[0] == 'X' && str[1] == 'X' && str[2] == 'X') || (str[0] == 'O' && str[1] == 'O' && str[2] == 'O')){
        when {
            str[0] == 'X' -> {
                xWins++
                println("X wins")
            }
            str[0] == 'O' ->  {
                yWins++
                println("O wins")
            }
        }
    }
    if ((str[0] == 'X' && str[3] == 'X' && str[6] == 'X') || (str[0] == 'O' && str[3] == 'O' && str[6] == 'O')) {
        when {
            str[0] == 'X' -> {
                xWins++
                println("X wins")
            }
            str[0] == 'O' -> {
                yWins++
                println("O wins")
            }
        }
    }
    if ((str[0] == 'X' && str[4] == 'X' && str[8] == 'X') ||(str[0] == 'O' && str[4] == 'O' && str[8] == 'O')) {
        when {
            str[0] == 'X' -> {
                xWins++
                println("X wins")
            }
            str[0] == 'O' ->{
                yWins++
                println("O wins")
            }
        }
    }
    if ((str[2] == 'X' && str[4] == 'X' && str[6] == 'X') ||(str[2] == 'O' && str[4] == 'O' && str[6] == 'O')) {
        when {
            str[2] == 'X' ->{
                xWins++
                println("X wins")
            }
            str[2] == 'O' -> {
                yWins++
                println("O wins")
            }
        }
    }
    if ((str[1] == 'X' && str[4] == 'X' && str[7] == 'X') ||(str[1] == 'O' && str[4] == 'O' && str[7] == 'O')) {
        when {
            str[1] == 'X' -> {
                xWins++
                println("X wins")
            }
            str[1] == 'O' -> {
                yWins++
                println("O wins")
            }
        }
    }
    if ((str[2] == 'X' && str[5] == 'X' && str[8] == 'X') ||(str[2] == 'O' && str[5] == 'O' && str[8] == 'O')) {
        when {
            str[2] == 'X' -> {
                xWins++
                println("X wins")
            }
            str[2] == 'O' -> {
                yWins++
                println("O wins")
            }
        }
    }
    if ((str[3] == 'X' && str[4] == 'X' && str[5] == 'X') ||(str[3] == 'O' && str[4] == 'O' && str[5] == 'O')) {
        when {
            str[3] == 'X' -> {
                xWins++
                println("X wins")
            }
            str[3] == 'O' -> {
                yWins++
                println("O wins")
            }
        }
    }
    if ((str[6] == 'X' && str[7] == 'X' && str[8] == 'X') ||(str[6] == 'O' && str[7] == 'O' && str[8] == 'O')) {
        when {
            str[6] == 'X' -> {
                xWins++
                println("X wins")
            }
            str[6] == 'O' ->{
                yWins++
                println("O wins")
            }
        }
    } else if (xWins == yWins) {
        println("Impossible")
    } else if(str.contains('_')) {
        println("Game not finished")
    } else if(str.isNotEmpty()) {
        println("Draw")
    }

}


//012   XXX0X0X00  000
//036   X00X00X00  0XX0XX0XX
//048   X000X000X  0XXX0XXX0
//246   00X0X0X00  XX0X0X0XX
//147
//258
//345
//678



/**
 * This problem will require some time and dedication.  Here is the approach I used:
First, instead of arrays, I used strs as the operations I wanted weren't available for arrays.  To create a str, instead of arrayOf(), use strOf() for a static str and mutablestrOf() for a str that will be changed throughout the program.
The game board was set up as indeX positions:
[0] [1] [2]
[3] [4] [5]
[6] [7] [8]
Since I used the indeX position of the input string to print the game board, I decided to use the indeX positions to check for the different outcomes.
Create 8 strs for each of the 8 different win conditions
Create a mutablestr for the indices of X and another mutable str for the indices of O
Then create a for loop to go through the input and build the strs in the step above.
You can then use .containsAll() to see if those strs contain any of the 8 win conditions.  I also made the boolean variables X3InARow and y3InARow and set them to false.  Then have them change to true with the above test.
Using those outputs, and .size and some logic, you can make a if, else if tree to spit out the appropriate outputs.
 */