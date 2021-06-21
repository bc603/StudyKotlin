package chap07

class Out {
    object NestedClass {
        val no : Int = 0
        fun myFun() { println("우왕:" + no ) }
    }

    companion object NestedClass2 {
        val no : Int = 1
        fun myFun() { println("우왕:" + no ) }
    }
}

fun main() {
    val obj = Out()
    //obj.NestedClass.no // Error

    Out.NestedClass.no
    Out.NestedClass.myFun()

    Out.no
    Out.myFun()
}