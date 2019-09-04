package com.atguigu.scala0508.day02.highfun

/**
  * Author lzc
  * Date 2019-09-04 14:59
  */
object ClosureDemo1 {
    def main(args: Array[String]): Unit = {
        
        /*val add4: Int => Int = add(4)
        println(add4(5))
        println(add4(6))*/
    
        println(add(4)(5))
        println(add(5)(5))
        
        
    }
    def add1(a:Int, b:Int) = a + b
    def add(a: Int)(b: Int) = a + b
    
    /*def add(a: Int) = {
        
        (b: Int) => a + b
    }*/
    
    
}

/*
闭包:

函数式编程的标配

如果一个函数, 访问到了它的外部(局部)变量的值, 那么这个函数和他所处的环境, 称为闭包

def add(a: Int)(b: Int) = a + b
函数的柯里化
    把一个参数列表的多个参数, 变成多个参数列表

 */