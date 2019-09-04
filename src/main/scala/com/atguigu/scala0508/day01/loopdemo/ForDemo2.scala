package com.atguigu.scala0508.day01.loopdemo

import scala.util.control.Breaks._

/**
  * Author lzc
  * Date 2019-09-03 16:23
  */
object ForDemo2 {
    def main(args: Array[String]): Unit = {
        // 1.to(100,2)
        /*for (elem <- 1 to (100, 2)) {
            println(elem)
        }*/
        
        //        println(100 to (1, -1))
        
        /*for (elem <- 1 to 100 reverse) {
            println(elem)
        }*/
        
        /*val arr = Array(10, 20, 30, 40)
    
        for (elem <- 0 until arr.length) {
            println(arr(elem))
        }*/
        // 守卫
        /*for (m <- 1 to 100 if m % 2 == 1) {
            println(m)
        }*/
        
        // 提前结束循环:
        
        breakable {
            for (i <- 1 to 10) {
                println(i)
                if (i == 5) break
            }
        }
        
        println("aaaa")
    }
}

/*

for不是循环, 是一种遍历. 遍历一种集合, 序列等.



xml: <>

泛型: []

下标: ()



1 to 3          1,2,3
1 until 3       1,2

1 to (10, 2)   1 3 5 ....
1 to (10, 2) reverse  9 7 5...


 */