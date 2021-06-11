package chap04

// Top-level 변수, 클래스의 멤버변수를 property라 함
// getter, setter가 자동으로 내정된 함수
class StudyProperty {

    //lateinit  lazy    nullsafety

    var name:String = "Huhu"
    var age:Int = 10
        get() = field //field는 예약어

    //set, get 커스터마이징
    var greeting:String = "Hello"
    set(value) {
            field = "Hello" + value
    }
    get() = field.toUpperCase();


}

fun main(args: Array<String>) {
    var study = StudyProperty()
    study.greeting = "Good"
    println(study.greeting);
}