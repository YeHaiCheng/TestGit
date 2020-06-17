package com.demo.test

import java.io.BufferedReader
import java.io.StringReader

/**
 * try- catch
 ***/
fun test5(reader: BufferedReader):Int?{
    try {
        val parseInt = Integer.parseInt(reader.readLine());
        println(parseInt);
    }catch (e: NumberFormatException){
        println("捕捉异常");
        return null;
    }finally {
        reader.close();
    }
    return null;
}

fun main(){
    val buffered = BufferedReader(StringReader("2a34"))
    println("111111")
    test5(buffered)
    println("欢迎欢迎")
}