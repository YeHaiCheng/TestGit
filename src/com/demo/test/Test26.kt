package com.demo.test
/**
 *   把属性储存在映射中
 *
 * **/
class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}
val user = User(mapOf(
        "name" to "John Doe",
        "age"  to 25
))


fun main(){
    println(user.name) // Prints "John Doe"
    println(user.age)  // Prints 25
    println(user.toString())
}