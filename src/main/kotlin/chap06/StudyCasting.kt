package chap06

open class StudyCasting {

    // 기초 데이터 타입의 캐스팅은 자동 형변혀이 안됨
    // -> 함수에 의해서만 형변형이 가능
    val data1: Int = 10
    val data2: Double = data1.toDouble()

    // 상속관계에서는 스마트 캐스팅(자동 형변형)

}

class Study : StudyCasting() {

}

fun main() {
    var objp: StudyCasting = StudyCasting()
    var objc: Study = objp as Study // as를 이용한 캐스팅은 상속관계에 의한 객체의 명시적 캐스팅
                                    // 상위 타입의 객체를 하위 타입으로 캐스팅 하고자 할 때 사용
    var objtp_test: StudyCasting = objc

}