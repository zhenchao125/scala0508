package com.atguigu.scala0508.day03.pck

import java.util

//import java.util.{ArrayList => JAL}
//import java.util.List
//import java.util.{ArrayList => _, _}
//import java.util.{HashSet, ArrayList}
/**
  * Author lzc
  * Date 2019-09-06 09:58
  */
object PckDemo2 {
    
    def main(args: Array[String]): Unit = {
        new util.HashSet[String]()
        new util.ArrayList[String]()
        
        
    }
}





/*

1. 声明包
    1. 和java一样
    2. 包语句
        package a{
        
        }

2. 导包
   1. 和java一样, 可以在顶部使用import导入
       在这个文件中的的所有类都可以使用

   2. 局部导入:
            什么使用什么时候导入
            
   3. 通配符导入
        import java.util._
   4. 给类起别名
        import java.util.{ArrayList => JAL}
        
   5. 屏蔽类:  ArrayList
        import java.util.{ArrayList => _, _}
        
   5. 导入多个类:
       import java.util.{HashSet, ArrayList}

 */