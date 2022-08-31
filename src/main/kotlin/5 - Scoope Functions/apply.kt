package `5 - Scoope Functions`



/**
 * contextObject.apply {(this)..lambda..} return contextObject
 * apply; nesnesi yeni olusturulan nesnenin propertylerinin ilk deger atamalarinin yapilmasinda kullanilir. Nesneyi ozellestirmek
icin kullanilir. constructorundan parametre alan class ile kullanilmasi yanlis. duz class ile kullanilabilir.
constructorda olmayan parametreleri doldurmak icin kullanilir. Olmayan propertyleri olusturmak ve initiliaze etmetk icin
gerekli fonksiyonlari tanimlayabiliriz. Apply kisaca aldigi contextObjecti kullanima hazir hale getirmeye yarar.
 * Bir nesneyi yapilandirmayi saglar.
 *'nesneye asagidaki atamalari uygula' gibi bir anlami vardir.

        val adam = Person("Adam").apply {
            age = 32
            city = "London"
        }
        println(adam)

 * Context objecti dönüş değeri olarak aldigi icin, daha karmaşık işlemler için apply i
 kolayca çağrı zincirlerine dahil edebilirsiniz.
 */

