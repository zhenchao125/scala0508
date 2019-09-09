package com.atguigu.scala0508.day05.pattern

/**
  * Author lzc
  * Date 2019-09-09 15:08
  */
object PatternType2 {
    def main(args: Array[String]): Unit = {
        
        //        foo(Array(1, 2.2))
        //        foo(Map(1 -> 97.8))
        foo(1.1 :: Nil)
        
    }
    
    def foo(obj: Any) = {
        
        obj match {
            // 匹配数组类型  new int[]
            case a: Array[Int] => println("Array[Int]   " + a.mkString(","))
            //            case a: Map[String, Int] => println("Map[String, Int]   ")
            case a: Map[_, _] => println("Map[_, _]   ")
            case a: List[_] => println("List[_]..")
            case _: Int =>

            case _ =>
        }
        
    }
}


/*
泛型擦除

 */