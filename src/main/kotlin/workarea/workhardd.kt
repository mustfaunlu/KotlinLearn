package workarea

fun main() {
    val input = readln().toInt()
    val list = mutableListOf<Int>()

    for (i in 1..input) {
         repeat(i) {
             list.add(i)
             if (list.size == input) {
                 print(list.joinToString(" "))
                 return
             }
         }
    }
}