package com.demo.test
/***
 *
 *    覆盖由委托实现的接口成员
 * ***/
//interface Base {
//    fun printMessage()
//    fun printMessageLine()
//}
//
//class BaseImpl(val x: Int) : Base {
//    override fun printMessage() { print(x) }
//    override fun printMessageLine() { println(x) }
//}
//
//class Derived(b: Base) : Base by b {
//    override fun printMessage() { print("abc") }
//}
//
//fun main() {
//    val b = BaseImpl(10)
//    Derived(b).printMessage()
//    Derived(b).printMessageLine()
//}