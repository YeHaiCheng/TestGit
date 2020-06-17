package com.demo.test

fun main(args:Array<String>){
   var curClass:MyClass1=MyClass1("xiaoye",43,"北京");
    //urClass.printInfo();
}
/**
 *   类的定义
 *   可以有一个primary构造方法以及一个或者多个Secondary构造方法
 *   主构造方法写在类名后，即： primary构造方法在类头，可以若干参数
 *
 * **/
class MyClass constructor(username:String){
//   private val username:String=username.toUpperCase();

    init{
           println("这里是初始化代码块");
           println(username);
    }
}
class MyClass1 constructor(username:String){

    private var username:String;
    private var address:String;
    private  var age:Int;
    init{
        this.username=username;
        this.age=20;
        this.address="ss";
        print("初始化模块");
    }
    constructor(username: String,age:Int):this(username){
        println(username+" ,"+age);
        this.username=username;
        this.age=age;
    }
    constructor(username:String,age: Int,address:String):this(username,age){
        this.address=address;
        println(address);
    }
    fun printInfo(){
        println("username: ${username},age: ${age},address:${address}");
    }
}


/**
 *    成员变量和主构造方法的参数区别
 *    主构造方法都有默认值，是否包含默认的无参的构造方法， 是有
 * **/
class MyClass2 constructor(private val username:String,var age:Int ,var address: String){

    fun printInfo(){
        println("username: ${username},age: ${age},address:${address}");
    }
}

/**
 *    继承
 *     open 代表该类可被继承
 * **/

open class Parent(name:String,age:Int){

}
class Child(name:String ,age:Int):Parent(name,age){

}

/**
 *  一个类中没有primary构造方法，那么这个类的每个Secondary构造方法需要通过Super关键字来初始化父类构造方法
 *  或者通过其他secondary构造方法完成任务
 *
 * **/
open class  Parent2(name: String){

}
class Child2 :Parent2 {
    constructor(name: String) : super(name){

    }
}