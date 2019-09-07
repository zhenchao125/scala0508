package com.atguigu.scala0508.day04.arr

import scala.collection.mutable.ArrayBuffer

/**
  * Author lzc
  * Date 2019-09-07 09:26
  */
object ArrayBufferDemo3 {
    def main(args: Array[String]): Unit = {
        val buffer1 = ArrayBuffer[Int](10, 10, 20, 30)
        val buffer2 = ArrayBuffer[Int](100, 200, 300, 400, 10, 10)
        
//        val b3 = buffer1 ++ buffer2  // buffer1.++
//        val b3 = buffer1 ++: buffer2  // buffer2.++:
//        buffer1 ++= buffer2
        buffer1 --= buffer2
        println(buffer1)
        println(buffer2)
        
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