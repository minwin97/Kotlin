package com.example.myapplication.안드로이드_UI
//01. 변수

// 변수 선언하는 방법
// var/val 변수명(상자) = 값(넣고싶은 것)
// var(variable) : 내 마음대로 원하는 것을 넣을 수 있는 상자
// val(value) : 한 번 넣으면 바꿀 수 없는 상자

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20
fun main(args:Array<String>){
    println(num)
    print(hello)
    print(point)
    print(fix)
    
    num = 100
    hello = "good bye"
    point = 10.4
    
    println(num)
    println(hello)
    println(point)
    println(fix)
    
    // fix = 500 하면 오류가 난다.
}



// 02. 자료형
// 정수형 -> Long > Int > Short > Byte 4가지, 부등호는 표현할 수 있는 범위를 나타냄
// 실수형 -> Double > Float
// 문자 -> Char
// 문자열 -> String
// 논리형(참True/거짓False) -> Boolean

// 변수 선언하는 방법(1)
// Variable/Value 변수명 = 값
// var/val 변수명 = 값
var number = 10

fun main(array:Array<String>){
    number = 20
    // number = 20.5 -> 오류(int형인데 float형을 넣으려고 함)
}

// 변수 선언하는 방법(2)
// var/val 변수 : 자료형 = 값
var number1 : Int = 20
var hello1 : String = "Hello"
var point1 : Double = 3.4

// Variable or Value
// - 1. 변하지는 않는 값이라면 Value
// - 2. 진짜 모르겠다 -> Value (오류를 찾아낼 수 있음)



// 03. 변수, 자료형 실습
var a = 1 + 2 + 3 + 4 + 5 // 연산의 결과값을 변수에 넣어줄 수 있다.
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

// Null : 존재하지 않는다.
// var abc : Int = null -> null을 받을 수 없어 오류가 남
var abc1 : Int? = null // 물음표를 붙여주면 null을 가질 수 있는 자료형이 된다.

var g = a + 3

fun main(array:Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(abc1)
    println(g)
}



// 04. 메소드 A,B (함수, Function)

// 어떤 input을 넣어주면 어떤 output이 나오는 것.

// - 함수를 선언하는 방법
// fun 함수명(변수명 : 타입, 변수명 : 타입 ... ) : 반환형{
//     함수 내용
//     return 반환값
// }
// 함수 만들기
fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int): Unit { // 반환값이 없으면 unit
    val result: Int = first + second
    println(result)
}

//반환값이 없는 함수 만들기2
fun printPlus2(first: Int, second: Int) { // 생략할 수도 있다.
    val result: Int = first + second
    println(result)
}

// 간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second

// 가변인자를 갖는 함수 선언하는 방법 (n개 까지의 인수 받을 수 있음)
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

// cmd + / = 주석처리
// option + cmd + L = 정렬

fun main(array: Array<String>) { // main이라는 함수에서 array라는 인자를 받고, 타입은 ArrayString이다.
    // 함수를 호출하는 방법
    val result = plus(5, 10)
    println(result)

    // 인수를 명시적으로 전달하는 방법
    val result2 = plus(first = 20, second = 30)
    println(result2)
    val result3 = plus(second = 100, first = 10)
    println(result3)

    // 디폴트 값을 갖는 함수 호출하기
    println()
    val result4 = plusFive(10, 20)
    println(result4)
    val result5 = plusFive(10)
    println(result5)

    println()
    printPlus(10, 20) // 반환값이 없는 함수 호출하기

    println()
    val result6 = plusShort(50, 50) // 간단한 함수의 출력
    println(result6)

    println()
    plusMany(1, 2, 3)
}



// 05. 메소드 practice

fun plusThree(first: Int, second: Int, third: Int): Int {
    val result = first + second + third
    // return first + second + third 도 똑같다
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first:Int = 1, second : Int = 1 , third : Int = 1): Int{
    return first * second * third
}

// 내부 함수
// - 함수 안에 함수가 있다
fun showMyPlus(first:Int, second : Int) : Int{
    println(first)
    println(second)
    fun plus(first:Int, second:Int):Int{
        return first+second // 더하는 내부함수
    }
    return plus(first, second)
}
// cmd + 클릭 = 같은 위의 이름을 찾아간다

fun main(array:Array<String>){
    val result = plusThree(1,2,3)
    println(result)
    val result2 = minusThree(10,1,2)
    println(result2)
    val result3 = multiplyThree(2,2,2)
    println(result3)
    val result4 = multiplyThree()
    println(result4)
}



// 06. 연산자(Operator)
// 산술 연산자
// + - * /(몫) %(나머지)

// 대입 연산자
// 좌변 = 우변 (우변 값이 좌변에 들어간다)
// var num = 20

// 복합 대입 연산자
// +=, -=, *=, /=, %=

// 증감 연산자
// ++, --
// a++, a--

// 비교 연산자
// >, >=, <, <=, ==(같으면 True), !=(다르면 True)
// True != True = False

// 논리 연산자
// &&(둘 다 True여야 True), ||(or, 둘 중 하나만 True), !
// True && True = True
// True || False = True
// !True = False



// 07. 연산자 실습
fun main(array:Array<String>){
    // 산술 연산자
    var a = 10 + 1 //
    var b = 10 - 1
    var c = 1 * 9
    var d = 20 / 3  // 6
    var e = 20 % 3  // 2

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    // 대입 연산자
    val f = 5

    // 복합 대입 연산자
    a += 10    // 21
    b -= 10    // -1
    c *= 3
    d /= 4    // 1
    e %= 2    // 0

    // 증감 연산자
    a ++
    b --

    // 비교 연산자
    var g = a > b // True
    var h = a == b // False
    var i = !h // boolean 값에 대해서만 !를 사용할 수 있다.자
    var l = i != h // True
    println()
    println(g)
    println(h)
    println(i)
    
    // 논리 연산자
    val j = h && i // and 연산
    val k = h || i // or 연산자

}



// 08. 제어 흐름 A // control_flow

// if, else, else if
fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    // if, else 사용하는 방법 (1)
    if (a > b) {
        println("a>b")
    } else {
        println("a<b")
    }
    // if, else 사용하는 방법 (2)
    if (a > b) {
        println("a>b")
    }
    // if, else, else if 사용하는 방법
    if (a > b) {
        println("a>b")
    } else if (a < b) {
        println("a<b")
    } else if (a == b) {
        println("a=b")
    }

// 값을 리턴하는 if 사용방법
    val max = if (a > b) { // a = 5, b = 10이므로 else에 해당
        a
    } else {
        b
    }
    println(max)
    // 값을 리턴하는 if 사용방법(2)
    val max1 = if (a > b) a else b
}



// 09. 제어흐름 실습 (if, else, if else)
fun main(args: Array<String>) {
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 110) {
        println("b plus c is 110")
    } else {
        println("b plus c is not 110")
    }

// 엘비스 연산자 (?:) // 코틀린 언어 - null safe 문법적으로 null에 대응할 수 있도록 되어있음.
    val number: Int? = null
    val number2 = number ?: 10 // number가 null인 경우 10을 넣는다.

    val num1: Int = 10
    val num2: Int = 20
    val max = if (num1 > num2) {
        println(num1)
    } else if (num1 == num2) {
        println(num2)
    } else {     // if 문은 항상 모든 경우의 수를 포함해야 한다.
        println(100)
    }
}



// 10. 제어흐름2
// When
fun main(args: Array<String>) {
    val value: Int = 3
    when (value) {
        1 -> {
            println("V is 1")
        }
        2 -> {
            println("V is 2")
        }
        3 -> {
            println("V is 3")
        }
        else -> {
            println("I do not know value")
        }
    }
    // 줄여서 쓰기
    when (value) {
        1 -> println("V is 1")
        2 -> println("V is 2")
        3 -> println("V is 3")
        else -> println("I do not know value")
    }
    // if 문으로 쓰기
    if (value == 1) {
        println("V is 1")
    } else if (value == 2) {
        println("V is 2")
    } else if (value == 3) {
        println("V is 3")
    } else {
        println("I do not know value")
    }
    // if문 줄여쓰기
    if (value == 1) println("V is 1")
    else if (value == 2) println("V is 2")
    else if (value == 3) println("V is 3")
    else println("I do not know value")

    // when문 변수에 입력받기
    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)
}




// 11. 제어흐름2 실습
// 제목 우클릭 -> split vertical
fun main(args: Array<String>) {
    val value: Int? = null
    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null
    // when 구문은 조건으로 갖는 값의 모든 경우에 대응해주는 것이 좋다.
    when (value2) {
        true -> println("")
        false -> println("")
        null -> println("")
    }

    // 값을 리턴하는 when 구문의 경우 반드시 값을 리턴해야 한다.
    val value3 = when (value2) {
        true -> 1
        false -> 3
        else -> 4
    }

    // when의 다양한 조건식(1)
    val value4: Int = 10
    when (value4) {
        is Int -> {    // Int 타입이면,
            println("value4 is Int")
        }
        else -> {
            println("value4 is not Int")
        }
    }
    //when의 다양한 조건식(2)
    val value5: Int = 87
    when (value5) {
        in 60..70 -> { // 60과 70 사이에 있다면
            println(("value is in 60-70"))
        }
        in 70..80 -> {
            println("value is in 70-80")
        }
        in 80..90 -> {
            println("value is in 80-90")
        }

    }

}
