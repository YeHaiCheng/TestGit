package com.demo.test

/**
 *   委托
 *   一个接口，一个接口的实现类
 *
 *   那么你建立一个类的时候需要上述接口对象的时候，就可以通过By  接口类型 By 对象名称 来进行委托
 * **/
//interface Base {
//    fun print()
//}
//
//class BaseImpl(val x: Int) : Base {
//    override fun print() { print(x) }
//}
//
//class Derived(b: Base) : Base by b
//
//fun main() {
//    val b = BaseImpl(10)
//    Derived(b).print()
//}