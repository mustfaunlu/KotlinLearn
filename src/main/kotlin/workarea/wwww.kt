package workarea

fun main() {
    val count = readln().toInt()
    val list: MutableList<Int> = mutableListOf()
    
    for (i in 1..count){
        val numb = readln().toInt()
        list.add(numb)
    }
    val guess = readln().toInt()
    if (list.contains(guess)) println("YES") else println("NO")
}
