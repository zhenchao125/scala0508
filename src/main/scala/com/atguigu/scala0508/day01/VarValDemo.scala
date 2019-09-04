package com.atguigu.scala0508.day01

import com.atguigu.My

object VarValDemo {
    def main(args: Array[String]) = {
        
        /*var a: Int = 10
        a = 20
        println(a)
        
        val b : Int = 20
        println(b)*/
        
        
        var a = 10
        
        val -- = 20
        println(--)
        
        val ` ` = 100
        print(` `)
        
        val `type` = 100
        
       
    }
}
/*
java:
    变量
    
    常量
        final
        
scala:
    变量
        
        var 变量名: 变量的类型 = 初始值
    
    
    常量
        val 常量名: 常量的类型 =
        
 能用常量的地方不用变量
 
 类型的推断:
 
 
 标识符的命名:  (变量, 常量, 对象名, 方法名(函数名))
 1. java的规则在这里是通用
    数字字母下划线 $
    数字不能开头
 2. 支持运算符作为表示的名字
    + - ++ --


补充: 在scala中, 没有传统意义的运算符.   +-/... 其实都是方法名(函数名)
 */
