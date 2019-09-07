package com.atguigu.scala0508.day04.set

/**
  * Author lzc
  * Date 2019-09-07 13:58
  */
object SetDemo1 {
    def main(args: Array[String]): Unit = {
        /*var set1 = Set(10,20,10,30,30, 10)
        set1 += 100
        set1 -= 10
        set1 ++= List(10, 1,2)
        println(set1)*/
        //        var set1 = mutable.Set(20, 30, 10, 1)
        //        println(set1)
        
        //        println(toDuplicate(List(1, 1, 2, 3, 4)))
        
        val set1 = Set(30, 50, 70, 60, 10, 20)
        val set2 = Set(30, 50, 7, 6, 10, 2)
        
        // 并集
        println(set1 ++ set2)
        println(set1.union(set2))
        println(set1 | set2)
        // 交集
        println(set1 & set2)
        println(set1.intersect(set2))
        // 差集
        println(set1 &~ set2)
        println(set1 -- set2)
        println(set1.diff(set2))
        
    }
    
    def toDuplicate(list: List[Int]) = {
        /*(Set[Int]() ++ list).toList*/
        list.toSet.toList
    }
}

/*
无序不可重复
 */