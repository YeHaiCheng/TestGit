package com.demo.test
/***
 *    带参数和返回值得函数 作为形参
 * ***/
fun main(args: Array<String>) {

    action(1){                                //it-> //Lambda语法，回调参数在这里
        println("回调函数参数= : $it")

        true//Lambda语法，最后一行返回值就是闭包的返回值
    }
    println("--------------------------------------");

    action(1,{ println("回调函数参数= : $it")

        true//Lambda语法，最后一行返回值就是闭包的返回值
         })

    action(1,{
        rs:Int   -> print("回调函数参数= : $rs");
        true;
    })

    /*** 这两种写法是一样的**/
}



/**
 * 函数作为 形参
 */
fun action(first:Int, callback:(Int)->Boolean){

    //调用
    if(callback(1)){
        println("回调函数返回值 true")
    }else{
        println("回调函数返回值 false")
    }
}