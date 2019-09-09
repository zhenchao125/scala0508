package com.atguigu.scala0508.day05.implicitdemo

/**
  * Author lzc
  * Date 2019-09-09 11:02
  */
object ImplicitDemo4 {
    
    implicit val aaaa = 100
    
    
    def main(args: Array[String]): Unit = {
        foo(100)
        foo(200)(1)
        // Ordering Char
        Array(1, 2).sortBy(x => x)
        
    }
    
    def foo(n: Int)(implicit a:Int) = {
        println(n + a)
    }
    def foo1(implicit a: Int) = {
        println(a)
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
        
隐式转换函数, 隐式类, 隐式值的查找:
    1. 在当前使用的作用域内查找
    2. 去相关类型的伴生对象中查找
    
    
 */