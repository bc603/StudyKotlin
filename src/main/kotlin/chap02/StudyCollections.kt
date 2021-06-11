package chap02

class StudyCollections {
}

fun main(ars: Array<String>) {
    var array = arrayOf(1, "Kkang", true)
    /*array[0] = 12
    array[1] = "Wrold"
    array[2] = false*/

    //array[0] = 2 as Nothing //class java.lang.Integer cannot be cast to class java.lang.Void

    println("${array[0]}...${array[1]}..${array[2]}")
    println("${array.size} ... ${array.get(0)}")

    var arrayInt = arrayOf<Int>(10, 20, 30)
    println("${arrayInt[2]}")

    var array3 = Array(3, {i -> i*5})
    println("${array3.size}... ${array3.get(0)} .. ${array3.get(2)}")

    // List, Set, Map -> mutable과 immutable로 구분
    // kotlin.collenction.List 인터페이스는 immutable
    // kotlin.collection.MutableList 인터페이스는 mutable size, get외에 add(), set() 제공
    // List, Set, Map 모두 동일

    Array(3, { i -> i + 5})

    val arrayOfNull = arrayOfNulls<Int>(3) // 사이즈만 있고 값들은 널
    val array5 = Array(3, {0})
    var array6 = IntArray(2)



}