package com.example.myapplication.안드로이드_UI

// 18. Class

// OOP -> Object Oriented Programming (객체지향 프로그래밍)
// 객체란 뭘까?
// - 이름이 있는 모든 것

// 절차지향 프로그래밍 문제 해결 방법
// - 코드를 위에서부터 아래로 실행을 하면 문제가 해결된다

// 객체지향 프로그래밍 문제 해결 방법
// - 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다
// - 선수, 심판, 경기장, 관중 -> 축구 게임

// 객체를 만드는 방법
// - 설명서가 있어야 한다
fun main(array: Array<String>) {

    // 클래스(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")
    val bigCar = Car("v8 engine", "big")
    // 우리가 만든 클래스(설명서)는 자료형이 된다
    val bigCar1: Car = Car("v8 engine", "big")
    val superCar: SuperCar = SuperCar("good engine", "big", "white")

    var number: Int = 10
    var number1 = 20

    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    val runableCar: RunableCar = RunableCar("simple engine", "short body")
    // RunableCar.ride() -> 불가능
    runableCar.drive()
    runableCar.navi("부산")
    runableCar.ride()

    // 인스턴스의 멤버 변수에 접근하는 방법
    val runableCar2: RunableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.body)
    println(runableCar2.engine)

    // 오버로딩
    println()
    val testClass = TestClass()
    testClass.test(1)
    testClass.test(1,2)
}



// 클래스(설명서) 만드는 방법(1)
class Car(var engine: String, var body: String) {
}

// 클래스(설명서) 만드는 방법(2)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }

}

// 클래스(설명서) 만드는 방법(3) - 1번 방법의 확장
class Car1 constructor(engine: String, body: String) {
    var door: String = ""

    // 생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법(4) -> 2번 방법의 확장
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunableCar(engine: String, body: String) {
    fun ride() {
        println("탑승하였습니다")
    }

    fun drive() {
        println("달립니다")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }
}

class RunableCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    init { // 클래스가 인스턴스화될때 가장 먼저 호출된다
        println("RunableCar2가 만들어졌습니다")
        // 초기세팅을 할 때 유용하다
    }

    fun ride() {
        println("탑승하였습니다")
    }

    fun drive() {
        println("달립니다")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }
}

// 오버로딩
class TestClass() {

    // 함수가 받는 파라미터 개수가 다르다면, 같은 이름 함수 두개를 만들 수 있다.
    // -> 이름이 같지만 받는 파라미터가 다른 함수 : 오버로딩
    fun test(a: Int) {
        println("up")
    }

    fun test(a: Int, b: Int) {
        println("down")
    }
}

// 연습문제
// 1) 사칙 연산을 수행할 수 있는 클래스

// 2) 은행 계좌 만들기
//    - 계좌 생성 기능(이름, 생년월일)
//    - 잔고를 확인하는 기능
//    - 출금 기능
//    - 예금 기능

// 3) TV 클래스
//    - on/off 기능
//    - 채널을 돌리는 기능
//    - 초기 채널은 (S사, M사, K사 3개)