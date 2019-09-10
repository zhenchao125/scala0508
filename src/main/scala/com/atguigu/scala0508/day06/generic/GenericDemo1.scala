package com.atguigu.scala0508.day06.generic

/**
  * Author lzc
  * Date 2019-09-10 10:29
  */
object GenericDemo1 {
    def main(args: Array[String]): Unit = {
        val p1 = new Point[Int](1,2)
        
    }
}

class Point[T](val x: T, val y: T){
    var a = x
    
    def foo(a: T): T ={
        a
    }
}

/*
泛型:  类型的参数化

泛型类:
    把参数话的类型定义在类上, 这个泛型在整个类都可以使用(当数据的类型来用)


泛型方法:
    把泛型定义在方法上, 这个泛型只能这个方法内使用(当数据的类型来用)
 */