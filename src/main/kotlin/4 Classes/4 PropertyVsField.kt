package `4 Classes`

/**
 *kotlinde fieldlar yoktur property vardir
 * property dedigimiz sey aslinda bir degiskenin get ve set degiskenidir.
 * kotlinde hicbir zaman field degisken tanimlamayiz
 * degisken gibi tanimladigmiz sey aslinda propertydir.
 *
 *
 * kotlinde hersey default olarak publictir javadakinin tersine.
 * Cunku kotlinde public tanimlasak bile uretilen makine kodu private bir degisken ve
 * public get set functionlari ile o degiskene erisiliyor.
 * Bu yuzden kotlindeki degiskenlerimiz aslinda propertydir. kotlinde asla gercek anlamda degisken tanimlamiyoruz.
 * set veya get fonksiyonunu tanimlamamiz gerekir. set icinde field alani aslinda backing fielddir.
 *
 *
 * Bu sebeplerden oturu encapsulationa sorun teskil etmez. Zaten encapsule haldedir kod compile edilirken.
 * biz kotlinde degiskeni private de publicde yapsak java koduna cevirdigimizde her halukarda privatedir.
 * bu yuzden biz kotlinde encapsulationda delemeyiz.
 *
 * peki o zamna visibility modifierler neden var?
 * java koduna donustururken get ve set methodlarinin modifierlerini degistirir.
 *
 *
 * bu sebeplerden oturu biz extension functionlarda degiskeni bile extend edebiliyoruz.
 * cunku get ve seti extend ediyoruz.
 * ext variable yazarken deger atamasi yapilamaz. cunku backing field yoktur. sadece get ve seti extend etmis oluyoruz.
 * (extensionFunction2.kt dosyasinin 68. satiri.)
 */

class BankAccount{
    var balance = 1_000_000
    set(value) {
        field = value   // field = backing field (balance)
    }
}

fun main() {
    val bankAccount = BankAccount()
    println(bankAccount.balance)

    bankAccount.balance = 500_000
    println(bankAccount.balance)
}
