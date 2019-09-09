package com.atguigu.scala0508.day05.implicitdemo

import java.time.LocalDate

/**
  * Author lzc
  * Date 2019-09-09 11:02
  */
object ImplicitDemo3 {
    def main(args: Array[String]): Unit = {
        
        val ago = "ago"
        val later = "later"
        
        println(10 days ago)
        println(2 days later)
        
        //
    }
    
    
    implicit class RichTime(day: Int) {
        def days(when: String): String = {
            if (when == "ago") {
                LocalDate.now().minusDays(day).toString
                
            } else {
                LocalDate.now().plusDays(day).toString
            }
        }
    }
    
}


/*
隐式转换:
    隐式转换函数
       implicit def double2Int(d: Double): Int = d.toInt
    
    隐式类
        其实是隐式转换函数的语法糖
    
    隐式参数和隐式值
        他们配合使用
 */