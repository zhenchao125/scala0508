package com.atguigu.scala0508.day02.highfun

/**
  * Author lzc
  * Date 2019-09-04 11:22
  */
object HighDemo1 {
    def main(args: Array[String]): Unit = {
        /*val f = foo _
        
        foo()
        f()
        */
    
        println(f1(add))
        
    }
    
    def add(a: Int, b: Int): Int = a * b
    
    
    def f1(f: (Int, Int) => Int): Int = {
        f(2, 4)
    }
    
    def foo() = {
        println("foo...")
        1
    }
}

/*
1. 在scala中, 函数式一等公民

对一个函数做什么?
    1. 定义函数
    2. 调用函数
    3. 传递函数

一个函数, 可以接收一个函数作为参数, 这样的函数就叫高阶函数(高阶算子)

 */