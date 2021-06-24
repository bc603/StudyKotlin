package chap09

fun main() {
    class User {
        var name = "kia"
        fun sayHello() {
            println("say hello")
        }
    }

    var obj = User()
    obj.run {
        name = "lee"
        sayHello()
    }
}