package `1 Getting Started`

import kotlin.math.pow


/**
 * Bir kotlin uygulamasinin entry point'i main fonksiyonudur.
 * Kotlin dilinde main fonksiyonunu herhangi bir sinif icinde yazmaniza gerek yoktur.
 * Main fonksiyonu ozel bir fonksiyondur birden fazla main fonksiyonu yazamazsiniz.
 * main fonksiyonu argumanlarda alir ama temelde gerek yoktur.
 */
fun main() {

    /**
     * print fonksiyonu verilen argumani terminale yazdirir,
     * println fonksiyonu verilen argumani terminale yazdirip alt satira gecer.
     */
    print("Hello Kotlin")
    println("Hello Kotlin")

    /**
     * kotlin dilini kurarken beraberinde default library ile gelir.
     * Bu libraryleri kod icinde kullanabiliriz.
     */
    3.14.pow(2.1)
}


/**
 * Comment turleri
 *  //  single line commentler yaziliri
 *  /*
 *  multiple line commentler
 *  yazilabilir
 *  */
 *
 *  /**
 *  documentation commentleridir
 *  */
 *
 *  TODO() kodda daha sonra yapilmasi planlanan isler icin yazilir
 *  IDE'nin alt toolbarinda TODO menusunde gorunur hale gelirler, yazilan todolari orada gorebiliriz
 *
 */

//single comment area

/*
multiple comment area
 */

/**
 * Documentation comment area         keep document parameter and argument = @param:args
 *
 */

// TODO(deb)  technical debt    code smelling