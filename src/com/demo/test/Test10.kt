package com.demo.test

/**
 *    数据类  data class
 *     数据类需要满足如下要求：
 *      1.主构造方法至少要有一个参数
 *      2.所有的主构造方法参数都需要被标记为val或var
 *      3.数据类不能是抽象的、open的、sealed的以及linner的
 *
 *
 *      对于数据类，编译器会自动生成如下内容：
 *      1.equals/hashCoded
 *      2.toString()方法 形式为Person(name=xiaoye, age=20, address=guangdong)
 *      3.针对属性的componentN方法，并且是按照属性的声明顺序来生成的
 *
 *      关于数据类成员的继承要点：
 *      1.如果数据类中显示的定义equal、hashCode或toString方法，或是在数据类的父类将这些方法声明为final，
 *        name这些方法就不会再生成，转而使用而有的。
 *      2.如果父类拥有component
 * **/

data class Person(val name:String,val age:Int,var address:String){

}
fun main(){
    var person=Person("xiaoye",20,"guangdong");
    print(person);
}