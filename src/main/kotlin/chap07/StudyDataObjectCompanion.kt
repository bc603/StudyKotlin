package chap07

class StudyDataObjectCompanion {

    // VO(Value-Object) 클래스
    // data 예약어로 선언되는 클래스
    // 주생서자가 선언되어야 하며 주생성자의 매개변수는 최소 하나 이상이 선언되어있어야함
    // 모든 주생성자의 매개변수는 var혹은 val로 선언되어야 함
    // Data클래스는 abstract, open, sealed, inner등의 예약어를 추가할수 없음
}

data class User(val name:String, val age: Int)

// 데이터클래스의 함수
// equals() 객체의 데이터가 같은지에 대한 비교
// 데이타 유형이 다르면 값이 같아도 다르다
// equals() 함수에 의한 값의 비교는 주 생성자에 선언된 프로퍼티 값만을 비교 -> 멤버변수는 비교를 하지 않는다

// toString()
// 데이터 클래스의 데이타를 문자열로 변환하는 함수

// componentN() 클래스 프로퍼티 값을 획득
// user.component1(), user.component2() // 각 프로퍼티에 할당된 값을 리턴

//오브젝트 클래스
//object {} 형태로 클래스를 선언
//클래스명이 없지민 선언과 동시에 객체가 생성
//object 클래스는 생성자를 추가할 수 없음
val obj1 = object {
    var no1:Int = 10
    fun myFun() {

    }
}

class Outer{
    val obj2 = object {
        var no2:Int = 20
    }
}

// object 클래스를 만들 때 다른 클래스를 상속 받거나 인터페이스를 구현

// val obj = object { }
// object 클래스명{ } //클래스명과 동일한 이르의 객체까지 같이 생성


// Companion
// object 클래스의 일종
// object 클래스의 멤버를 Outer 클래스의 static 멤버처럼 이용하고자 할때 사용

fun main() {
    val user = User(name="God", age=30)
    val (name, age) = user

    print("name ${name} ${age})")
}