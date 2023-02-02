package classes
                               // ABSTRACT VS INTERFACE

/**                 |===========  BENZERLIKLER  =============|

 1 ikisindede bodysi olmayan func ve degeri olmayan propertyler override edilmek zorunda

 2 ikisindede bodysi olan func ve degeri olan(statik olarak) propertyler override edilme zorunda degil.

 3 ikisindede bir abs diger abs veya bir interface diger interface i; miras aliyorsa override zorunluluklari kalkar

 4 bu zorunluluk olmamasina ragmen override edilirlerse o abs veya int kullanacak duz  veya child classda override zorunlulugu ort. yine kalkar.

 5 hem interfaceler hem abstractlar super type olarak gecer. Bir interface ve abstracti parametre tipi olarak kullanabiliriz.

 6 bir abs class bir interface i implement ediyorsa yine  icindeki overridelari override etmek zorunda degildir.

 7 ikisindede open final keywordleri kullanmak anlamsizdir.


 */



/**                     |=============  FARKLILIKLAR ============|


 1 abs state var / interfacede yok(statik deger dondurmesi state anlamina gelmez)

 2 bir class bir abstract class miras alabilirken /  bir class birden fazla interface alir
   abstract classlar extends edilir / interfaceler implements edilir.

 3 abs bir sozlemedir alt classlarinda yapilmasi zorunlu olan seyleri tutar yapinin oz niteliklerini belirler defaultlari belirlenir /
   interfacelerin amaci ise -e bilmek anlami katar, istenilen class a yeni ozellik yetenek ekler. harici beceri seti katar.
   hali hazirda yapabilidigi seyleri abstract classlara yazmaliyiz default olarak yapabiliyorsa abstracttadir. ama opsiyonel olarak
beceri kazaniyorsa interface implement edilmelidir. mesela araba classinin motorunun olmasi zorunludur default olmasi gerekir o yuzden abstractta
tanimlanir fakat arabanin sunrooflu olmasi veya turbolu olmasi interfacede tanimlanir cunku beceri seti kazanmis olur.

 4 interfaceler arayuz belirteci olarakda kullanilir.<> arasina yazilan belirteclerde interfacedir.

 5 abstract classlar sozlesmedir, interfaceler yetenek setidir.

  6- interfacelerin fonksiyonlari bir yerden tetiklenir diger yerden calisti bilgisi alinir, veri tasinir,
        abstract fonksiyonlarda ise tetiklemeye ihtiyac yok basitce call edilir.

 7 -

 */