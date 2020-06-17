package com.demo.test
/**高级函数 返回一个函数**/
fun main(args: Array<String>) {

    var method: (Int, Int) -> Int
    method = action()
    println(method.invoke(1, 2))
    //  在这里 method.invoke(1,2) 与method(1,2) 等价

    println(method(1,2))
    method = action2()
    println(method.invoke(1, 2))

}

/**
 * 函数作为 形参
 */
fun action(): (Int, Int) -> Int {

    //逻辑代码

    return { j, i ->
        j + i
    }
}

fun action2(): (Int, Int) -> Int {

    //逻辑代码
    return { j, i ->
        j - i
    }
}