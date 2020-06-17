package com.demo.test

/**
 *     枚举类有点奇怪
 *
 * **/
enum class Color(val r:Int , val g:Int ,val b:Int){
    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255);

    fun rgb(){
        println(r+g+b)
    }
}
//fun getColor(color :Color){
//    when(color){
//        Color.BLUE -> println("this is blue")
//        Color.RED -> println("this is RED")
//        Color.GREEN -> println("this is GREEN")
//    }
//}

fun getColor(color :Color){
    when(color){
        Color.BLUE ,Color.RED -> println("this is blue or red")
        Color.GREEN -> println("this is GREEN")
    }
}
fun main(){
//    val r:Int=255;
//    val g:Int=255;
//    val b:Int=255;
//    Color.BLUE.rgb();
//    getColor(Color.BLUE);


    /**
     *
     *    let   是什么意思
     * **/
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // 输出 Kotlin 并忽略 null
    }
}