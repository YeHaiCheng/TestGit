package com.demo.test

/**
 *   对象声明 object declaration
 *
 *   对象可以有属性和方法
 * **/
object MyObject{
    fun methon(){
        println("对象");
    }
}
fun main(){
    MyObject.methon();
    MyTest.Myobject.method();


    val v=MyTest.Myobject;
    println(v.javaClass);
}
/**
 *    伴生对象 companion object
 *    在Kotlin中，类是没有static方法，参生伴生对象
 *    解决静态方法和静态变量的问题，实现与Java类似的实现
 *
 *
 *    伴生对象没有名字的话，name编译器会提供一个默认的名字 Companion
 *
 *    伴生对象转化成字节码的时候，伴生对象是实现内部类
 *
 *    虽然伴生对象的成员看起来像Java的静态成语，但在运行期，他们依旧是真实对象的实例成员
 *    在JVM上，可以将伴生对象的成员真正生成类的静态方法与静态属性，这是通过@JvmStatic注解来实现
 * **/

class MyTest(var i:Int){

    companion object Myobject{
        var a:Int=100;
        @JvmStatic
        fun method(){
            println("伴生对象");
        }
    }
}