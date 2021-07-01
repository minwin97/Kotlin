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

}


//04. 함수
//fun 함수명(변수명:타입, 변수명:타입, ...) : 반환형{
//     함수 내용
//     return 반환값
//}

// 함수 만들기
fun plus(first : Int, second : Int) : Int{
  val result : Int = first + second
  return result
}

// 디폴트 값을 갖는 함수 만들기
fun plusFive(first : Int, second : Int = 5) : Int{
  val result : Int = first + second
  return result
  
// 반환값이 없는 함수 만들기
fun printPlus(first : Int, second : Int) : Unit{
  val result : Int = first + second
  println(result)
}

// 반환값이 없는 함수 만들기2
fun printPlus2(first : Int, second : Int){
  val result : Int = first + second
  println(result)
}

// 간단하게 함수를 선언하는 방법
fun plusShort(first : Int, second : Int) = first + second
  
// 가변인자를 갖는 함수 선언하는 방법 (n개까지의 인수를 받을 수 있다)
fun plusMany(vararg numbers : Int) { 
  for (number in numbers) { 
    println(number)
  }
}

// 함수를 호출하는 방법
fun main(args:Array<String>){
  val result = plus(5,10)
  println(result)
// 인수를 명시적으로 전달하는 방법
  val result3 = plus(second = 100, first = 10)
  println(result3)
// 디폴트 값을 갖는 함수 호출하기
  println()
  val result4 = plusFive(10,20)
  println(result4)
  val result5 = plusFive(10)
  println(result5)
  println()
  printPlus(10,20)
  println()
  val result6 = plusShort(50,50)
  println(result6)
  println()
  plusMany(1,2,3)
}


// 08. 제어 흐름
fun main(args:Array<String>){
  val a : Int = 5
  val b : Int = 10
//
