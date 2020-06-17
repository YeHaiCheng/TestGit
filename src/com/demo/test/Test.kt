package com.demo.test

class Test constructor(name:String) {
    val isEmpty: Boolean get()=false;
    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            setDataFromString(value) // 解析字符串并赋值给其他属性
            println("set:$value");
        }

    private fun setDataFromString(value: String) {
        println("pppppppppppppp");
        // this.stringRepresentation="$value+$value";
        // return;
    }

    @JvmField var curdata:String?=null;
    init {
        println("初始化模块已经进行了！！！！");
    }
    constructor(name:String="1",key:String ):this(name){
        println("次构造函数~~~");
    }


}

fun main(args : Array<String>){
    //Test("").stringRepresentation="3";
   // println(Test("").stringRepresentation="3");
    //println(isEmpty);
    println("------------------------------------")
    var test:Test=Test("");

    println(test.stringRepresentation);
//    var test:Test=Test("ok");

}