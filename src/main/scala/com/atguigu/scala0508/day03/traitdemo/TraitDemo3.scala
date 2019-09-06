package com.atguigu.scala0508.day03.traitdemo

/**
  * Author lzc
  * Date 2019-09-06 15:55
  */
object TraitDemo3 {
    def main(args: Array[String]): Unit = {
        
    }
}

class A1{
    def foo() = {
    
    }
}

trait T1 extends A1{
    override def foo() = {
    
    }
}

class B1 extends A1 with T1

/*

1. trait 可以继承类

 */