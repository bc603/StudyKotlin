package chap04

class StudyNullSafety {

    // Null이란 프로그램에서 값이 아무것도 대입되지 않은 상태
    // NullSafety란 Null에 다양한 처리를 도와줌으로써 Null에 의한 NPE이 발생하지 않는 프로그램을 작성할 수 있게 도와주는 개념

    // Null허용과 Null불터 타입으로 구분

}

fun main() {
    var data1: String = "kotlin"
    var data2: String? = null

    //data1 = null //널이 허용되지 않음
    // ?(Null체크 연산자) : 객체가 null이 아니면 멈버에 접근하고, null이면 멤버 접근없이 null을 리턴하는 연산자

    var length2: Int? = data2?.length
    println(length2)

    data2 = null
    length2 = data2?.length
    println(length2)

    // 객체연결구조에도 사용가능
}