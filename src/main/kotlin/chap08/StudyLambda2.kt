package chap08

class StudyLambda2 {

    //매개변수가 없는 람다의 함수 정의
    val sum2 = { -> 10 + 20}

    //매개변수가 있는 람다의 함수 정의
    val sum3 = { 10 + 20 }

    // 함수 내용이 여러 문장으로 된 경우의 리턴 값
    val sum4 = {x1:Int, x2:Int ->
        println("call sum4()")
        x1 + x2 //람다 실행구문의 맨마지막이 리턴값(명료성의 문제로 return은 사용하지 않음)
    }

    // 함수 타입
    val lambdaFun:(Int) -> Int = { x:Int -> x * 10}
    //            ------------   -------------------
    //                 함수타입            함수대입

    //TYpealias를 이용한 타입 정의
    val myFun: MyType = { it > 10 }

    //매개변수 타입 생략
    //val lambdaFun1 = { x -> x * 10 } //error
    val lambdaFun2:(Int) -> Int = { x -> x + 10}

    //it을 이용한 매개변수 이용
    //매개변수가 하나인 경우에는 함수 내용에서 it으로 매개변수를 지칭
    val lambdaFun3:(Int) -> Int = { x -> x + 10}
    val lambdaFun4:(Int) -> Int = { it + 10} //매개변수의 타입이 지정된 경우에만 사용할수 있음
}

//TYpealias를 이용한 타입 정의
typealias MyType = (Int) -> Boolean

fun myFun(x1:Int, x2:Int): Boolean {
    return x1 > x2
}

