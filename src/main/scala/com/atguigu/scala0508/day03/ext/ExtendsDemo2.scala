package com.atguigu.scala0508.day03.ext

import com.atguigu.{A, B}

/**
  * Author lzc
  * Date 2019-09-06 10:25
  */
object ExtendsDemo2 {
    def main(args: Array[String]): Unit = {
        val b = new B
        
    
    
    }
}

class AA(val n: Int) {
    /*def this(){
        this(10)
    }*/
}

class BB() extends AA(1) {
    
    override val n: Int = 100
    
//    override var a: Int = 100
}


/*
面向对象三大特征:
    1. 封装
    
    2. 继承
        单继承
        
    3. 多态
        编译时类型
        
        运行时类型
        
        编译时类型和运行时类型不一致就是多态
        1. 编译能否通过看编译时类型
        2. 执行的具体表现, 看运行时类型
        
        
继承:
 1. 方法的覆写, 必须添加override关键
 
 2. 属性的覆写:
        1. val 只能覆写val和没有参数的def
        
        2. var 只能覆写抽象的var
 
 
 3. 继承的时候构造器的调用:
    1. 子类的主构造才有权利去调用父类的构造(主或者辅)

 */