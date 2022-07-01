package `4 Classes`
                               // ABSTRACT VS INTERFACE

/**                 |===========  BENZERLIKLER  =============|

 1 ikisindede bodysi olmayan func ve degeri olmayan propertyler override edilmek zorunda

 2 ikisindede bodysi olan func ve degeri olan(statik olarak) propertyler override edilme zorunda degil.

 3 ikisindede bir abs diger abs veya bir interface diger interface i; miras aliyorsa override zorunluluklari kalkar

 4 bu zorunluluk olmamasina ragmen override edilirlerse o abs veya int kullanacak duz  veya child classda override zorunlulugu ort. yine kalkar.

 5 hem int hem abs lar super type olarak gecer. Bir interface ve abstracti parametre tipi olarak kullanabiliriz.

 6 bir abs class bir interface i implement ediyorsa yine implement icindeki overridelari override etmek zorunda degildir.


 */



/**                     |=============  FARKLILIKLAR ============|


 1 abs state var / interfacede yok(statik deger dondurmesi state anlamina gelmez)

 2 abs classlar bir classdan inherit olur / ama bir class birden fazla interface alir

 3 abs bir sozlemedir yapilmasi zorunlu olan seyleri tutar oz nitelikleri belirler defaultlari belirlenir /
interfacelerin amaci ise e bilmek anlami katar, istenilen class a yeni ozellik yetenek ekler.

 4 interfaceler arayuz belirteci olarakda kullanilir.<> arasina yazilan belirteclerde interfacedir.


 */