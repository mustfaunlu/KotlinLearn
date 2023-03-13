package basics.control_flows

fun main() {

    /**
     * switch case lerin yerine kotlinde when yapisi kullanilir..
      when(karsilastirilacak ifade) {
        value1, value2 -> {}
        value3 or value4 -> {}
        value -> {}
        else -> {}
      }
      formatiyla kullanilir.
     * Yine {} arasina tek satir kod yazilacaksa bu durumda {} leri kullanmayabiliriz.
     * birden fazla value leri , ve or ile ayirabilirz. Veya anlamina gelir.
     *
     * when caseleride if caseleri gibi expression olarak kullanilip sonucu bir degiskene atilabilir.
     */
    val day = 66

    val result = when (day) {  //expression kullanim result degiskenine when case sonucu atanir.
        1 or 9 -> "Monday"
        2, 66 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    val dayNa = "Pazartesi"

    val result2 = when (dayNa) {
        "Pazartesi", "Pzt" -> "Monday" // buradaki virgul or yerine gecer
        "Sali" -> "Tuesday"
        "Carsamba" -> "Wednesday"
        "Persembe" -> "Thursday"
        "Cuma" -> "Friday"
        "Cumartesi" -> "Saturday"
        "Pazar" -> "Sunday"
        else -> "Invalid day."
    }
    println(result2)

    val countryCode = readln()
    when(countryCode.toInt()){
        2.and(3) -> println("tc")
        1 or 5->  println("az")
    }

// Outputs "Thursday" (day 4)


    /**
     * when"in yanina karsilastirma ifadesi eklemeden , bunu caselerin yaninada ekleyebiliriz.
     * bunun artisi && || and or xor gibi ifadeleride kullanabilmemizi saglar
     */

    // is !is ile bir clas in referansi olunup olunmadigi kontrolu yapilabilir
    val phoneNumber = 531213451343L
    when (phoneNumber) {
        is Long -> {
            println("Long")
            println("Long")
            println("Long")
        }
        !is Long ->println("Int")
    }

    //range leri in !in seklinde kontroulu yapilabilir.
    val number = 2
    when (number){
        in 0..10 -> println("ff") // 0 10 arasindaysa
        in 11..20 -> println("bb") // 11 20 arasindaysa
        !in 0..10 -> println("cc") // 0 10 arasinda degilse
    }

}