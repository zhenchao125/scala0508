package com.atguigu.scala0508.day01.loopdemo

/**
  * Author lzc
  * Date 2019-09-03 16:23
  */
object ForDemo1 {
    def main(args: Array[String]): Unit = {
        /*val s = "abcd"
        for(c <- s){
            println(c.getClass.getSimpleName)
        }*/
        
        val arr = Array(10, 20, 30, 40)
        
        /*for(n <- arr){
            println(n)
        }*/
        for (i <- 0 to (arr.length - 1)) {
            println(arr(i))
        }
    }
}
/*

for不是循环, 是一种遍历. 遍历一种集合, 序列等.



xml: <>

泛型: []

下标: ()


 */