package workarea

fun main() {
    // write your code here
    /*
    if it is gryffindor, output bravery;
    if it is hufflepuff, output loyalty;
    if it is slytherin, output cunning;
    if it is ravenclaw, output intellect;
    if otherwise, output not a valid house.
    */
    val str = readln()

    when(str){
        "gryffindor" -> println("bravery")
        "hufflepuff" -> println("loyalty")
        "slytherin" -> println("cunning")
        "ravenclaw" -> println("intellect")
        else -> println("not a valid house")
    }

    digit()



}
//Write a program that reads a string from the standard input and outputs the number.
// A number can be from 1 to 9 (inclusive).
fun digit() {
    val digit = readln()
    val listNumbers = listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
    when (digit) {
        in listNumbers -> print("${listNumbers.indexOf(digit) + 1}")
    }
}