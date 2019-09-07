package com.atguigu.scala0508.day04.arr

import scala.collection.mutable.ArrayBuffer

/**
  * Author lzc
  * Date 2019-09-07 09:26
  */
object ArrayBufferDemo4 {
    def main(args: Array[String]): Unit = {
        val buffer1 = ArrayBuffer[Int](10, 10, 20, 30)
        /*for (elem <- buffer1) {
            println(elem)
        }*/
        println(buffer1.sum)
        println(buffer1.max);
        println(buffer1.min);
        println(buffer1.head)   // buffer(0)
        println(buffer1.last)
        println(buffer1.tail)  // 去除第一个元素, 剩下的元素组成的集合
        println(buffer1.take(2))  // 去前 n个元素, 返回时一个新的集合
    }
}

/*

+= 一般用于可变集合. 也可以用于不可变???
-=  删除第一个碰到

:+
+:

++  集合之间拼
++=
--
--=

运算符的约定:
    两种结合性:
        左结合
            3 + 4
            3 * 5
        右结合
           -5
           +5
          a = 3
          
          如果一个运算符是以 : 结尾, 则也是右结合
          
          ::
          :::
          /:
          :\

 */