package workarea

fun main() {
    var n = 6
    for (i in 1..n) {
        repeat(n - i) {
            print(' ')
        }
        repeat(2 * i - 1) {
            print('*')
        }
        println()
    }

    for (i in 1..n){
        for (j in 1..n-i) {
            print(" ")
        }
        for (k in 1 until 2*i) {
            print("#")
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