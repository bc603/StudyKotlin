package chap07

interface SomeInterface {
    fun interfaceFum()
}

open class SampleObjectClass {
    fun someClassFun() {
        println("someClassFun")
    }
}

class SampleOuter {
    val test:SampleObjectClass = object : SampleObjectClass(), SomeInterface {
        override fun interfaceFum() {
            println("object interfaceFum()")
        }

    }
}

fun main() {
    val obj = SampleOuter()
    obj.test.someClassFun()
    //obj.test.interfaceFum() //이건 왜 안될까?


}