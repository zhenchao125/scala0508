package com.atguigu.scala0508.day03.traitdemo.sub

/**
  * Author lzc
  * Date 2019-09-06 16:35
  */
object PckDemo1 {
    def main(args: Array[String]): Unit = {
        Predef.println("aaaa")
        import scala.math._
        abs(11)
        
        val user = new User
        import user._
        foo()
        foo1()
    }
}
class User{
    def foo() = {}
    def foo1() = {}
    def foo2() = {}
}


/*
默认导入:
 java.lang._
 scala._
 scala.Predef._

 */