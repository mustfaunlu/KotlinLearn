package Patterns


interface User {
    fun update(price: Int)
}

class Bitcoin {

    val users = ArrayList<User>()

    var price: Int? = null
        set(value) {
            field = value
            notifyObservers()
        }

    private fun notifyObservers() {
        for (t in users) {
            price?.let { t.update(it) }
        }
    }

    fun subscribe(user: User) {
        users.add(user)
    }

    fun unsubscribe(user: User) {
        users.remove(user)
    }
}

class Trader : User {

    private var investmentFactor = 10
    override fun update(price: Int) {
        println("I am a trader, and I will invest ${price * investmentFactor}")
    }
}

class Student : User {

    private var investmentFactor = 5
    override fun update(price: Int) {
        println("I am a student, and I will invest ${price * investmentFactor}")
    }
}

class Bot : User {

    private var investmentFactor = 3
    override fun update(price: Int) {
        println("I am a bot, and I will invest ${price * investmentFactor}")
    }
}

class Investor : User {

    private var investmentFactor = 1
    override fun update(price: Int) {
        println("I am a investor, and I will invest ${price * investmentFactor}")
    }
}

fun main() {
    val bitcoin = Bitcoin()
    val trader = Trader()
    val bot = Bot()
    val student = Student()
    val investor = Investor()

    bitcoin.subscribe(trader)
    bitcoin.subscribe(bot)
    bitcoin.subscribe(student)
    bitcoin.subscribe(investor)
    bitcoin.price = 10

    bitcoin.unsubscribe(trader)
    bitcoin.price = 15


}