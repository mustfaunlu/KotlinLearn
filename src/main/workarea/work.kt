
fun main() {
    var dNote = 0
    var cNote = 0
    var bNote = 0
    var aNote = 0
    val rep = readln().toInt()

    repeat(rep){
        val note = readln().toInt()
        if (note == 2) dNote ++
        if (note == 3) cNote ++
        if (note == 4) bNote ++
        if (note == 5) aNote ++
    }
    print("$dNote $cNote $bNote $aNote")


}














//fun workarea.workarea.workarea.main() {
//    var max = 0
//    while(true){
//        val scan = readln().toInt()
//        if (scan == 0) {return print(max)}
//        max += scan
//    }
//}