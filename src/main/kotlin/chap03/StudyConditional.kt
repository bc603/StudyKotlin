package chap03

class StudyConditional {

    //Conditionnal Expression
    // if는 표현식 사용가능, 단 else 문이 꼭 정의되어야함
    // 여러 라인이 작성되는 경우 if 표현식에 의한 데이터는 맨 마지막 라인

    // when expression

    fun some(): Int {
        return 24
    }

}

fun main(args: Array<String>) {
    val a = 10
    val result = if (a > 10) "hello" else "world"

    val result3 = if (a > 10) "hello" else if (a < 5) "good" else "kotlin"
    println(result3)

    val data1 = "hello"
    when(data1) {
        "hello" -> println("is hello")
        "world" -> println("is world")
        else -> println("is else")
    }

    val data2 = 24
    var study = StudyConditional()
    when(data2) {
        10, 20 -> println("is 10, 20")
        14, 15 -> println("is 14, 15")
        30 + 30 -> println("is 60")
        study.some() -> println("is 24")
        else -> println("is nothing")

        // 범위로 지정할수 있다 20..30 -> println("is 20 ~ 30")
    }

    //표현식으로 이용가능
    val data6 = 3
    val result6 = when(data6) {
        1 -> "1..."
        2 -> "2..."
        else -> {
            println("else...")
            "hello"
        }
    }

    println("resulr6 : ${result6}")
}