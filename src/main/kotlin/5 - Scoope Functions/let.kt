package `5 - Scoope Functions`

/**
 * let() en sık kullanılan kapsam işlevi olabilir. run() işlevine çok benzer,
 ancak bağlam nesnesini örtük bir alıcı olarak temsil etmek yerine,
 lambda parametresi olarak temsil edilir yani "it" olarak.
 run() yerine let() kullanmak için önceki listeyi yeniden yazalım
 */

fun main() {
    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .let { titleWithoutPrefix -> "'$titleWithoutPrefix'" }
        .uppercase()
    println(newTitle)

    val title2 = "The Robots from Planet X3"
    val newTitle2 = title2
        .removePrefix("The ")
        .let { "'$it'" }
        .uppercase()
    println(newTitle2)
}

//https://typealias.com/start/kotlin-scopes-and-scope-functions/