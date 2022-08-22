package workarea

fun isPalindrome(s: String): Boolean =
    s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
    isPalindrome(s.lowercase())

fun isPalIgnoreSpecial(s: String): Boolean {
    var str = ""
    for (i in s){
        if (i in 'a'..'z' || i in 'A'..'Z') {
            str += i
        }
    }
    return isPalIgnoreCase(str)
}

fun main() {
    println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}