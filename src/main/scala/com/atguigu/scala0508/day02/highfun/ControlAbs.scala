package com.atguigu.scala0508.day02.highfun

/**
  * Author lzc
  * Date 2019-09-04 15:44
  */
object ControlAbs {
    def main(args: Array[String]): Unit = {
        /*def f = () => {
            println("f...")
            10
        }
        
        foo(f())
        
        foo(3 + 4)*/
        
        foo {
            println("aaaaa")
        }
    }
    
    def foo(a: => Unit) = {
        println(a)
        println(a)
        println(a)
    }
}

/*

控制抽象

----


值调用:
    把计算后的值传递过去
    

名调用:
    把代码传递过去



 */