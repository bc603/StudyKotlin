package chap09

class ExecHighOrder {
}

fun main() {
    fun myFilter(list:List<Int>, arg: (Int) -> Boolean): List<Int> {
        var resultList = mutableListOf<Int>()
        val iterator = list.iterator()
        while(iterator.hasNext()) {
            val no = iterator.next()
            val result = arg(no)
            if (result) {
                resultList.add(no)
            }
        }

        return resultList
    }

    println(myFilter(listOf<Int>(10, 20, 30, 40, 50), {it >= 30}))
}