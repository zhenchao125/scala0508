package com.atguigu.scala0508.day04.arr

object ArrayDemo1 {
    def main(args: Array[String]): Unit = {
        // 创建方式1:
//        val arr: Array[Int] = new Array[Int](10)
        var arr: Array[Int] = Array[Int](1,10,20)
        arr.size
        
        /*arr(0) = 100
        println(arr(0))
        println(arr.length)
        println(arr.size)*/
        
        arr :+= 100
        println(arr.length)
    }
}
/*
数组:
    定长数组
        底层就是java的数组
        
        1. new Array[类型](长度)
        
        2. 通过初始化元素的个数来直接确定数组的长度
            Array(1,2,3)
    
    可变数组

当去修改一个不可变集合的时候, 会重新生成一个新的集合, 并自动给你返回

 */
