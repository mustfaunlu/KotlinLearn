package basics.control_flows

// operatore asiri yukleme(overloading) var olan anlami degistirme veya ikinci bir islev katmak
// asagida minus operatorunu overload ettik

 data class PairNumber (val num1: Int, val num2: Int) {

     operator fun minus(otherPairNum: PairNumber): PairNumber {
         return PairNumber(
             num1 - otherPairNum.num1,
             num2 - otherPairNum.num2
         )
     }

 }

fun main() {
    /**
     * operator overloading yapmasaydik normalde 23-28 satirlar arasindaki
     * gibi kod yazmamiz gerekirdi. Yani instancelari olusturup icindeki
     * sayilari tek tek cikarmamiz gerekirdir.
     */
    val pairNumberOne = PairNumber(2,4)
    val pairNumberTwo = PairNumber(-8,11)

    val resultOne = pairNumberOne.num1 - pairNumberTwo.num1
    val resultTwo = pairNumberOne.num2 - pairNumberTwo.num2
    println("Sonuc = $resultOne, $resultTwo")

    /**
     * operator overloading yaptigimiz icin asagidaki gibi
     * kolay bir sekilde instancelarin sayilarini cikarabiliyoruz.
     * Normalde minus operatoru sayilari cikartabilir biz ek bir ozellik
     * katarak classimizin instancelarinin cikarilmasini sagladik.
     */


    val numberone = PairNumber(1,3)
    val numbertwo = PairNumber(5, -1)

    val sonuc = numberone - numbertwo
    println(sonuc)
}