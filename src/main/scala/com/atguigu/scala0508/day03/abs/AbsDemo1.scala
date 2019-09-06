package com.atguigu.scala0508.day03.abs

/**
  * Author lzc
  * Date 2019-09-06 11:31
  */
object AbsDemo1 {
    def main(args: Array[String]): Unit = {
//        new Person("", 10)
        
        // 创建匿名内部类对象:
        /*new Human("abc") {
            override val age: Int = 10
            override var sex: String = _
            override val a: Int = 10
        
            override def say(a: Int): Int = ???
        }*/
    }
}

abstract class Human(val name: String) {
    val age: Int
    var sex: String
    val a: Int
    
    def say(a: Int): Long
    
    
}


class Person(override val name: String,override val age: Int) extends Human(name) {
    override var sex: String = _
    override val a: Int = 0
    
    override def say(a: Int): Long = {
        println("say...")
        1
    }
}
/*
java:
    数字类型:默认值 0
    引用类型:默认值是 null
    boolean类型: 默认是 false


抽象类:
    普通类有, 抽象都可以有.
    
    抽象方法和抽象字段(属性)
        抽象字段: 只声明, 不初始化的字段
        抽象方法: 只有签名, 没有实现



属性:(property)
    age  spark() 都是 property
    
 age:  field 域 字段  成员变量
 spark method
 
 java:
    方法的覆写规则
    
    2同2小1大
    2同: 方法名和参数列表
    2小: 返回值类型, 抛的异常
    1大: 权限修饰符
 

 */