package com.atguigu.scala0508.day05.homework

import scala.io.Source

/**
  * Author lzc
  * Date 2019-09-09 08:12
  */
object Homework2 {
    def main(args: Array[String]): Unit = {
        //        work1()
        //        work2()
        //        println(work3("Helloee"))
//        println(work4(List(1,2,3,4), "?"))
        println(work5())
    }
    
    def work5() = {
        /*5. 实现一个 scala 版的 wordcount
        , 然后读取文件实现
        Source.*/
        val path = "C:\\Users\\lzc\\Desktop\\class_code\\2019_05_08\\01_scala\\scala0508\\src\\main\\scala\\com\\atguigu\\scala0508\\day05\\homework\\Homework1.scala"
        
        val lines= Source.fromFile(path).getLines().toList
        lines
            .flatMap(_.split("\\W+"))
            .filter(_.trim.length > 0)
            .groupBy(x => x)
            .map(kv  => (kv._1, kv._2.length))
            .toList
            .sortBy(kv => {
                (kv._2, kv._1.length)
            })(Ordering.Tuple2(Ordering.Int.reverse, Ordering.Int))
    }
    
    
    def work4(list: List[Int], sep: String) = {
        //4. 实现一个函数，作用与mkString相同，使用foldLeft
        list.foldLeft("")((last, s) => {
            last + sep + s
        }).substring(sep.length)
        
//        list.head + list.tail.foldLeft("")(_ + sep + _)
        
    }
    
    
    def work3(s: String) = {
        /*
        3. 编写一个函数, 接收一个字符串, 返回一个 Map.
            比如: indexes("Helloee")
        
           返回: Map(H->{0}, e -> {1, 5, 6}, ...)   数字其实是下标
         */
        /* s.zipWithIndex.groupBy(_._1).map(kv => {
             (kv._1, kv._2.map(_._2))
         })*/
        s.zipWithIndex.groupBy(_._1).map(kv => {
            (kv._1, "{" + kv._2.unzip._2.mkString(",") + "}")
        })
        
    }
    
    def work1() = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        //        val max = list1.reduce((a, b) => if(a > b) a else b)
        //        val max = list1.reduce((a, b) => a.max(b))
        val max = list1.reduce(_.max(_))
        println(max)
    }
    
    def work2() = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        val maxMIn = list1.foldLeft((Int.MinValue, Int.MaxValue))((maxMin, x) => (maxMin._1.max(x), maxMin._2.min(x)))
        println(maxMIn)
        
    }
    
}


/*
1. 使用 reduce 计算集合中的最大值

2. 使用 foldLeft 同时计算最大值和最小值

3. 编写一个函数, 接收一个字符串, 返回一个 Map.
    比如: indexes("Helloee")

   返回: Map(H->{0}, e -> {1, 5, 6}, ...)   数字其实是下标

4. 实现一个函数，作用与mkString相同，使用foldLeft

5. 实现一个 scala 版的 wordcount
   , 然后读取文件实现
   Source.
 */