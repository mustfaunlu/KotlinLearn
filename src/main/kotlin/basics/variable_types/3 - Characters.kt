package basics.variable_types

//tekli tirnak icine yazilan harf sayi karakter vb. dir.
//iki karakter veremeyiz tek karakter vermeliyiz fakat unicode ifadesi veriyorsak char icinde \ baslayip tanimlayabiliriz.

val unicode = '\uFF00'  // char type dir.

val firstCharOfName: Char = '6' // type conversion da eger chardan int e cevirirsek ascii karsiligi cikti olarak aliriz //54 sonucunu aliriz
val firstCharOfName1: Char = 'G'
val firstCharOfName2: Char = '?'


/**
escape karakterlerinde '\' seklinde tnaimlar;

    \t tab kadar bosluk

    \n alt satira inmek icin

    \b backspace icin

    \r satir basi

    \' – single quotation mark

    \" – double quotation mark

    \\ – backslash

    \$ – dollar sign

 */



// 'a' + 1 ?
val c1 = 'b'

// 'a' + 25 ?
val c2 = 'z'

// 'E' - 2 ?
val c3 = 'C'

// Numberlar gibi char karakterlerde nullable oldugunda referans(boxed) tipe donusur.
