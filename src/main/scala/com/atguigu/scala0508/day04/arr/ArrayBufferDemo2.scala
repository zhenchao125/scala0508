package com.atguigu.scala0508.day04.arr

import scala.collection.mutable.ArrayBuffer

/**
  * Author lzc
  * Date 2019-09-07 09:26
  */
object ArrayBufferDemo2 {
    def main(args: Array[String]): Unit = {
//        val buffer = new ArrayBuffer[Int]
        val buffer =  ArrayBuffer[Int](10,20,30)
//        val buffer1 = buffer :+ 10   // buffer.:+(100)
//        val buffer1 = buffer.+:(100, 200)
        val buffer1 = 300 +: 200 +: 100 +: buffer    // buffer.+:(100)
        println(buffer)
        println(buffer1)
    }
}

/*

+= 一般用于可变集合. 也可以用于不可变???
-=  删除第一个碰到

:+
+:

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