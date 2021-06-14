package chap06

abstract class ExecAbstract {
    abstract val data: String // lateint 하던지 abstract 하던지

    abstract fun some2() //미완성 함수

    open fun some() {

    }
}

interface myInterface { //interface는 굳이 abstract를 안붙인다
    val data1: String

    fun some3() {
    }
}

class Sub : ExecAbstract(), myInterface {
    override val data: String = "AAA"

    override fun some2() {}

    override val data1: String = "BBB"


}

