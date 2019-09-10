package com.atguigu.scala0508.day06.generic

/**
  * Author lzc
  * Date 2019-09-10 10:29
  */
object GenericDemo4 {
    
    implicit val ord: Ordering[User1] = new Ordering[User1]{
        override def compare(x: User1, y: User1): Int = x.age -  y.age
    }
    def main(args: Array[String]): Unit = {
    
        println(foo(User1(20), User1(30)))
        
    }
    
    /*def foo[T](a:T, b:T)(implicit ord: Ordering[T]) = {
        if(ord.gt(a, b)) a else b
    }*/
    
    
    // Ordering[T]  => Ordering[Int]
    def foo[T: Ordering](a: T, b: T) = {
        // 从冥界召唤隐式值
        val ord = implicitly[Ordering[T]]
        if(ord.gt(a, b)) a else b
    }
}

case class User1(age:Int)



/*
泛型:  类型的参数化

泛型类:
    把参数话的类型定义在类上, 这个泛型在整个类都可以使用(当数据的类型来用)


泛型方法:
    把泛型定义在方法上, 这个泛型只能这个方法内使用(当数据的类型来用)
    
泛型的上下限:
    java:
        T super ..
        T extends ...
        
scala的泛型界定:
    
    scala的上界
        T <: Comparable[T]
    
    
    scala的上界
    
    
    上下文界定
    T: Ordering
    
    视图界定(过时)
 */