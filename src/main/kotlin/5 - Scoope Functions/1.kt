package `5 - Scoope Functions`

import java.math.BigDecimal

/**
 * a
 * scoopelar icinde it ya da this kullan nesne adini yazma
 *
 * run let with
 *
 * also apply
 *
 * let; genellikle nullable olan nesnesi olusturmus degiskenler uzerinde nullcheck icin kullanilir.
 * with; halihazirda yine bir nesne var bu nesne nullable degilse let yerine with kullanilir.
 * run ; with let birlesimi gibidir. elimizde bir degisken var ama bu degisken nullable degil.
 belli scope icinde belli fonksiyonlari calistirmak icin olusturulur.
 *
 * also; genelde ya with ya da let sonuna koyulur. Cunku lette nullable bir obje uzerine veya
 withle nullable olmayan bir obje uzerine biseyler yaptim logicler calistirdim ve
 bunlarin disinda ayrice(also) biseyler yapacak isem logic calistiracaksam kullanirim.
 *
 * apply; nesnesi yeni olusturulan nesnenin propertylerinin ilk deger atamalarinin yapilmasinda kullanilir.
 constructorundan parametre alan class ile kullanilmasi yanlis. duz class ile kullanilabilir.
 constructorda olmayan parametreleri doldurmak icin kullanilir.

 * !! let apply with bunlar arada bir yerde olmamali basta yazilir. also kesinlikle arada olmali.run her iki tarafata olabilir.
 *
 */

fun main() {
    var backAccount: BackAccount? = null
    backAccount = BackAccount(
        23452.32.toBigDecimal(),"Mustafa"
    )

    if (backAccount != null && backAccount.accountName != null) {
        println(backAccount.accountName)
    }

    //let

    backAccount?.let {
        if (backAccount != null && backAccount.accountName != null) {
            println(backAccount.accountName)
        }
        if (it != null && it.accountName != null) {
            println(it.accountName)
        }

    }

    //run

    backAccount.run {
        if (backAccount != null && backAccount.accountName != null) {
            println(backAccount.accountName)
        }
    }

    run {  }

    //also

    backAccount.also {
        if (backAccount != null && backAccount.accountName != null) {
            println(backAccount.accountName)
        }
    }

    //apply

    backAccount.apply {
        if (backAccount != null && backAccount.accountName != null) {
            println(backAccount.accountName)
        }
    }

    //with

    with(backAccount) {
        if (backAccount != null && backAccount.accountName != null) {
            println(backAccount.accountName)
        }
    }
}

data class BackAccount (
    val accountBalance: BigDecimal?,
    val accountName: String?,
)