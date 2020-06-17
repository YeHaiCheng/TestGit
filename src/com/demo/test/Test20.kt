package com.demo.test

/***
 *
 *    this 对象的意义以及使用场景
 *
 *    （this 在扩展方法里，代表接受类的实例对象） ||  在扩展方法（或者带接收者的匿名扩展方法）里this代表接收者
 *
 * ***/

fun main() {
    ThisModifier().thisFun()
    ThisModifier().extendsMethod();
    ThisModifier().extendsMethod();
}
/**
 *    这里包含两种扩展类方法的写法：
 *
 *
 * **/
class ThisModifier {
    val param: Int

    init {
        this.param = 3//在属性里，this代表调用该方法对象（ThisModifier的实例）
    }

    fun thisFun() {
        println(this.param)//在方法里，this代表调用该方法对象（ThisModifier的实例）
    }
}
val extendsMethod = fun ThisModifier.() {
    //在扩展方法（或者带接收者的匿名扩展方法）里this代表接收者
    println("扩展方法里：${this.param}")
}

fun ThisModifier.curString() {
    //在扩展方法（或者带接收者的匿名扩展方法）里this代表接收者
    println("扩展方法里：${this.param}")
}
