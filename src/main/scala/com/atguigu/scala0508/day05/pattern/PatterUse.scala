package com.atguigu.scala0508.day05.pattern

/**
  * Author lzc
  * Date 2019-09-09 16:12
  */
object PatterUse {
    def main(args: Array[String]): Unit = {
        /*val arr = Array(10, 20, 30)
        
        val Array(_, a, b) = arr
    
        println(a)
        println(b)*/
        
        /*val (_, t): (BigInt, BigInt) = BigInt(10) /% 3
        println(t)*/
        
        
        val map = Map(1 -> 2, 2-> 3)
        for ((k, v) <- map) {
            println(v)
        }
    }
}
/*
Array
List
Tuple
 */