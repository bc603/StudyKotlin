package chap05

// 클래스 선언 - class 예약어
// 클래스의 몸체가 없다면 { }는 생략 가능

// 클래스는 멤버 변수, 함수, 생성자, 다른 클래스로 구성
class StudyClassContructor constructor() {
    var myVariable = 10
    //constructor()
    fun myFun() {}
    class Inner {

    }

    // 주 생성자
    // 클래스 선언부분에 작성
    // 하나의 클래스에 하나의 주 생성자만 정의 가능
    // 필수 작성 대상은 아니며 보조 생성자가 있다면 작성 안될수도 있음
    // class MyClass1 {}
    // class MyClass1() { }
    // class MyClass1 constructor() {} //위와 아래는 같다

    // 매개변수를 가지는 주 생성자
    // class User constructor(name: String, age:Int) { }
    // class User(name: String, age: Int) {}

    // 생성자 매개변수 기본값 명시
    // class User(name: String = "Hello", age: Int = 10) {}

    // 생성자 초기화 블록
    // init 예약어로 명시, 클래스 바디안에 구현
    // 클래스의 초기화 블록, 클래스 프로터티에서는 접근이 되지만 클래스에 정의된 함수에서는 사용이 불가능

    // 주생성자인 경우에는 val, var을 이용해 매개변수 선언 가능
    // 클래스의 멤버 변수가 된다.
    // class User6(val name:String, val age: Int) { init{} }

    // 보조 생성자는 클래스 바디 영역에 constructor 예약어로 선언하는 생성자
    // 최소한 하나 이상의 생성자는 정의되어 있어야함
    init {
        // 주생성자의 초기화 구문
    }
    constructor(name: String) : this() { //주 생성자가 선언되어 있다면, 보조 생성자는 무조건 주 생성자를 같이 호출해야함!!!!!

    }
    constructor(name: String, age: Int) : this() {

    }
    // 보조 생성자의 매개변수는 var, val로 선언할 수 없음
}

fun main() {
    // 객체생성시 new 연산자를 사용하지 않음
    var obj1 = StudyClassContructor("코틀린") //생성자 호출로 생성 됨
    //println("${obj1}")
}