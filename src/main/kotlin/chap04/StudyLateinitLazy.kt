package chap04

val someData:String by lazy {
    println("someData lazy")
    "hello"
}

class StudyLateinitLazy
{
    //프로퍼티 초기화를 미루기 위해 lateinit 사용
    // var에서만 사용
    // custom gettter/setter를 사용하지 않은 경우에만
    // nullable은 사용불가
    // 기초 타입이 아니어야 한다
    lateinit var lateData: String

    //lazy
    //초기화를 프로터티의 이용시점으로 미룰수 있는 방법
    //lazy는 일종의 실행영역
    // by lazy{}로 선언되어 프로터티의 초기화를 lazy {}에서 진행가능
    // val, 기초타입 사용 가능
}

fun main(args: Array<String>) {
     val study = StudyLateinitLazy()
    study.lateData = "hello"
    println(study.lateData)

    println(" lazy : ${someData}")
}