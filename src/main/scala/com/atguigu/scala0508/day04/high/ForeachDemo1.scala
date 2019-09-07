package com.atguigu.scala0508.day04.high

object ForeachDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        
        list1.foreach(x => {
            println(x)
        })
        
    }
}
/*
遍历集合中的每个元素!!!

 */