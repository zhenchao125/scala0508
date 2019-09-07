package com.atguigu.scala0508.day04.high

/**
  * Author lzc
  * Date 2019-09-07 16:09
  */
object ScanDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        //        val list2: List[Int] = list1.scanLeft(100)(_ + _)
        val list2 = list1.scanRight(100)(_ + _) // ... 130 120 100
        println(list2)
    }
}

/*
scan 扫描
fold的扩展版本
 */