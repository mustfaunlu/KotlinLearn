package workarea

import java.io.File
import java.util.*

fun main() {
    val scanner = Scanner(File("C:\\Users\\LENOVO\\Desktop\\book.txt"))
    var count = 0
    scanner.use {
        while (scanner.hasNext()) {
            println(scanner.nextLine())
            count++
        }
    }
    println(count)
}