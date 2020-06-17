package com.demo.test


/**
 * 如果泛型类只是将泛型类型作为其方法的输出类型，那么我们就可以使用out
 *
 * produce = output = out
 */
interface Producer<out T> {

    fun produce(): T

}

/**
 * 如果泛型类只是将泛型类型作为其方法的输入类型，那么我们就可以使用in
 *
 * consumer = intput = in
 */
interface Consumer<in T> {

    fun consumer(item: T)

}

/**
 * 如果泛型类同时将泛型类型作为其方法的输入类型与输出类型，那么我们就不能使用out与in来修饰泛型
 */
interface ProducerConsumer<T> {
    fun produce(): T

    fun consumer(item: T)
}

open class Fruit

open class Apple: Fruit()

class ApplePear: Apple()

class FruitProducer: Producer<Fruit> {
    override fun produce(): Fruit {
        println("Produce Fruit")

        return Fruit()
    }

}

class AppleProducer: Producer<Apple> {
    override fun produce(): Apple {
        println("Produce Apple")

        return Apple()
    }

}

class ApplePearProducer: Producer<ApplePear> {
    override fun produce(): ApplePear {
        println("Produce ApplePear")

        return ApplePear()
    }

}