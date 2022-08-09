package workarea

fun main() {
    var n = 6
    for (i in 1..n) {
        repeat(n - i) {
            print(' ')
        }
        repeat(2 * i - 1) {
            print('#')
        }
        println()
    }
}

/* Output:
   #
  ###
 #####
#######
*/