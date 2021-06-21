package chap07

open class SuperClass {
    fun some() { }
}

class Outter {
    val obj = object {
        val data1:Int = 20

        fun someObject() { }
    }

    val obj2 = object:SuperClass() {
        fun some3() {

        }
    }

    object NamedObjectClass {
        fun sum4() {

        }
    }
}

fun main() {
    Outter.NamedObjectClass.sum4()
}