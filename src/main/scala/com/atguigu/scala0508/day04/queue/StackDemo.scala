package com.atguigu.scala0508.day04.queue

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019-09-07 11:19
  */
object StackDemo {
    def main(args: Array[String]): Unit = {
        val stack = mutable.Stack(10,20,30)
        stack.push(100)  // 入栈;  (栈顶)
        println(stack)
        val ele: Int = stack.pop()
        println(ele)
        println(stack)
    }
}
/*

 */