package com.atguigu.scala0508.day03.obj

/**
  * Author lzc
  * Date 2019-09-06 09:11
  */
object ObjDemo1 {
    def main(args: Array[String]): Unit = {
        val a = new User("a", 20, "m")
        
        new User()
        new User("")
        //        new User("a", 20)
        
    }
}
class User(var name: String, val age: Int, sex: String) {
    var a: Int = 0
    val b: String = ""
    
    println("aaa")
    println("aaa")
    println("aaa")
    println("aaa")
    
    def this() {
        
        this("lisi", 20, "f")
        //...
    }
    
    def this(name: String) {
        this(name, 20, "f")
        //...
    }
    
    def this(a: Int) {
        this()
        // a只能在这里使用
    }
    
    
    def foo = {
    
    }
}

/*

1. scala也支持构造函数的重载.

2. 其他的构造函数应该使用  def this() = {}

3. 构造函数分两种:
    主构造函数
        1. 只能有一个
        
        2. 他的形参会自动的成为类的属性
    
    辅构造函数
        1. 可以有多个
        2. 首行必须是调用主构造
        3. 他的形参仅仅是一个普通的局部常量
        4. 辅构造调用其他辅构造的时候, 只能后面调用前面的

 */