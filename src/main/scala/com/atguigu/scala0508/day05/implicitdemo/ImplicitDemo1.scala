package com.atguigu.scala0508.day05.implicitdemo

/**
  * Author lzc
  * Date 2019-09-09 11:02
  */
object ImplicitDemo1 {
    def main(args: Array[String]): Unit = {
        // log4j   i18n  // 国际化   k8s
        implicit def double2Int(d: Double): Int = d.toInt
        
        
        val n: Int = 10.3
        
        println(n)
        val a: Int = 20.3
        
    }
}

/*
隐式转换:
    隐式转换函数
       implicit def double2Int(d: Double): Int = d.toInt
    
    隐式类
    
    隐式参数和隐式值
 */