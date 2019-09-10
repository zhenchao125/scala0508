package com.atguigu.scala0508.day06.pattern

/**
  * Author lzc
  * Date 2019-09-10 09:04
  */
object PartitionFunDemo1 {
    def main(args: Array[String]): Unit = {
        /*val r = foo((a, b) => {
            a + b
        })
        println(r)*/
        
        /*val r = foo({
            case (a, b) => a + b
        })
        println(r)*/
    
        /*println(foo1((t, c) => {
            t._2 + c
        }))*/
    
        /*println(foo1({
            case ((a, b), c) => b + c
        }))*/
        
    }
    
    def foo1(f: ((Int, Int), Int) => Int) = {
        f((1, 2), 10)
    }
    
    def foo(f: (Int, Int) => Int) = {
        f(3, 4)
    }
}
/*
如果定义一个偏函数:
    用一对大括号括起来的一系列的case 语句, 就是一个偏函数

 */