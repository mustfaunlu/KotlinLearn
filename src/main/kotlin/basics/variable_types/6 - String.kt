package basics.variable_types

import java.util.*

fun main() {



/**
 * Charlardan olusan bir dizidir aslinda.
 * Cift tirnak icinde tanimlanrlar. " "
 *
 *
 */

val name:String = "Aila"
val lengthOfName = name.length // 4  name uzunlugunu verir



/**
 * Stringlerde index kullanilabilir.
 * Stringlerde indexler 0 dan baslar.
 * Stringlerde indexlerin sonuna ulasmak icin name.length - 1  yapmaliyiz.
 * Stringlerde indexlerin sonuna ulasmak icin ayrica name.indices.last yapabiliriz.
 * Stringlerde indexlerin ilk elemanina ulasmak icin name.indices.first yapmaliyiz.
 * Stringlerde indexlerin ilk elemanina ulasmak icin ayrica name.first() yapabiliriz.
 * Stringlerde indexlerin son elemanina ulasmak icin ayrica name.last() yapabiliriz.
 * Stringler char arrayleri olduklari icin indexlerle erisebiliriz. name[0] gibi ulasaibliriz. name[0] = 'A' gibi atama yapabiliriz
 *
 */

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

    val myJson = """
        {
            "name": "Aila",
            "surname": "Kaya",
            "age": 25
        }
    """.trimIndent()

    println("   ".isBlank()) // true
    println("".isEmpty()) // true

    val name1 = "Aila"
    val myString = buildString {
        repeat(3) {
            append("Hello, ")
            append(name1)
            appendLine("!")
        }
    }
    println(myString)   // Hello, Aila!
                        // Hello, Aila!
                        // Hello, Aila!

    val neverBlankString = " ".ifBlank { "Never Blank" }
    println(neverBlankString) // Never Blank

    val input = "  Aila Kaya   "
    println(input.trim()) //Aila Kaya

    val input1 = "@@Aila Kaya@@"
    input1.removePrefix("@@") // Aila Kaya@@
    input1.removeSuffix("@@") // @@Aila Kaya
    input1.removeSurrounding("@@") // Aila Kaya

    if ("a" < "b") println("a is less than b")
    if ("a" > "b") println("a is greater than b")

    val input2 = "QuiCk BrOwN fOx"
    println(input2.lowercase()) // quick brown fox
    println(input2.uppercase()) // QUICK BROWN FOX
    input2.equals("quick brown fox", ignoreCase = true) // true

    val split = "a; b; c; d; e".split("; ")
    println(split) // [a, b, c, d, e]

    val lineByline = """
        Well this is crazy
        I'm out of my mind
        So split me maybe?
    """.trimIndent()
    println(lineByline.lines())  // [Well this is crazy, I'm out of my mind, So split me maybe?]








}


