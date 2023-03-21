package classes

/**
 * asagidaki hersey junior is gorusmesi sorularidir.!! top level? visibility modifier lar? java kotlin fark? encapsulation?
 * kotlinde visibility modifierlar ; protected private public internal 4 farkli cesit vardir;
 * private kendi class i disinda erisemeyiz
 * public heryerden erisilir
 * protected kendi classinda ve  miras alan classlar kullanabilir. Haricinde kullanilamaz.
 * internal sadece kendi modulu icinde childlarda kutuphane icinde erisilebilir. Modul disinda erisilemez.
 * encapsulation nedir? bir class in uye degisken private tutup bu degiskene erisilecek fonksiyonlari publicde tutmaktir.
 * javada internal yok ve kotlin protected kullanimi farkli; yaptigimiz top level tanimlamalara protected kullanmayiz cunku miras alinamaz child classi hicbir zaman olamayacak
 * top level ; dosyanin herhangi bir yerinde degisken function,variable,class, interface, object tanimlayabiliriz. illa mainde olmaya gerek yok.
 */

//protected val m = "mu"  toplevel tanimlamalarda protected kullanamayiz.
val m = "mu" //top level tanimlama butun projeden erisilebilir
private val z = "zu" // sadece bu dosya icinde heryerden erisilir top-level

 open class Foo(){
    private val name = "must" // sadece kendi class icinde erisilir

    public var surName = "unl" // heryerde erisilebilir

    protected val email = "cccx.2@gmail.com" // child class larda public , harici classlarda private

    internal val age = 25 // module icinde public - harici modullerde private

    fun printName(){
        println("Hello $name $surName $email $age")
    }

    fun getName(): String { // private olan name in public fuction ile disari acilmasi
        return name
    }


     private var shortLine = 0
     private var longLine = 0

    fun calculateArea(shortLine: Int, longLine: Int): Int {
        this.shortLine = shortLine
        this.longLine = longLine
        return this.shortLine * this.longLine
    }

 }

class Boo private constructor(): Foo(){  //primary const. private yapabiliriz. constructor keywordunu kullanmamiz gereklidir.
    init {
        surName
        //name private old icin erisemeyiz.
        age
        email
    }
}

fun main() {
    val foo = Foo()
    //foo.name = "aaa" erisemeyiz cunku private
    foo.surName = "asd" //public
    // foo.email = "adad" erisemeyiz protected
    foo.getName() // private olan name degiskenine publlic olan getName() function ile eristik. getter

    foo.calculateArea(2,5)
    //foo.shortLine = 23 seklinde degistiremez cunku private tanimladik.

}