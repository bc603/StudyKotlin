package chap04

class ExecLateInit {

    val data1: Int
    var data2: String
    init {
        data1 = 10
        data2 = "Cool"
    }

    lateinit var data3: String

    val data4: Int by lazy {
        println(" lazy ")
        10
    }
}

fun main() {
    val late = ExecLateInit()
    late.data3 = "korail"
    println(late.data3)
    println(late.data4)

}