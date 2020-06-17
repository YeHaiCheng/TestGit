package com.demo.test

import java.util.Arrays.asList


fun main(){
    var a = arrayOf(1, 2, 3);
    var list = asList(-1, 0, *a, 4);
    println(list);
}