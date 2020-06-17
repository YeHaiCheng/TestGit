package com.demo.test

class ThePersion(address:String){
   val agt:Int get() = 20;
    var address :String= address
        get(){
             println("")
             return field
        }
        set(value) {
            println("set");
            field=value;
    }
}
/**
 *     get()  、set() 、field
 *     变量的定义
 *        var propertyName : propertyType =initializer
 *            get(){}
 *            set(){}
 *      修改访问权限  get、set方法的访问权限
 *      private get
 *      private set
 * **/
fun main(){

}
