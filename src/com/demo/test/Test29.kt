package com.demo.test

/**
 * 我们使用 return + @方法名标签 结束当前lambda函数
 */
//fun main(args: Array<String>) {
//    println("start")
//    forItem( {if(it==1)return@forItem else println(it)} )
//    println("end")
//}


var t=fun(i:Int):Unit{
    if(i==1)return
    else  println(i)
}
fun main(args: Array<String>) {
    println("start")
    forItem( fun(cur :Int){if(cur==1)return@forItem else println(cur)} )
   // forItem( {if(it==1)return@forItem else println(it)} )
   // forItem( t )
    println("end")
}
fun forItem(item: (i:Int) -> Unit) {
    var i = 0
    while (i++<5){
        item(i)
    }
}
