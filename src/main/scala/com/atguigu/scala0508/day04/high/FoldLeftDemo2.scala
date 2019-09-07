package com.atguigu.scala0508.day04.high

/**
  * Author lzc
  * Date 2019-09-07 15:39
  */
object FoldLeftDemo2 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
//        val result: Int = (0 /: list1)(_ + _)  // foldLeft
        val result = (list1 :\ 0)(_ + _)
        println(result)
    }
}

/*
折叠:  fold
foldLeft

 */