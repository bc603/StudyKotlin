package chap03

class StudyFun {

    // 매개변수는 var, val을 선언할 수 없고 매개변수는 기본으로 val이 적용
    fun some(a: Int, b: Int): Int {
        return a + b
    }

    fun someUnit(a: Int, b: Int): Unit {
        //return a + b
    }

    // 함수 내 함수 선언 가능
    fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    fun sumInner(a: Int, b:Int): Int {
        var sum = 0
        fun calSum() {
            for(i in a..b) {
                sum += i
            }
        }
        calSum()
        return sum
    }

    //Single Expression
    fun somSingle(a: Int, b: Int): Int = a + b

    // Named argument
    fun sayHello(name: String = "Good", no: Int) {
        println("Hello : ${name} ..${no}")
    }

    // 가변인수
    fun <T> varargsFun(a1: Int, vararg array: T) { //알아서 가변인수는 배열취급이 됨
        for(a in array) {
            println(a)
        }

    }
}

fun main(args: Array<String>) {
    //sayHello(no=10)

    var study = StudyFun()
    study.sayHello(no=10)

    study.varargsFun(10, "Hello", "Kotlin")
}