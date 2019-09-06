package com.atguigu.scala0508.day03.single

/**
  * Author lzc
  * Date 2019-09-06 14:29
  */
object SingleDemo2 {
    def main(args: Array[String]): Unit = {
        val dog = Dog("red") // === Dog.apply("red")
        dog.speak()
        
        val arr = Array("abc", "a")
        
        
        
    }
}


object Dog {
    def foo() = {
        val dog = new Dog("red")
        dog.speak()
    }
    
    def apply(color: String) = new Dog(color)
    
    def apply(color: String, age: Int) = new Dog(color)
}

class Dog(val color: String) {
    
    
    def speak() = {
        println("speak")
    }
}

/*
object Dog 是 Dog这个类的伴生对象
class Dog 是Dog这个对象的伴生类

1. 伴生类和伴生对象必须位于同一个文件中!!!
2. 可以互相访问对方私有成员


伴生对象中的apply方法:
    一般是在这个方法内返回伴生类的对象
    
    伴生对象(参数) ==== 伴生对象.apply(参数)
 */