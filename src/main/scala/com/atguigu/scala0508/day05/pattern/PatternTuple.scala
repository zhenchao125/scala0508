package com.atguigu.scala0508.day05.pattern

/**
  * Author lzc
  * Date 2019-09-09 16:09
  */
object PatternTuple {
    def main(args: Array[String]): Unit = {
        val t = (1, 2, 3)
        t match {
            case (a, b, c) => println(a)
            case (1, _, c) => println(c)
        }
    }
}
/*
数组
list
元组

 */