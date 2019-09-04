package com.atguigu.scala0508.day02.highfun

/**
  * Author lzc
  * Date 2019-09-04 14:11
  */
object HighDemo3 {
    def main(args: Array[String]): Unit = {
        //       val arr =  map(Array(1,2,3,4), x => x * x * x)
        /*val arr =  map[Int, String](Array(1,2,3,4), x => x + "a")
         println(arr.mkString(", "))*/
        
        //        val arr =  filter(Array(1,2,3,4), x => x % 2 == 1)
        /*val arr = filter(Array(1, 2, 3, 4), _ % 2 == 1)
        println(arr.mkString(", "))*/
//        val result = reduce(Array(1, 2, 3, 4), (x, y) => x + y)
        val result = reduce(Array(1, 2, 3, 4), _ +  _)
        println(result)
        
    }
    
    def reduce(arr: Array[Int], op: (Int, Int) => Int) = {
        var init = arr(0)
        for (elem <- 1 until arr.length) {
            init = op(init, arr(elem))
        }
        init
    }
    
    
    def filter(arr: Array[Int], op: Int => Boolean) = {
        for (i <- arr if op(i)) yield i
    }
    
    
    /*def map[T, S](arr: Array[T], op: T => S)  = {
        for (i <- arr) yield op(i)
    }*/
    
    /*def map(arr: Array[Int], op: Int => Int)  = {
        for (i <- arr) yield op(i)
    }
    */
}

/*
map:
    进1出1

 */
