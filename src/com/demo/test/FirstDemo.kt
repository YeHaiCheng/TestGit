package com.demo.test

import  java.util.*;
fun test(){}
class MyService {
    fun performAction(): String = "foo"
}
class Runoob{
    private lateinit var myService: MyService

}

/**显示显现返回类型*/
//fun sum(a: Int,b: Int):Int{
//    return a+b;
//}

fun sum(a: Int,b:Int)=a+b;

public fun sum(a: Float,b: Float):Float=a+b;

fun vars(vararg v:Int){
    for (vt in  v){
        print(vt);
    }
}

fun test(s:String){
    println("test 被调用");
}

fun breakLabel() {
    //最外层循环处定义了一个名为loop的label
    loop@ for (i in 5..10) {
        for (j in 1..10) {
            if (i == j) break@loop //跳出最外层循环
            println("$i-$j")
        }
    }
}

//fun main(args :Array<String>){
//    //vars(1,2,3,4,5);
//    val sumLambda:(Int,Int)->Int={x,y->x+y};
//    // print(sumLambda(1,2));
//    /*  定义常量与变量*/
//    //val a:Int=1;
//    val b=1;
//    val c:Int;
//    c=1;
//
//    var a=1;
//    val s1="a is $a";
//    a=2;
//    val s2="${s1.replace("is","was")},but now is $a";
//    // println(s2);
//    //类型后面加?表示可为空
//    var age:String?=null;
//    var k:Double=2.01234;
//    /* ? 意思是如果为空则不执行   非空执行后面操作 */
//    // println(age?.equals("23"));
//    var str:String?=null;
//    //str="ss";
//    //test(str!!);
//    breakLabel();
//}

