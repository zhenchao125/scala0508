package com.atguigu.scala0508.day04.map

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019-09-07 11:27
  */
object MapDemo3 {
    def main(args: Array[String]): Unit = {
        var map = mutable.Map("a" -> 97, "b" -> 98, "d" -> 100, "c" -> 99, "d" -> 99)
//        map += (("z", 108))
        println(System.identityHashCode(map))
        map += "z" -> 108
        println(System.identityHashCode(map))
        
        println(map)
        map.getOrElseUpdate("x", 200)  // 只能可变
        println(map)
    }
}

/*


 */