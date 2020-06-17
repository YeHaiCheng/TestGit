package com.demo.test
/**
 *   lateinit
 *
 *   lateinit
 *   1.只能用在类体中var属性上，不能用在primary constructor声明的属性上
 *   2.属性不能拿拥有自定义的get、set
 *   3.属性类型需要声明为非空，且不能是原生数据类型
 * **/
class TheClass{
    lateinit var name:String;
}
fun main(){
    var t=TheClass();
    t.name="sss";
    if(t.name==null){
        println("kong");
    }
    print(t.name) ;
}