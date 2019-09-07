package com.atguigu.scala0508.day04.high

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019-09-07 15:39
  */
object FoldLeftDemo1 {
    def main(args: Array[String]): Unit = {
        /*val list1 = List(30, 50, 70, 60, 10, 20)
        println(list1.foldLeft("")(_ + _))*/
        
        // hello -> 4  world->1 ,,
        val list1: List[String] = List("hello world", "hello hello", "atguigu atguigu hello")
        val words: List[String] = list1.flatMap(_.split(" "))
        // 使用不可变map
        /*val map: Map[String, Int] = words.foldLeft(Map[String, Int]())((map, word) => {
            val value: Int = map.getOrElse(word, 0) + 1
            map + (word -> value)
        })*/
        // 使用可变map
        val map = words.foldLeft(mutable.Map[String, Int]())((map, word) => {
            val value: Int = map.getOrElse(word, 0) + 1
            map += (word -> value)
        })
        println(map)
        
    }
}

/*
折叠:  fold
foldLeft

 */