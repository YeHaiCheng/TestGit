package com.demo.test
/****
 *
 *     函数的闭包实现方式
 * ***/
fun  test2():Unit{
    var sum = {
        num1: Int, num2: Int ->
        println("$num1 + $num2 = ${num1 + num2}")
        // 最后一行为 Lambda 表达式的返回值
        num1 + num2
    }
    println(sum(1, 2))
    println(sum.invoke(1, 3))

}

fun main(){
    test2()
}