package chap04

class ExecNullSafety
{

}

fun main() {
    var data1: String? = "bts" //= null //"mang"

    var data2 = data1?.toUpperCase()

    println(" -> ${data2}")

    val result2 = data1?.run { // Null이 아니면 실행
        data1 = "good korea"
        println(" not null")
    } ?: run { // Null이면 실행
        data2 = "peace korea"
        println(" is null")
    }

    println(" --> ${result2} ${data2}")
}