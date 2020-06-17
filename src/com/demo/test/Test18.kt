package com.demo.test
class  Testsss<T>(){

    /**
     *    public final void test(@NotNull Object param){}
     *    本质上就是定义一个final函数
     * **/
inline fun <reified T> test(param: Any) {
    if (param is T){
        println("param type is match")
    }
}
}