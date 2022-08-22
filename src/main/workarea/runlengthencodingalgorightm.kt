package workarea

//run length encoding algorighm
fun StringChallenge(str: String): String{
    var ctr = 0
    var output = ""
    var datas = str[0]

    for (i in str) {
        if(i == datas) {
            ctr +=1
        } else {
            output += "$ctr$datas"
            datas = i
            ctr = 1
        }
    }
    output += "$ctr$datas"
    return output
}

fun main() {
    println(StringChallenge("zzzaaappeefffffffmfgg"))
}