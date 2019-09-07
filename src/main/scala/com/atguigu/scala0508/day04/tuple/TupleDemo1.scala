package com.atguigu.scala0508.day04.tuple

/**
  * Author lzc
  * Date 2019-09-07 10:40
  */
object TupleDemo1 {
    def main(args: Array[String]): Unit = {
        /*val t2 = Tuple2(10, "abc")
        println(t2._1)
        println(t2._2)*/
        
        val t2 = (1, "abc", true)
        println(t2)
        println(t2._1)
        // 遍历元组, t2.productIterator 生成迭代器
        for (elem <- t2.productIterator) {
            println(elem)
        }
    
        println(/%(10, 3))   // RDD[(key, value)]
    }
    
    def /%(a:Int, b: Int) = (a / b, a % b)
    
    
}
/*

Tuple 元组


 */