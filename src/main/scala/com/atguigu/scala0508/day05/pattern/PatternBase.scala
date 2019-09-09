package com.atguigu.scala0508.day05.pattern

import scala.io.StdIn

/**
  * Author lzc
  * Date 2019-09-09 14:46
  */
object PatternBase {
    def main(args: Array[String]): Unit = {
        val a = 1
        val b = 2
        val op = StdIn.readLine("请输入一个运算符: ")
        
       op match{
           case "+" => println(a + b)
           case "-" => println(a - b)
           case "*" => println(a * b)
           case "/" => println(a / b)
           case _ =>
       }
       
    }
}
/*
模式匹配:


*/