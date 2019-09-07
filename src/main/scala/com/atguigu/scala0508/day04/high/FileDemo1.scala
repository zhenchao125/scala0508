package com.atguigu.scala0508.day04.high

import scala.io.Source

/**
  * Author lzc
  * Date 2019-09-07 17:15
  */
object FileDemo1 {
    def main(args: Array[String]): Unit = {
        val path = "C:\\Users\\lzc\\Desktop\\class_code\\2019_05_08\\01_scala\\scala0508\\src\\main\\scala\\com\\atguigu\\scala0508\\day04\\high\\FileDemo1.scala"
        val lines: List[String] = Source.fromFile(path).getLines().toList
        
        
    }
}
