package workarea

fun main() {
    val size = readln().toInt()
    val list: MutableList<Int> = mutableListOf()
     for(i in 0 until size){
        val numbers = readln().toInt()
        if(numbers > 0){
            list.add(numbers)
        } else {
            println(" 0 dan buyuk sayi yaz keko")
        }

    }
    println(list.indexOf(list.maxOrNull()))
}

fun reversePrint() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (index in numbers.lastIndex downTo  0 step 2) {
        println("$index: ${numbers[index]}")
    }
}