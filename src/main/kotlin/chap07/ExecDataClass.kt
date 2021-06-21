package chap07

data class DataUser(val name: String, val age: Int) {

}

fun main() {
    val datauser = DataUser("Good", 10)
    val datauser2 = DataUser("Good", 10)

    println(datauser.equals(datauser2))
    println("${datauser}")
    println("${datauser2.toString()}")

    val (name, age) = datauser
    println("${name}, ${age}")
}