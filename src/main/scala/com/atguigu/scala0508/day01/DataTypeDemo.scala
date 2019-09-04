package com.atguigu.scala0508.day01

/**
  * Author lzc
  * Date 2019-09-03 14:12
  */
object DataTypeDemo {
    def main(args: Array[String]): Unit = {
        val s:String = ""
        
        val a: Unit = foo()
        println(a)
        
        val b = ()
        
        val s1:String = null
        val s2: Object = null
       // Null
    }
    
    def foo(): Unit = {}
}

/*
java的数据类型:
    基本类型
        8大基本
        
        byte
        short
        char
        int
        long
        double
        float
        
        boolean
    
    
    引用类型(对象类型)
    
    
scala:
        Any

AnyVal       AnyRef
Int           java中所有对象, ...
Byte
Short
    ...
    
    
java中的string和scala中的string: 完全一样!


java: void
scala: Unit  打印一对圆括号()
    他只有一个值, 就是()
    
    
Null 只有一个值 null
    
 */