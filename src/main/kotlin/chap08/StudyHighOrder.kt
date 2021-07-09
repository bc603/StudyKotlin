package chap08

//고차함수 (High-order Function)
//함수의 매개변수로 함수를 전달 받거나 리턴 시킬 수 있는 함수를 지칭

class StudyHighOrder {




}

fun normalFun(x1:Int, x2:Int): Int {
    return x1 + x2
}

fun hoFun(x1:Int, argFun:(Int) -> Int) {
    val result = argFun(10)
    print("x1 : $x1, someFune1: $result")
}

fun main() {
    hoFun(10, { x -> x * x})
}