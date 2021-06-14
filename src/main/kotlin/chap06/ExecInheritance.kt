package chap06

open class ExecInheritance(no: Int) { //open
    open fun some() { //open

    }
}

class Inheri(no: Int): ExecInheritance(no) { //매개변수만
    override fun some() {

    }
}