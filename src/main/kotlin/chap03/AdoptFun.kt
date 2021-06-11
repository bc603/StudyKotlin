package chap03

fun main() {

    fun myfun(arg1: Int, arg2: Int = 10) = println("arg1 ${arg1} ${arg2}")

    myfun(10)


    fun myfun2(arg1: Int, vararg arg2: Int) {

        //arg2는 단순한 배열

    }

    myfun2(10, 20, 30, 40, 50)

    // Conditinal Expression - if  - else의 구조여야 한다.
    var arg = 10
    val result = if ( arg > 10 ) {
        10
    } else {
        20
    }

    println("result : ${result}")

    for(i in 10 downTo 1 step 2) {
        println("i : ${i}")
    }

    val map = mapOf<String, String>("one" to "hello", "two" to "kotlin")

    for (item in map) {
        println(" ${item.key} ${item.value}")
    }
}