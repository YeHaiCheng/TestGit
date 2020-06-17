package com.demo.test

fun main(args: Array<String>){
    println(curTest4());
}
/*
    定义函数
* */
fun convertUpercase(str: Any):String?{
    if(str is String){
        return str.toUpperCase();
    }
    return null;

}
/**
*    数组相关的内容
*
* */

fun  curTest():Unit{
    var array:IntArray= intArrayOf(1,2,3,4,5);
    for(item:Int in array){
        println(item);
    }
    println("--------------array.indices返回数组的下标范围-------------");
    for (i:Int in array.indices){
        println("array[${i}]=${array[i]}")
    }
    println("-------------------------------------------")
    for ((index,value) in array.withIndex()){
        println("array{$index}=$value");
    }
}
/**
 *   when 关键字的使用
 * **/
fun curTest2():String?{
    var str: String="sss";
    when(str){
        "hello" -> return "HELLO"
        "world" -> return "World"
        else ->return "other"
    }
}
fun curTest3():String?{
    var str: String="sss";

    var a:Int=1;
    when(a){
        1->{println("1")};
        2,3->{println("12")};
        in 5..10->{println("123")}
    }
    return when(str){
        "hello" ->  "HELLO";
        "world" -> "World";
        else ->"other";
    }
}

/**
 *   范围的使用  Ranges.kt
 * **/
fun curTest4():Unit{
    val a=5;
    var b=10;
    if(a in 2..b){
        println("ok");
    }
    for (i in 2..10){
        println(i);
    }
    for (i in 2.rangeTo(10)){
        println(i);
    }
    for (i in 2..10 step 2){
        println(i);
    }
    for(i in 10 downTo 3 step 4){
        println(i);
    }
}