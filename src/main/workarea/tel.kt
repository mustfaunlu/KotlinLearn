package workarea

fun main() {
    print("Bir telefon numarasini giriniz: ")
    val no = readln().toInt()  // integer turunde telefon numarasini kullanicidan(terminalden) aliyoruz
    if(no in 5300000000 .. 5459999999) {  // kotlinde belli bir araligi sarttan sonra in operatoru yazip sayilar arasinda .. operatorunu kullanabilirsiniz
        println("Numara dogru!")
    } else {
        println("Numara yanlis!")
    }

}