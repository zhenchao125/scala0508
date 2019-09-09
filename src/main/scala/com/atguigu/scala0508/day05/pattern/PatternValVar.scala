package com.atguigu.scala0508.day05.pattern

import scala.io.StdIn

/**
  * Author lzc
  * Date 2019-09-09 14:46
  */
object PatternValVar {
    def main(args: Array[String]): Unit = {
        val a = 1
        val b = 2
        val op = StdIn.readLine("请输入一个运算符: ")
        val Plus = "+"
        op match {
            case Plus => println(a + b)
            case "-" => println(a - b)
            case "*" => println(a * b)
            case "/" => println(a / b)
            
        }
        
    }
}

/*
模式匹配:

变量匹配:
 case aa => println(aa)  匹配所有的值
 case _ =>
 
常量匹配:
    常量的名字的首字母必须大写

*/