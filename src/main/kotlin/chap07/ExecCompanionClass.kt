package chap07

class OutterClass {

    companion object CompanionObjectClass {
        var data: Int = 0
        fun someFun() {

        }
    }

    fun some() {
        CompanionObjectClass.data = 10
        CompanionObjectClass.someFun()

        data = 20
        someFun()
    }
}

fun main() {
    OutterClass.someFun() //이런식의 접근도 가능하다, 멤버변수도 마찬가지, Outter클래스의 static과 같이 취급됨
}