package `2 Basics`.controlflow

fun main() {
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
     * This is how it works:

    The when variable (day) is evaluated once
    The value of the day variable is compared with the values of each "branch"
    Each branch starts with a value, followed by an arrow (->) and a result
    If there is a match, the associated block of code is executed
    else is used to specify some code to run if there is no match
    In the example above, the value of day is 4, meaning "Thursday" will be printed
     */

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