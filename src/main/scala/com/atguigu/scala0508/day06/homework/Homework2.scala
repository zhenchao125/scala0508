package com.atguigu.scala0508.day06.homework

/**
  * Author lzc
  * Date 2019-09-10 07:58
  */
object Homework2 {
    def main(args: Array[String]): Unit = {
        //        implicit def int2RichInt(n: Int) = new RichInt(n)
        
        println(5 !)
        println(100 +% 10)
    }
    
    implicit class RichInt(n: Int) {
        def ! = {
            jiecheng(n)
        }
        
        def jiecheng(a: Int): Long = {
            if (a == 1) 1
            else a * jiecheng(a - 1)
        }
        
        def +%(per: Int):Double = {
            n * (1 + per / 100.0)
        }
    }
    
}


/*

3. 定义一个 ! 操作符, 计算某个整数的阶乘. 比如 5! 应该得到 120
4. 定义一个操作符 +% , 可以将一个给定的百分百添加到某个值
    比如 120 +% 10  应该得到 132
 */