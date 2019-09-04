package com.atguigu.scala0508.day02.highfun

/**
  * Author lzc
  * Date 2019-09-04 11:22
  */
object HighDemo2 {
    def main(args: Array[String]): Unit = {
        //       operation(Array(1,2,3), op)
        
        /*operation(Array(1, 2, 3), (ele: Int) => {
            println(ele)
        })
        
        
        operation(Array(1, 2, 3, 4), (ele: Int) => {
            println(ele * ele)
        })*/
        
        /*operation(Array(1, 2, 3), ele => {
            ele + 1
        })*/
        //        operation(Array(1, 2, 3), ele => ele + 1)
        operation(Array(1, 2, 3), _ + 1)
        
    }
    
    
    def op(ele: Int) = {
        println(ele * ele)
    }
    
    
    def operation(arr: Array[Int], op: Int => Unit) = {
        for (elem <- arr) {
            op(elem)
        }
    }
}

/*
1. 在scala中, 函数式一等公民

对一个函数做什么?
    1. 定义函数
    2. 调用函数
    3. 传递函数

一个函数, 可以接收一个函数作为参数, 这样的函数就叫高阶函数(高阶算子)

接口回调

匿名函数:
    没有名字的函数
    
    () => {
    
    }
传递匿名函数:
    1. 参数的类型可以省略, 会根据形参进行自动的推导
    
    3. 类型省略之后, 只有一个参数, 则圆括号可以省略. 其他的情况:没有参数和参数超过1的永远不能省圆括号
    
    4. 匿名函数如果只有一行, 则大括号也可以省略
 */