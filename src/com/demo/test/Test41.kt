package com.demo.test
/**
 *   非常莫名奇妙
 *
 * **/
class CatchException<out T> {
    companion object {
        operator fun <T> invoke(body: () -> T): Pair<Exception , T?> {
            var retval:Pair<Exception , T?>
            try {
                retval = Pair(Exception() , body())
            } catch (e: Exception) {
                retval = Pair(e , null)
                e.printStackTrace()
            }
            return retval
        }
    }
}


fun main(){
    /** 四个等价**/
    CatchException{};
    CatchException({});
    CatchException(){};
    CatchException.invoke {  }
}