package com.demo.test.collection



fun main() {
//    val arr=arrayOf("1",2,3,4);
//    println(arr.component1())
//    println(arr.component2())

    val arr = arrayOf("1","2",3,4,5)
    val list1 = listOf(1,2,"3",4,"5")                // 随意创建
    val list2 = listOf<String>("1","2","3","4","5")  // 确定元素的值类型
    val list3 = listOf(arr)                          // 可传入一个数组



// 遍历
    for(value in list2){
        print("$value \t")
    }
}