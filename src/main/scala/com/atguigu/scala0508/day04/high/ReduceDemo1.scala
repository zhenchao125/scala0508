package com.atguigu.scala0508.day04.high

object ReduceDemo1 {
    def main(args: Array[String]): Unit = {
        //        val list1 = List(30, 50, 70, 60, 10, 20)
        //        val result = list1.reduce((x, y) => x + y)
        //        val result = list1.reduce(_ + _)
        //        println(result)
        
        val ss = List("a", "b", "c")
        //        println(ss.reduce((x, y) => x + "-" + y))
        println(ss.reduce(_ + "-" + _))
    }
}

/*
reduce:
 

 */
