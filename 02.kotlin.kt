package com.example.studyapplication


// 12. 배열(Array)
// 배열이 필요한 이유
// - 그룹(모음집)이 필요할 때
fun main(array: Array<String>) {
    // 배열을 생성하는 방법(1)
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    // 배열 역시 타입을 적어주면 그 타입만 들어간다.
    println(group1 is Array)
    // 배열을 생성하는 방법(2)
    var number1 = 10
    var group2 = arrayOf(1, 2, 3, 4, 5)

    // Index란
    // -> 순서(번째)
    // [1,2,3,4,5]
    // 0부터 시작
    // index가 0 -> 값이 1

    // 배열의 값을 꺼내는 방법(1)
    val test1 = group1.get(0)
    val test2 = group1.get(4)
    println(test1) // 1
    println(test2) // 5
    // 배열의 값을 꺼내는 방법(@)
    val test3 = group1[0]
    println(test3)

    // 배열의 값을 바꾸는 방법(1)
    group1.set(0, 100) // 0번째 인덱스를 100으로 바꾼다.
    println(group1[0])

    // 배열의 값을 바꾸는 방법(2)
    group1[0] = 200
}



// 13. 배열 실습
fun main(array: Array<String>) {
    val array = arrayOf<Int>(1, 2, 3)

    // get, set
    val number = array.get(0)
    println(number)
    // val number2 = array.get(100) // 100번째 값을 가져오려고 하면 에러 발생

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

//    array.set(100,100) : 100번째 값이 존재하지 않아 에러 발생
    // Array의 bounds - 처음 만들 때 결정된다.

    // Array를 만드는 방법(3) -> 이 방법 추천
    var a1 = intArrayOf(1,2,3)
    var a2 = charArrayOf('b', 'c') // 문자 하나(char->''), 홑따옴표, string->""
    var a3 = doubleArrayOf(1.2, 100.345)
    var a4 = booleanArrayOf(true, false, true)

    // Array를 만드는 방법(4) -> lambda를 활용한 방
    var a5 = Array(10, {0}) // 배열의 사이즈, 인덱스 0부터 9까지 0을 넣는다.법
    var a6 = Array(5, {1;2;3;4;5})
}



// 14. Collection
// list, set, map

fun main(args:Array<String>){
    // Immutable Collection (변경 불가능)
    // List -> 중복을 허용한다
    val numberList = listOf<Int>(1,2,3,3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])

    // Set -> 중복을 허용하지 않는다, 순서가 없다!
    val numberSet = setOf<Int>(1,2,3,3,3) // 1,2,3만 출력
    println(numberSet)
    // index가 없어 get으로 가져올 수 없다
    numberSet.forEach{
        println(it)
    }

    // Map -> Key, Value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2) // key의 타입, value의 타입 순서로 쓴다
    println(numberMap.get("one"))

    // Mutable Collection (변경 가능)
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one")
    mNumberMap.put("two",2)
    println(mNumberMap)
}



// 15. Collection practice
// list, set, map

fun main(array:Array<String>){
    val a = mutableListOf<Int>(1,2,3)
    a.add(4)
    println(a)
    a.add(0,100)
    println(a)
    a.set(0,200) // 해당 인덱스의 값을 200으로 바꾼다
    println(a)
    a.removeAt(1)
    println(a)

    val b = mutableSetOf<Int>(1,2,3,4)
    b.add(2)
    println(b)
    b.remove(2)
    println(b)

    val c = mutableMapOf<String, Int>("one" to 1)
    c.put("two",2)
    println(c)
    c.replace("two",3)
    println(c)
    println(c.keys)
    println(c.values)
    c.clear()
    println(c)
}



// 16. Iterable, 반복문

fun main(array:Array<String>){
    val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)

    // 반복하는 방법(1)
    for (item in a){
        if(item==5){
            println("item is five")
        }else{
            println("item is not five")
        }
    }
    println()

    // 반복하는 방법(2)
    for ((index, item) in a.withIndex()){
        println("index : " + index + " value : " + item)
        // 문자열 + Int(정수) = 문자열
        // 문자열 + 아무거나 = 문자열
    }

    // 17. 반복문 2
    // 반복하는 방법(3)
    a.forEach{
        println(it)
    }

    // 반복하는 방법(4)
    a.forEach{item ->
        println(item)
    }

    // 반복하는 방법(5)
    a.forEachIndexed { index, item ->
        println("index : " + index + " value : " + index)
    }

    // 반복하는 방법(6)
    for ( i in 0 until a.size) {
        // until은 마지막 수를 포함하지 않는다
        // 0부터 8까지이다.
        println(a.get(i))
    }

    // 반복하는 방법(7)
    for (i in 0 until a.size step(2)){
        // 0,2,4,6,8번째 index
        println(a.get(i)) // 1 3 5 7 9 출력
    }

    // 반복하는 방법(8)
    for ( i in a.size - 1 downTo (0)){ // 8부터 0까지 반복
        println(a.get(i))
    }
    println()
    // 반복하는 방법(9)
    for (i in a.size -1 downTo(0) step(2)){
        println(a.get(i))
    }

    // 반복하는 방법(10)
    for (i in 0..10){ // ..은 마지막을 포함한다
        println(i)
    }

    // 18. 반복문 3
    // 반복하는 방법(11)
    var b : Int = 0
    var c : Int = 4
    while (b<c) {
        b++ // while문을 정지시키기 위한 코드
        println("b")
    }

    // 반복하는 방법(12)
    var d : Int = 0
    var e : Int = 4
    do{
        println("hello")
    } while (d<e) // while 조건을 만족하지 못하더라도 do 안의 명령이 한번은 실행된다.
}



// 중간과제
fun main(array:Array<String>){
}
//    first()
//    println(second(80))
//    println(third(52))
//    gugudan()

//    1번 문제
//    List를 두개 만든다
//    첫번째 list에는 0부터 9까지의 값을 넣는다(반복문 사용)
//    두번째 list에는 첫번째 list의 값을 하나씩 확인한 후
//    짝수면 true 홀수면 false를 넣어준다

//    2번 문제
//    학점을 구하자
//    80-90 -> A
//    70-79 -> B
//    60-69 -> C
//    나머지 F

//    3번 문제
//    전달받은 숫자의 각 자리 수의 합을 구하자
//    조건 : 전달받은 숫자는 무조건 두자리 숫자이다

//    4번 문제
//    구구단을 출력하자