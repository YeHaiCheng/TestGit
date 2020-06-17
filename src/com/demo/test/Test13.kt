interface Base {
    fun printMessage()
    fun printMessageLine()
}
interface Base2{
    fun printMessage2()
    fun printMessageLine2()
}
class BaseImpl2(val x: Int) : Base2 {
    override fun printMessage2() { print(x) }
    override fun printMessageLine2() { println(x) }
}
class BaseImpl(val x: Int) : Base {
    override fun printMessage() { print(x) }
    override fun printMessageLine() { println(x) }
}

class Derived(b: Base,c:Base2) : Base by b,Base2 by c{
    override fun printMessage() { print("abc") }
}

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    val c = BaseImpl2(10)
    Derived(b,c).printMessage()     // 打印出 abc
    Derived(b,c).printMessageLine()   // 没有被覆盖 会打印 10
}