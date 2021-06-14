package chap06

// 인터페이스를 추상 함수를 선언함을 주 목적으로 사용
// 인터페이스는 객체 생성이 불가
// 클래스에서 인터페이스를 구현해 이용
interface StudyInterface {
    var data1: String
    fun myFun1() {

    }
    fun myFun2()
}

interface StudyInterface2 {
    fun myFun3()
}

class MyClass : StudyInterface, StudyInterface2 {
    override var data1: String = "Hello Kotlin"
    override fun myFun2() {
        println("myFun2()")
    }

    override fun myFun3() {
        println("myFun3()")
    }
}