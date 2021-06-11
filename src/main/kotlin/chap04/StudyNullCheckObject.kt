package chap04

class StudyNullCheckObject {

    val city: String? = "Daejeon"
}

class User {
    var address: StudyNullCheckObject? = StudyNullCheckObject()
}

fun main() {
    var user: User? = User()
    //user = null
    user?.address = null

    println(user?.address?.city)

    // 앨비스 연산자 ?:
    var data: String? = "kotlin"
    var length: Int = if(data!=null) {
        data.length
    } else {
        -1
    }

    data = null

    length = data?.length ?: -1 // null이면 실행

    println(length)

    data ?: println("data is null")

    // 예외발생 연산자 !!
    var exep: String? = "Cool"

    println(exep!!.length)

    exep = null

    //println(exep!!.length) //이게 왜 에러가 나지?
}