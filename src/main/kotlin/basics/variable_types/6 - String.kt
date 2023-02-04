package basics.variable_types

/**
 * Charlardan olusan bir dizidir aslinda.
 * Cift tirnak icinde tanimlanrlar. " "
 *
 *
 */

val name:String = "Aila"



val firstCharOfname = name[name.indices.first]

val lastCharOfName = name[name.indices.last]

/**
 * Farkli tipteki bir degiskenin onune String bir degisken ya da ifade koyarak toplarsaniz sonuc String olur.
 */
val numbersValue: String = "value" + (4+2)   // soru olabilir !!
//val numbersValue: String = (4+2) + "value" calismaz

/**
 * String interpolation yapabiliriz  println("numbersValue $numbersValue")
 * println("numbersValue ${numbersValue.length}") bir degiskenin ozelligi kullanilacaksa suslu parantez kullanilmalidir.
 */

/**
 * 3 tane tirnaklar Raw String olusturulabilir.
 * Raw Stringler iderye nasil yaziliyorsa oyle kullanilir. Hizalamada bozulma olmaz.
 * trimIndent() fonksiyounu ile Raw String in kenar bosluklarini silebiliri.
 * Bu silme islemini yaparken tum satilrlardaki en soldaki karakteri baz alarak silme inslemini yapar.
 * Alttaki ornek icin 3 satirdan da $ isaretinin solundaki bosluga kadarini siler.
 * Raw Stringlerin icinde escape karakterler calismaz
 *
 */

val rawPineTree = """
         * 
        ***
       *****
         ||
""".trimIndent() //trimIndent sol taraftaki bosluklari tiraslar.


/**
 * trimMargin(marginPrefix) silinmesi istenen yere herhangi bir karakter koyup soldaki boslugu sileriz.
 */

val rawPineTree2 = """
        * 
 /     ***
 /    ******
        ||
""".trimMargin("/")

