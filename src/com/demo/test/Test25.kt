package com.demo.test

/**
 *    可观察属性 Observable
 *     也是基于委托的基础上
 * **/
//import kotlin.properties.Delegates
//
//class User {
//    var name: String by Delegates.observable("<no name>") {
//        prop, old, new ->
//        println("$old -> $new")
//        println(1+2)
//    }
//}
//
//fun main() {
//    val user = User()
//    user.name = "first"
//    user.name = "second"
//}