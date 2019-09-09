package com.atguigu.scala0508.day05.implicitdemo

import java.io.File

import scala.io.Source

/**
  * Author lzc
  * Date 2019-09-09 11:02
  */
object ImplicitDemo2 {
    def main(args: Array[String]): Unit = {
        implicit def file3RichFile(file:File) = new RichFile(file)
        val content:String  = new File("C:\\Users\\lzc\\Desktop\\class_code\\2019_05_08\\01_scala\\scala0508\\src\\main\\scala\\com\\atguigu\\scala0508\\day05\\implicitdemo\\ImplicitDemo2.scala")
            .readContent
        println(content)
        
        
    }
}

class RichFile(file: File){
    
    def readContent = Source.fromFile(file).mkString
}

/*
隐式转换:
    隐式转换函数
       implicit def double2Int(d: Double): Int = d.toInt
    
    隐式类
    
    隐式参数和隐式值
 */