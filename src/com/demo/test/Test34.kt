package com.demo.test
/***
 *     为什么需要进行尾递归
 *     什么是尾递归    就是函数执行的最后一个步骤是调用函数     是最后一步
 *
 *     尾递归只是存一个调用记录，所以永远不会发生栈溢出错误
 * ***/
fun main(args: Array<String>) {
    println(accumulation(5, 1))
}

/**
 * tailrec 是尾递归函数的关键字
 * 尾递归函数是指，在该函数的最后一步操作中依旧是调用函数本身
 * 为了实现尾递归，我们定义了该方法接收两个参数：num 是我们传入的需要计算累加值得的变量，total用来接收最终的返回值
 */
tailrec fun accumulation(num: Int, total: Int): Int {
    return if (num == 1) {
        total
    } else {
        accumulation(num - 1, num + total)  //此时，该调用的含义是：先计算 total=num+total,然后计算 num=num-1
    }
}