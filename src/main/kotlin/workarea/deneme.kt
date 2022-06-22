fun main() {

    // ----------------- vize -----------------
    print("Lutfen vize agirlik orani giriniz : ")
    val agirlikVize = readln().toInt()

    print("Lutfen vize notu giriniz : ")
    val giveMeVizeNote = readln().toInt()
    val agnoWithNoteVize = (giveMeVizeNote * agirlikVize) / 100

    // ----------------- final -----------------
    print("Lutfen final agirlik orani giriniz : ")
    val agirlikFinal = readln().toInt()

    print("Lutfen final notu giriniz : ")
    val giveMeFinalNote = readln().toInt()
    val agnoWithNoteFinal = (giveMeFinalNote * agirlikFinal) / 100

    // --------------- total --------------

    val totalNote = agnoWithNoteVize + agnoWithNoteFinal

    when(totalNote){
        in 0..44 -> println("Notunuz : FF ($totalNote)")
        in 45..59 -> println("Notunuz : DD ($totalNote)")
        in 60..74 -> println("Notunuz : CC ($totalNote)")
        in 75 .. 100 -> println("Notunuz : AA ($totalNote)")

    }
}