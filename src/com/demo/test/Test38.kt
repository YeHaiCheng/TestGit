package com.demo.test

/***
 *    关于== 与=== 的使用测试案例
 *
 * **/


fun main(){
    var a:Int? = 1;
    var b:Int? = 1;
    println("小值的时候")
    println("== 的结果${a==b}");
    println("=== 的结果${a===b}");
    var c:Int? = 10000;
    var d:Int? = 10000;
    println("大值的时候")
    println("== 的结果${c==d}");
    println("=== 的结果${c===d}");
}