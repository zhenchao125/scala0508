package com.atguigu.scala0508.day04.high

/**
  * Author lzc
  * Date 2019-09-07 14:38
  */
object FlatMapDemo {
    def main(args: Array[String]): Unit = {
        //  val list1 = List("hello world", "atguigu hello", "hello hello hello")
        //        val list2 = list1.map(x => x.split(" ").toList)
        // val list2 = list1.flatMap( x=> x.split(" "))
        // println(list2)
        
       // val list1 = List(30, 50, 70, 60, 10, 20)  // (20,900, 27000,...)
       // println(list1.flatMap(x => Array(x, x * x, x * x * x)))
       
       val s = "abc"
        println(s.flatMap(s => {
            Array(s, s.toUpper)
        }))
    }
}

/*
flatMap:
    flatMap 会增加集合长度
    
   传进去的函数的返回值必须是一个集合
    
map  flatMap

    看结果集合的长度是否变换
 */