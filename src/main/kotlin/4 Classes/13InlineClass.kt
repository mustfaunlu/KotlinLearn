package `4 Classes`

open class BankAccount3(val balance: Int, ){
    val branchCode:Long = 3245
}
interface  Print {
    fun printBalance()
}

@JvmInline
value class BankAccount4(val balance: Int): Print{
    init {
        print("balance : $balance")
    }


    val accountNumber: Long
    get() {
        return 232343245
    }

    fun getAccountNumber2(): Long{
        return 232343245
    }

    override fun printBalance() {
        print("Interface print - balance : $balance")
    }
}
/**
 * value classlar @JvmInline annotation olmadan henuz kullanilamaz
 *
 * tek bir degisken kabul ediliyor
 *
 * inline classlar ile init block u kullanabiliriz
 * inline classlarin belirtilen constructorlari java kodunda private olarak bulunurlar.
 Bundan dolayi istesekde nesne olusturamayiz. Bunu yapabiliyor gibi gorunmemizin sebebi, gercekte o nesnenin hic yaratilmiyor olusu sebebiyle.
 * Bizim nesne olustutukn gorgugumuz sey aslinda const. icindeki degiskenin kendisi.
 *
 * Inline classlar icinde propery tanimlanmasina izin verilir. Ancak bu properylerin backing fieldi ollmaz
 * herhangi bir interface implement ederler ama baska bir clasi miras alamaz ve miras alinamazlar default olarak finaldirlar.
 *
 * open sealed ve abstract keyword kullanilamaz. final kullanmak gereksizdir. reduant uyarisi verir.
 */

interface  I

@JvmInline
value class  Foo2(val i: Int) : I

fun asInline(f: Foo2){}
fun <T> asGeneric(x: T){}
fun asInterface(i: I){}
fun asNullable(i: Foo2?){}

fun <T> id(x: T): T = x


fun main() {
    val balance3: BankAccount3 = BankAccount3(25000) //reference (duz class nesnesi)

    val balance4: BankAccount4 = BankAccount4(25000) /// primitive tip gibi davranir (value class nesnesi)
    val balance5: Int = 2500 //balance4 ile ayni tipte


    val f = Foo2(42) // f in tipi int -> primitive -> unboxed

    asInline(f)  // unboxed primitive type olur  used as Foo2 itself
    asGeneric(f) // boxed reference type  used as generic type T
    asInterface(f ) // boxed reference type used as type I
    asNullable(f) // boxed reference type used as Foo2? which is different from Foo2
    //yani sadece normal fonksiyona verirsek primitive type ozelligini korumus oluruz. aksi taktirde boxed olacak reference type donusece


    // ilk basta primitive olarak verdik boxed hale donmeden verdigmiz degeri geri aliyoruz ve unboxed type almis olduk
    val c = id(f)
    val c2 = id(42) // -> return 42

}