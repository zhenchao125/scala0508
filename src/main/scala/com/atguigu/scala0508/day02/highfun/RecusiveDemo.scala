package com.atguigu.scala0508.day02.highfun

/**
  * Author lzc
  * Date 2019-09-04 15:36
  */
object RecusiveDemo {
    def main(args: Array[String]): Unit = {
        println(jiecheng(10))
    }
    
    def jiecheng(n: Long): Long = {
        if (n == 1) throw new RuntimeException
        else n * jiecheng(n - 1)
    }
}

/*
自己调用自己

1. 中止条件

2. 靠近中止条件

尾递归:
 
 */
