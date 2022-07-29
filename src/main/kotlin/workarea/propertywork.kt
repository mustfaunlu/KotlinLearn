package workarea

class Client {
    val name = "Unknown"
        get() {
            println("field donduruldu")
            return field
        }
}

class Person {
    var name = "Unknown"
    var age = 16
    val info: String
        get() = "name = $name, age = $age"
}



fun main() {
    var cli = Client()
    val name = cli.name
    println(name)


    val person = Person()
    println(person.info)
    person.name = "ali"
    person.age = 32
    println(person.info)


    val bottle = Bottle()
    println(bottle.age) //15
    bottle.age = 33 //age degisti eski degeri 15, yeni degeri 33
    println(bottle.age) // 33


    bottle.year = -1 //negatif olamaz
    println(bottle.year) //18



}

class Bottle {
    var name = "Unknown"
        set(value) {
            field = value
        }
    var age = 15
        set(value) {
            println("age degisti eski degeri $field, yeni degeri $value")
            field = value
        }

    var year = 18
        set(value) {
            val defaultAge = 18
            field = if (value < 0) {
                println("negatif olamaz")
                defaultAge
            } else {
                value
            }

        }
}