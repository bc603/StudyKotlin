package chap06

open class StudyOverride {

    // 함수를 선언하면 기본으로 final이 적용
    // 함수 오버라이드를 허용하려면 open 예약어로 명시
    // override 예약어를 이용하여 이 함수는 상위 함수를 재정의한것임을 명시적으로 선언

    open fun println() {

    }
}


class Override : StudyOverride() {
    override fun println() {
        // 오버라이드된 상위 클래스의 멤버에 접근하고자 하는 경우에는 super예약어를 사용
        super.println()
    }
}
