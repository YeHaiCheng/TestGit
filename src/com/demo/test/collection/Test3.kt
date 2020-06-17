package com.demo.test.collection

import java.util.*

open class Person(val name : String , val age : Int){
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}

open class Student(name: String, age : Int, cls : String) : Person(name, age)


class SecondStudent(name: String, age : Int, cls : String):Student(name,age,cls )

//public fun <T> listOf(vararg elements: T): List<T> = if (elements.size > 0) elements.asList() else emptyList()

public fun < T :SecondStudent> mylistOf(vararg elements: T):List< T>{
    return if (elements.size > 0) elements.asList() else emptyList()
}
fun main() {
    // 注意：Any是kotlin中的超类，故而Student类也是继承自Any的。这里你可以换成Person类结果是相同的
    var listPerson: List<Student>
    val listStudent : List<SecondStudent> = mylistOf(SecondStudent("张三",12,"一班"),SecondStudent("王五",20,"二班"))
    listPerson = listStudent
    listPerson.forEach { println(it.toString()) }
}