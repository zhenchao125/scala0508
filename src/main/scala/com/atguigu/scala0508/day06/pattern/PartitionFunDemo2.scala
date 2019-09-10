package com.atguigu.scala0508.day06.pattern

/**
  * Author lzc
  * Date 2019-09-10 09:04
  */
object PartitionFunDemo2 {
    def main(args: Array[String]): Unit = {
        //       val list = List(1, 2, 4, "abc", false)
        /*val list2 =  list.map({
             case a: Int => a * a
         })
         println(list2)*/
        
        // filter + map
        /* val list2 = list.collect({
             case a:Int => a * a
         })
         println(list2)*/
        
        
        val map = Map(1 -> (2, 20), 10 -> (20, 30), 20 -> (30, 40))
        
        val map1 = map.map {
            case (k, (_, v)) => (k, v)
        }
        println(map1)
        
//        foo(10)
        (foo _)(10)
        (foo _).apply(10)
        val f = foo _
        f.apply(100)
    }
    
   def foo(a: Int) = {
       println(a)
   }
    
}

/*
如果定义一个偏函数:
    用一对大括号括起来的一系列的case 语句, 就是一个偏函数

 */