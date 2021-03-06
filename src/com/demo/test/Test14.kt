package com.demo.test

import kotlin.reflect.KProperty
/**
 *      属性委托
 *
 * **/
class Example {
    var p: String by Delegate();
    var w: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

fun main(args: Array<String>) {
    val e = Example();
    println(e.p);
    e.p = "ymc";
}