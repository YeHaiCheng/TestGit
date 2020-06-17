package com.demo.test

/**
 *   抽象类
 *   可以抽象父类的已实现方法
 * **/
open class BaseClass{
    open fun method(){

    }
}

abstract class ChildClass:BaseClass(){
    override abstract fun method();
}