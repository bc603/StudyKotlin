package chap02

val data1: Int = 10
var data2: Int = 10

class TestVar {

    val data3: Int = 10
    var data4: Int = 10

    fun myFun() {
        val data5: Int
        var data6: Int

        //이용하기전에 초기화
        data5 = 10
        data6 = 5

        val result = data5 + data6
    }
}

