package `2 Basics`.controlflow

// operatore asiri yukleme var olan anlami degistirme veya ikinci bir islev katmak
// asagida minus operatorunu overload ettik

 data class PairNumber (val num1: Int, val num2: Int) {

     operator fun minus(pairnumber: PairNumber): PairNumber {
         return PairNumber(
             num1 - pairnumber.num1,
             num2 - pairnumber.num2
         )
     }

 }

fun main() {
    val numberone = PairNumber(1,3)
    val numbertwo = PairNumber(5, -1)

    val sonuc = numberone - numbertwo
    println(sonuc)
}