package com.atguigu.scala0508.day06.generic

/**
  * Author lzc
  * Date 2019-09-10 10:29
  */
object GenericDemo2 {
    def main(args: Array[String]): Unit = {
        /*println(max("a", "b"))*/
        println(max(User(10), User(20)))
        
        List(1).sorted
        
    }
    
    def max[T <: Ordered[T]](first: T, second: T): T = {
        /*if(first.compareTo(second) >= 0) first
        else second*/
    
        if(first > second) first
        else second
    }
}

case class User(age:Int) extends Ordered[User]{
    override def compare(that: User): Int = this.age - that.age
}



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
    
    
    scala的下界
        T >: Comparable[T]
    
    上下文界定
        T : M
        
        必须一定会有一个隐式值 M[T]
    
    
    视图界定(过时)
 */