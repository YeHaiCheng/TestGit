package com.demo.test

fun main(args: Array<String>) {



    action1({ rs: Int ->
        print("回调函数参数= : $rs");
        true;
    },{
        rs:Int   -> print("回调函数参数= : $rs");
        true;
    })
    /*** 这两种写法是一样的  ***/
    action1({ rs: Int ->
        print("回调函数参数= : $rs");
        true;
    }){
        rs:Int   -> print("回调函数参数= : $rs");
        true;
    }
}



/**
 * 函数作为 形参
 */
fun action1(curbook :(Int)->Boolean, callback:(Int)->Boolean){
    //调用
    if(callback(1)){
        println("回调函数返回值 true")
    }else{
        println("回调函数返回值 false")
    }
}