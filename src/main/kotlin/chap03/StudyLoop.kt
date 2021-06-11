package chap03

class StudyLoop {
}

fun main(args: Array<String>) {

    // 범위연산자
    var sum: Int = 0
    for(i in 1..10) {
        sum += i
    }

    println("sum ${sum}")


    val list = listOf("Hello", "kotlin", "!!!")
    var sb = StringBuffer()
    for (str in list) {
        sb.append(str)
    }
    println(sb.toString());

    // index값을 획득하고 싶다면 indices 를 이용
    for (i in list.indices) {
        println(list[i])
    }

    // index와 value를 같이 가져오려면 withIndex()
    for ((index, value) in list.withIndex()) {
        //println("the element at ${index} is ${value}")
        println("the element at $index is $value") //윗 라인과 동일
    }

    for(i in 1..100) { }

    for(i in 1 until 100) { } // 100은 제외

    for(x in 2..10 step 2) { } //2씩 증가

    for(x in 10 downTo 1) {  println(x)} //숫자감소
}