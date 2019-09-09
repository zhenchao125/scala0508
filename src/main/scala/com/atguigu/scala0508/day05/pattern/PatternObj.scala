package com.atguigu.scala0508.day05.pattern

/**
  * Author lzc
  * Date 2019-09-09 16:19
  */
object PatternObj {
    def main(args: Array[String]): Unit = {
        val r: Double = -9
        
        r match {
            case My(a) => println(a)
            case _ =>
        }
        
    }
}

/*object Square {
    def unapply(abc: Double) = if(abc >= 0) Some(math.sqrt(abc)) else None
}*/

object My{
    def unapply(arg: Double): My = new My(arg)
}

class My(r: Double){
//    def isEmpty = if(r >= 0) false else true
    def isEmpty: Boolean = r < 0
    def get = math.sqrt(r)
 }

/*
对象匹配:

对象提取器:
   unappy的返回值必须是 Option 类型
    如果返回时Some表示匹配成功
    如果返回的None表示匹配失败
   
   2.11.1 之后, 返回现在放松, 不必必须是Option, 也可以返回其他的类型的对象:
         这个必须必需有两个方法:
            isEmpty
                表示是否匹配成功  如果是 true 失败, false表示成功
            get
                如果成功, 则从这个方法获取具体的匹配到的值
 
 */
