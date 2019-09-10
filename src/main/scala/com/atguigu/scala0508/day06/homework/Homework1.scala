package com.atguigu.scala0508.day06.homework

import scala.reflect.ClassTag

/**
  * Author lzc
  * Date 2019-09-10 07:58
  */
object Homework1 {
    def main(args: Array[String]): Unit = {
        println(swap(Array(1, 2, 3, 4)).mkString(","))
        //        println(swap(Array(1)).mkString(","))
        //        foo()
    }
    
    
    def swap(arr: Array[Int]) = arr match {
        
//        case Array(a, b, rest@_*) => Array(b,a, rest: _*)   // 有误
        //        case Array(a, b, rest@_*) => Array(b, a) ++ rest
        case _ => arr
    }
    
    
    def foo() = {
        val a = 5
        a match {
            case 3 => 3 * 3
            case 4 => 4 + 4
            case _ =>
        }
    }
}

/*
1. 对前面 wordcount 的结果, 按照单词的个数降序排列,如果个数相同按照单词的长度升序排列
2. 利用模式匹配，编写一个 swap 函数，交换数组中前两个元素的位置，前提条件是数组长度至少为2
3. 定义一个 ! 操作符, 计算某个整数的阶乘. 比如 5! 应该得到 120
4. 定义一个操作符 +% , 可以将一个给定的百分百添加到某个值
    比如 120 +% 10  应该得到 132
 */