package com.demo.test

/**
 *
 *     延迟属性 Lazy
 *
 *
 *     不明白为什么可以这样写
 * **/
val lazyValue1: String by lazy {
    println("computed!")
    "Hello"
}
val lazyValueInt12: Int by lazy {
    println("computed!")
    1+2
}

fun main() {
    println(lazyValue1)
    println(lazyValue1)
    println("-----------------------------------------")
    println(lazyValueInt12)
    println(lazyValueInt12)
}