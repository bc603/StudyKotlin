package chap08
/*
람다함수, 고차함수, 기초 고차함수
 */

// 람다 함수
// Anonymouse Functions(익명함수)를 지칭
// 매개변서 -> 함수내용 의 형식으로 표시
// 람다함수는 {}에 감싸 표현
// 매개변수 타입은 선언되어 있어야 하며, 추론이가능한 경우에는 생략 가능
// 함수의 리턴값은 함수 내용의 마지막 표현식

class StudyFunctional {

    val sum1 = {x1: Int, x2: Int -> x1 + x2} //람다표현
}

fun sum(x1:Int, x2:Int): Int {
    return x1 + x2
}