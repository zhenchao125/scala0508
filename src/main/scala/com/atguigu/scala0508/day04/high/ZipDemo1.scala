package com.atguigu.scala0508.day04.high

/**
  * Author lzc
  * Date 2019-09-07 16:24
  */
object ZipDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20, 100, 200)
        val list2 = List(3, 5, 7, 6, 1, 2)
        
        // zip 将来得到的集合长度, 以少的为准
        //        val list3: List[(Int, Int)] = list1.zip(list2)
        // 以多的为准
        //       val list3 =  list1.zipAll(list2, -1, -2)
        
        // 元素和下标进行拉链
        val list3: List[(Int, Int)] = list1.zipWithIndex
        val list4 = list3.filter(_._2 % 2 == 1).map(_._1)
        println(list4)
        
    }
}

/*
拉链:
 


 */