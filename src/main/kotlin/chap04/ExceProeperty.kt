package chap04

class ExceProeperty {

    var id: Int = 0
        set(value) {
            if(value<10)
                field = 100
            else
                field = value
        }
    var name: String? = null
        get() {
            return field?.toUpperCase()
        }
}

fun main() {
    var obj = ExceProeperty()
    obj.id = 1
    obj.name = "Famo"

    println( " ${obj.id} ${obj.name}")
}