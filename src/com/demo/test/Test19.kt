package com.demo.test

/****   函数编程
 *    最重要的一个思想就是，函数也是一种数据类型
 *
 *
 *    在这里使用的疑问就是 一个String类型的扩展函数里，this[0]代表的意义
 * ****/

var test=fun(v1:Int, v2:Int):Int { return v1+v2;}
var h=fun(g:(Int,Int)->Int,v1:Int,v2:Int):Int{return g(v1,v2);};


var k1=fun(g1:(Int,Int)->Int,g2:(Int,Int)->Int,v1:Int,v2:Int):Int{return g1(v1,v2)*g2(v1,v2);};
typealias H = (Int,Int) -> Int;
var k2=fun(g1:H,g2:H,v1:Int,v2:Int):Int{return g1(v1,v2)*g2(v1,v2);};
fun main(){
    println(test);
    /** 函数数据类型**/
    println(h(test,1,1));
    println(k1(test,test,1,1));
    println(k2(test,test,1,1));
    var curString="ok";

    println(curString.laststr());
}

fun String.laststr():String{
   if(this.length==0){
       return "";
   }
    println(this[0]);
    println(this[1]);
    return "hello,world";
}

fun <T> List<T>.filter(predicate: (T) -> Boolean): MutableList<T> {
    val result = ArrayList<T>()
    this.forEach {
        if (predicate(it)) {
            result.add(it)
        }
    }
    return result
}