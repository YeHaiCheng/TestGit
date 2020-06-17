package com.demo.test
//
///**
// *    泛型（generics） 表示变量类型的参数化
// *    Kotlin 为泛型声明执行的类型安全检测仅在编译期进行， 运行时实例不保留关于泛型类型的任何信息。这一点在 Java 中也是类似的。
// * **/
//class Mygenerics<T>(t:T){
//    var variable:T;
//    init {
//        this.variable=t;
//    }
//}
///***
// *   泛型擦除 引出来的一个问题就是，因为其类型已经在编译器擦除了，所以在运行时进行类型的判断是不行的。
//     把函数修饰为内联函数 关键词 inline，这样编译器每一次函数调用都换成函数实际代码实现，
//     同时我们使用refied 关键字修饰泛型类型，这样就能保留泛型参数的具体类型了
// * **/
//inline fun <reified T> test(param: Any) {
//    if (param is T){
//        println("param type is match")
//    }
//}
/***
 *    型变的由来
 *    问题： Kotlin中的泛型默认不型变的，无法自动完成类型转换，但是如果子类赋值给父类会报错
 *    本质来讲这种赋值操作时合理安全的，但是编译器似乎不知道，这必然给我们Coding带来麻烦
 * ***/

/**   说明泛型T 来自哪一种类型      **/
//interface IAnimal<T> {}
//class Animal<T> {}
//fun <T> initAnimal(param: T) where T : Animal<T>, T : IAnimal<T> {}

//fun main(args: Array<String>){
//    //完整写法  空格要保持
//    var curMygenerics: Mygenerics<String> = Mygenerics<String>("");
//    var myGenerics=Mygenerics("hello");
//    println(myGenerics.variable);
//}

/**
 *     泛型的协变和逆变
 **/



open class Animal constructor(name:String){
    lateinit var name: String;
}
class AnimalTTT:Animal{
    lateinit var id: String;
    constructor(name:String,id:Int): super(name){

    }
}
class MyClass_t<T>(t: T){
    private var t:T;
    init{
        this.t=t;
    }
    fun get():T =this.t;
}


class Box<T>(t:T){
    var value=t;
}
fun main(args: Array<String>){
   var box:Box<Int> = Box<Int>(1);
}