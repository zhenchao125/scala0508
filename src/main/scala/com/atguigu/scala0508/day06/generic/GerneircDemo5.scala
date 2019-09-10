package com.atguigu.scala0508.day06.generic

/**
  * Author lzc
  * Date 2019-09-10 11:36
  */
class A

class B extends A

class C[-T](){
    
    /*def foo(a: T) = {}*/
    
}

object GerneircDemo5 {
    def main(args: Array[String]): Unit = {
        /*val arr1: Array[Int] = Array(10, 20)
        
        val arr2: Array[Double] = arr1*/
        
        /*val bs: Array[B] = Array(new B)
        val as: Array[A] = bs*/
        
        
//        val ca: C[A] = new C[B]
        val cb:C[B] = new C[A]
        
//        val list:List[A] = List[B]()
    }
}

/*
泛型的三变:
    不变
      不能把子类型对象的的集合, 赋值父类型的集合
      
      在java中只有不变
      
      [T]
    协变
       能把子类型对象的的集合, 赋值父类型的集合
        [+T]
    逆变
       能把父类型对象的的集合, 赋值子类型的集合
        [-T]
        
    逆变点和协变点


 */