package com.atguigu.scala0508.day05.pattern

/**
  * Author lzc
  * Date 2019-09-09 15:45
  */
object PatternList {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 5)
        list match {
            //            case List(_, a, _, _, _) => println(a)
            //            case List(a, b@_*) => println(a, b)
            case a :: b :: c :: Nil => println(a, b, c)
        }
        
    }
}

/*
中置表达式:
    1 + 2
   

 */
