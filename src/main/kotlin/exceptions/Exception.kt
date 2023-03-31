@file:Suppress("UNREACHABLE_CODE")

package exceptions

fun main() {

    /*
     * Kotlin'de butun exception classlari Throwable classindan turemektedir.
     * Her exception'in bir messsage, cause ve stacktrace'i vardir.
     * Bir exception firlatmak icin throw anahtar kelimesi kullanilir.
     *
     */
    throw Exception("This is an exception")
    // Bir exception firlatildiginda, program calismayi durdurur ve stacktrace'i ekrana basar.

    //throw expression olarak kullanilabilir.
    val expressionThrow = throw Exception("This is an exception")

    /*
    expressionThrow degiskeni, Nothing tipinde bir deger dondurur.
    Throw tipi Nothing tipindedir.
    Nothing tipi, herhangi bir deger dondurmeyen bir tipdir.
    asagidaki gibi Nothing tipi bir fonksiyona geri donus degeri olarak verilebilir.
     * */
    fun nothing(): Nothing {
        throw Exception("This is an exception")
    }



    //try-catch blogu ile exception yakalanabilir.
    try {
        // some code
    } catch (e: Exception) {
        // handler
    } finally {
        // optional finally block
    }
    /*
    Sifir veya daha fazla catch blogu olabilir.
    catch blogu, exception tipine gore calisir.
    en az bir catch blogu olmalidir.
    finally blogu, exception olusup olusmadigi farketmeksizin calisir.
    finally atlanabilir
    birden fazla catch blogu olabilir. farkli exception tipleri icin.
    catch blogu, exception tipine gore calisir.
    */


    // try-catch blogu, bir deger dondurur. Bu yuzden expression olarak kullanilabilir.
    val result = try {
        // some code
    } catch (e: Exception) {
        // handler
    } finally {
        // optional finally block
    }
    /*
    donen deger catch veya try blogundaki son degerdir.
    finally blogu, donen degeri degistirmez.

     */


}