package com.demo.test

/***
 *    infix 存在的意义
 *      怎么去使用，解决了什么问题
 *      作用对象是扩展函数和成员函数
 *
 *
 * ***/
//扩展函数
infix fun Int.add(x: Int): Int {
    return this + x
}

//成员函数
class Account {
    var balance = 100.0

    infix fun add(amount: Double) = run { this.balance = balance + amount }
}
fun main() {

    println(100 add 200)

    var curObject:Account=Account().apply {
        this add 200.00
        println(this.balance)
    }
    println("当前对象获取的值："+curObject.balance)
}
