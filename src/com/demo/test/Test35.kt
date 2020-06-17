package com.demo.test

/**
 *        Kotlin限定了只能重载哪些操作符，以及在类中定义的名字，这样就避免了操作符的滥用；
 *
 *        重载操作符函数放在函数体内部
 *
 *
 *        其实说白了，就是符号运算的时候用函数代替，然后开发则通过改变函数的实现方式，从而改变
 *        操作符的操作方式，从而使其又重载操作符的现象
 * **/
data class Pointer(val x:Int, val y:Int){

    operator fun plus(other:Pointer) :Pointer {
        return Pointer(x + other.x, y + other.y)
    }
}

fun  main(){
    var p1:Pointer= Pointer(1,2);
    var p2:Pointer= Pointer(3,5);
    var p3:Pointer?;
    p3=p1+p2;
    println("p3结果为：${p3.x},${p3.y}")
}
