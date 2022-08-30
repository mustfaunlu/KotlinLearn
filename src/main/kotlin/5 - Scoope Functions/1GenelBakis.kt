package `5 - Scoope Functions`

import java.math.BigDecimal

/**
 * scope functionslar bir nesne baglaminda kod blogu yurutur. Nesne uzerinden lambda yoluyla bu functionlari
 cagirdigimizda gecici bir scope olusturur. Bu scope icinde nesneye adi olmadan erisebiliriz. Bes adettir;
 run, let, with, also, apply.

 * scope fonksiyonlar inline fonksiyon old. icin arka planda yazilirken gercekte olusturulmayacak,
sadece bodysi(scope) cagrildigi yere yapistirilacaktir.


 * Temel olarak bu fonksiyonlar ayni isi yaparlar yani bir nesne uzerinde bir kod blogu yuruturler.
 * Farklı olan, bu nesnenin blok içinde nasıl kullanılabilir hale geldiği ve
tüm fonksiyonun sonucunun ne donderdigidir.

 * Scope functions, herhangi bir yeni teknik yetenek getirmez, sadece kodunuzu daha kısa ve
 okunabilir hale getirebilirler.

 * Scope fonksiyonlarin benzerligi nedeniyle o anki kodumuzun durumuna gore dogru olani secmek zor olabilir.
 Bu secim yapilacak isin amacina gore degisecektir.

    Aralarindaki temel farklarin tablosu;

    FUNCTION    OBJECT REFERENCE                RETURN VALUE         IS EXTENSION FUNCTION?
    ----------------------------------------------------------------------------------------------
    let             it                          lambda result           yes
    ===============================================================================
    run             this                        lambda result           yes
    ==============================================================================
    run             -                           lambda result           No: called without the context object
    ==============================================================================
    with            this                        lambda result	        No: takes the context object as an argument.
    ===============================================================================
    apply           this                        context Object          yes
    ===============================================================================
    also            it                          context Object          yes
    ================================================================================

    If you need the lambda result, narrow your options down to either let(), with() or run().
    If you need the context object, narrow your options down to either also() or apply().
    After that, choose between the remaining two options based on your preference for
how to represent the context object inside the lambda.
    If you need to use functions or properties on the object but not the object itself,
then run() or apply() would probably be a good fit. Otherwise, let() or also() generally would be a good way to go.

 * Null olamayan nesnelerde : let
 * Local scope icinde bir degiskenin  expression olarak(it) cagrilmasi : let
 * The safe-call operator is often used with scope functions. In fact, many Kotlin developers use let() with the safe-call operator to run a small block of code whenever the object is not null.
 * Nesne konfigurasyonu ve property deger atamalarinin yapilmasi: apply
 * Nesne konfigurasyonu ve sonucun hesaplanmasi, belli scope icinde belli functionlarin calistirilmasi: run
 * bir expressionun gerekli oldugu calisan durumlarda : extension olmayan run
 * bir nesne uzerinde birseyler yaptim ayrica(also) ek olarak bazi logiclerim varsa : also
 * bir nesneye ait fonksiyonlari gruplayarak cagirma: with

 * Scope fonksiyonlar, kodu daha kısa hale getirmenin bir yolu olsa da, bunları aşırı kullanmaktan kaçının:
kod okunabilirliğinizi azaltabilir ve hatalara yol açabilir.
 * Scope fonksiyonlarini iç ice yazmaktan kacinin ve bunları zincirlerken dikkatli olun:
Geçerli bağlam nesnesi(context Object) ve this veya it değeri hakkında kafa karıştırmak kolaydır. Dikkatli ol!!

 * Context object(baglam nesnesi) extension olan scope functionlara verilen receiver nesnedir. mesela bankAccount.let{}
 buradaki context object bankAcoount tir.

 * Her bir scope fonksiyon arasinda iki temel fark vardir;
 1- Context objecte basvurma yolu(referansi)(it veya this)
 2- Donus degeri (Scope function ne return ediyor. Context objectin tipini yoksa Unit mi)

`* Bir scope fonksiyonun lambdası içinde, bağlam nesnesi gerçek adı yerine kısa bir referansla kullanılabilir.
Her scope fonksiyon,bağlam nesnesine(context object) erişmek için iki yoldan birini kullanır:
bir lambda alıcısı (this) veya bir lambda argümanı (it).

  ==THIS==
 * run, with, and apply refer to the context object as a lambda receiver - by keyword 'this'.
 * Bu nedenle(this aldigi icin), onların lambdalarında nesne, sıradan sınıf fonksiyonlarinda olduğu gibi kullanılabilir.
 * Çoğu durumda, alıcı nesnenin üyelerine erişirken this i yazmadan kodu kısaltabilirsiniz. Mesela ;

        val adam = Person("Adam").apply {
            age = 20                       // same as this.age = 20
            city = "London"
        }
    Ama bu kullanim karisiklik olabilir diye onerilmez.
 *
 *
  == IT ==
 * let ve also context objecti bir arguman olarak alirlar.
 * Arguman ismi net belirtilmemisse nesneye implicit(ortulu) default ismimle (it) erisilir.
 * Ancak, nesne fonksiyonlarini veya propertylerini çağırırken, nesneyi it yazarak,  this gibi dolaylı olarak kullanamazsınız.
 * Nesne cogunlukla scope icinde fonksiyon cagrilarinda arguman olarak kullaniliyorsa it kullanmak daha iyidir.
 * kod blogunda birden cok degisken varsa it kullanmak yine daha iyidir.
 * Scope icindeki context objectin referansini it yerine ozel bir isim  yapabiliriz;
            fun getRandomInt(): Int {
                    return Random.nextInt(100).also { value ->       //it yerine value yazilmis buraya hicbirsey yazmadan
                        writeToLog("getRandomInt() generated value $value")  //buraya direkt $it yazabilirdiik
                    }
            }
 *
 *
    == RETURN VALUE ==
 * Scope fonksiyonlar dondurdukleri sonuca gore farklilik gosterirler.
 1 apply ve also context object dondurur
 2 let, run ve with lambdanin sonucunu dondurur. Son satirda ne varsa onu dondurur.
 * Bu iki secenek kodunuzda bir sonraki adimda ne yapacaginiza bagli olark uygun scope fonksiyonu secmenize olanak tanir.
 *
    == CONTEXT OBJECT ==
 * apply ve also context objectin kendisini dondurur
 * bundan dolayi zincirleme olarak kullanilabilirler.

    val numberList = mutableListOf<Double>()
    numberList.also { println("Populating the list") }
        .apply {
        add(2.71)
        add(3.14)
        add(1.0)
    }
    .also { println("Sorting the list") }
    .sort()

CIKTI ;
    Populating the list
    Sorting the list
    [1.0, 2.71, 3.14]

    == LAMBDA RESULT ==
 * let, run ve with lambda sonucunu dondurur.
 * Bu sebeple, sonucu bir değişkene atarken, sonuç üzerinde zincirleme işlemleri vb. yaparken bunları kullanabilirsiniz.

    val numbers = mutableListOf("one", "two", "three")
    val countEndsWithE = numbers.run {
        add("four")
        add("five")
        count { it.endsWith("e") }
    }
    println("There are $countEndsWithE elements that end with e.")

 * Ek olarak geri donus degerini yok sayip, degiskenler icin gecici bir scope olusturmak adina bir scope fonksiyon
 kullanilabilir ;

    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        val firstItem = first()
        val lastItem = last()
        println("First item: $firstItem, last item: $lastItem")
    }

 */

fun main() {
    var backAccount: BackAccount? = null



    backAccount = BackAccount(
        23452.32.toBigDecimal(),"Mustafa"
    )


    //let

    backAccount.let {
    }

    //run

    backAccount.run {

    }

    run {  }

    //also

    backAccount.also {

    }

    //apply

    backAccount.apply {

    }


}

data class BackAccount (
    val accountBalance: BigDecimal?,
    val accountName: String?,
)