package com.demo.test

/**
 *   延迟属性
 *
 * **/

val lazyValue: String by lazy {
    println("computed!") ;    // 第一次调用输出，第二次调用不执行
     "Hello";
    "OK";
}

fun main(args: Array<String>) {
    println(lazyValue) ;  // 第一次执行，执行两次输出表达式
    println("--------");
    println(lazyValue)  ; // 第二次执行，只输出返回值
}