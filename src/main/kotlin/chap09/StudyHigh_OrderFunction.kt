package chap09

//고차함수
//함수의 매개변수로 함수를 전달 받거나 리털 시킬수 있는 함수를 지칭
class StudyHigh_OrderFunction {
}

fun hoFun(x1:Int, argFun:(Int) -> Int) {
    val result = argFun(10)
    println("x1 : $x1, somefune1 : $result")
}

fun hoFunNoParam(argFun:(Int) -> Int) {
    val result = argFun(20)
    println("2. someFun1 : $result")
}

fun hoFun_1(no:Int, argFun1:(Int) -> Int, argFun2:(Int) -> Boolean) {
}

//함수타입 디폴트 값 이용
fun hoFun2(
    x1:Int,
    argFun1:(Int) -> Int,
    argFun2:(Int) -> Boolean = {x:Int -> x > 10}
) {
    val result = argFun1(x1)
    println("result : ${argFun2(result)}")
}

// 리턴값도 함수형으로
fun hoFun5(str:String): (x1:Int, x2:Int) -> Int {
    when(str) {
        "+" -> return {x1, x2 -> x1 - x2}
        "*" -> return {x1, x2 -> x1 * x2}
        "/" -> return {x1, x2 -> x1 / x2}
        else -> return {x1, x2 -> x1 + x2}
    }
}

fun main() {
    hoFun(10, {x -> x * x})

    // 함수 타입의 매개변수 대입
    // 함수 호출 시 () 생략가능
    hoFunNoParam({x -> x * 3})
    hoFunNoParam{x -> x * 3}

    hoFun_1(10, {it * it}, {it > 10})
    hoFun_1(20, {it * it}){it > 10}
    //hoFun_1(10){it * it} {it > 10} //Error : 맨 마지막 함수형 파라미터만 괄호밖으로 뺄수 있다

    hoFun2(4, {x:Int -> x + x}, {x:Int -> x > 5})
    hoFun2(4, {x:Int -> x * 2}) //함수타입 매개변수에 디폴트 구문 설정가능

    val resultFun5 = hoFun5("d")
    println("result : ${resultFun5(10, 5)}")
}