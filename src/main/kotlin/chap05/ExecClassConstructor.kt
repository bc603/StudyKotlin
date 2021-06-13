package chap05

class ExecClassConstructor(var id: String, val name: String) { //생성자의 매개변수를 var, val로 만들면 멤버변수가 된다.
    init {
        println("init ${id} ${name}")
    }

    constructor(cid: String, cname: String, cnum: Int) : this(cid, cname) {
        println(" constructor ${cid} ${cname} ${cnum}")
    }
    var name2: String = "kotlin"
    fun some() {
        println("some fun ${id} ${name}")
    }
}

fun main() {
    val obj = ExecClassConstructor("132752", "famocool", 10)
    obj.some()
}