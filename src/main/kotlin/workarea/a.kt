fun main() {

 val inff = inf()


    print(inff musti "image")

}

class inf {
    infix fun musti(str: String) {
        println(str)
    }
    fun aaa(image: String) {
        this musti image
        this musti "infix"
        musti(image)
    }
}