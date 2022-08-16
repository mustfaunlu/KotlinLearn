package `4 Classes`

/**
 * kotlinde fieldlar yoktur property vardir
 * property dedigimiz sey aslinda bir degiskenin get ve set fonksiyonlaridir.
 * biz javada bir degisken yazdigmizda getter ve setterini degiskenle beraber tanimlariz. asil degisken javadakidir. getter ve setterida propertysidir.
 * kotlinde hicbir zaman field degisken tanimlamayiz degisken gibi tanimladigmiz sey aslinda propertydir.
 *
 *
 * kotlinde hersey default olarak publictir javadakinin tersine.
 * Cunku kotlinde public degisken tanimlasak bile uretilen makine kodu private bir degiskendir ve
 * arka planda public get set functionlari ile o degiskene erisiliyor.
 * kotlinde biz bir public bir degisken tanimladigimizi sanarken arka planda aslinda degiskeni private tutuyor, get ve set functionlarini yaziyor
 * Bu yuzden kotlindeki degiskenlerimiz field degil aslinda propertydir. kotlinde asla gercek anlamda degisken tanimlamiyoruz.
 * set icinde field alani aslinda backing fielddir.
 *
 *
 * Bu sebeplerden oturu encapsulationa sorun teskil etmez. Zaten encapsule haldedir kod compile edilirken.
 * biz kotlinde degiskeni private de publicde yapsak java koduna cevirdigimizde her halukarda privatedir.
 * bu yuzden biz kotlinde encapsulationda delemeyiz.
 *
 * peki o zamna visibility modifierler neden var?
 * makine koduna donustururken get ve set methodlarinin modifierlerini degistirir.
 * biz kotlinde public var tanimladigimizda get ve setleri public olarak tanimalaniyor
 * ama private var tanimladigimizda get ve setleri yoktur.
 * yani kotlinde variable tanimlarken aslinda arka planda get set olsun mu olmasin mi bunu tanimliyoruz.
 *
 *
 * bu sebeplerden oturu biz extension functionlarda degiskeni bile extend edebiliyoruz.
 * cunku getter ve setteri extend ediyoruz.
 * ext variable yazarken deger atamasi yapilamaz. cunku  field yoktur. sadece get ve seti extend etmis oluyoruz.
 * (4 extensionFunction2.kt dosyasinin 68. satiri.)
 *
 * sonuc olarak aslinda val balance = 0 degiskeni tanimladigimizda bu sadece get ve set metodudur.
 * gercek bir balance degiskeni olusturmuyoruz getBalance ve setBalance functiionu yaratiyoruz arka planda. backing fieldi ise her zaman privatedir.
 * eger balance degiskenini private yaparsak get ve set functionu asla olusmaz. Boylece encapsulationun babasi olur.
 * Bu yuzdendir ki ext functionu bir variable a da kullanabiliriz. cunku variable aslinda get ve set functionudur.
 *
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
