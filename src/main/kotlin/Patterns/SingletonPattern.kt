package Patterns

object ProfileKotlin{
    var nickName: String? = null
    var counter: Int = 0
}

fun main() {
    ProfileKotlin.nickName = "Must"
    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++
    println(ProfileKotlin.counter)
}
