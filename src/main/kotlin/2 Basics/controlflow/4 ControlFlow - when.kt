package `2 Basics`.controlflow

fun main() {

    /**
     * switch case lerin yerine gelmistir.
     * when(karsilastirilacak ifade)
     * value -> {}
     * value -> {}
     * else -> {}
     * formatiyla kullanilir.
     * Yine {} arasina tek satir kod yazilacaksa bu durumda {} leri kullanmayabiliriz.
     * birden fazla value leri , ve or ile ayirabilirz. Veya anlamina gelir.
     */
    val day = 66

    val result = when (day) {
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
        is Long -> println("Long")
        !is Long ->println("Int")
    }

    //range leri in !in seklinde kontroulu yapilabilir.
    val number = 3
    when (number){
        in 0..10 -> println("ff") // 0 10 arasindaysa
        in 0..10 -> println("bb") // 11 20 arasindaysa
        !in 0..10 -> println("cc") // 11 20 arasinda degilse
    }

}