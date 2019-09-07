package com.atguigu.scala0508.day04.arr

/**
  * Author lzc
  * Date 2019-09-07 10:27
  */
object ArrayDemo2 {
    def main(args: Array[String]): Unit = {
        val array: Array[Array[Int]] = Array.ofDim[Int](2,3)
        for (arr <- array) {
            for (elem <- arr) {
                println(elem)
            }
        }
    }
}
