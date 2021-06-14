package chap06

open class StudyInheritance { //상속이 가능하도록 함

    // 상속
    // 코틀린에서는 클래스는 기본이 final로 선언되어 상속 관계로 하위 클래스를 만들수 없음
    // 상속이 가능하게 하려면 클래스 선언 부분에 open 예약어로 선언해야함
}

class StudyHard: StudyInheritance() { // 상속관계의 표현은 클래스 선언부분에 콜론(:)을 이용하며 콜론 오른쪽에 상위 클래스 생성자 호출구문을 명시
                                    // 매개변수도 가능

}