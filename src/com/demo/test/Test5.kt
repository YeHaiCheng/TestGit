package com.demo.test
fun main(args:Array<String>){
    var c=C();
    c.methon();
}

/**
 *    接口可以有为实现或已经实现方法
 * **/
interface A{
    fun methon(){
      println("A");
    }
}
/**
 *   接口不可被直接实例化，
 * **/
class C:A,B(){
    override fun methon() {
        super<A>.methon();
        super<B>.method();
    }
}
open class B{
    open fun method(){
        println("B");
    }
}
