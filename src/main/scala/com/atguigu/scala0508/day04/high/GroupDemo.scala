package com.atguigu.scala0508.day04.high

/**
  * Author lzc
  * Date 2019-09-07 16:53
  */
object GroupDemo {
    def main(args: Array[String]): Unit = {
        /*val list1 = ListBuffer(30, 50, 7, 6, 1, 20)
        val map = list1.groupBy( x => x % 2 == 1)
        println(map)*/
        
        /*val list1: List[String] = List("hello world", "hello hello", "atguigu atguigu hello")
        val map = list1.flatMap(_.split(" ")).groupBy(word => word).map(kv => (kv._1, kv._2.length))
        println(map)*/
        
        val list = List("hello" -> 2, "hello" -> 3, "atguigu" -> 1, "hello" -> 4)
        
        val groupedMap: Map[String, List[(String, Int)]] = list.groupBy(_._1)
        
        // map[hello, List((hello,2),(hello,3),(hello, 4)]  => map[hello, List(2,3, 4)] => map[hello, 9]
        val temp1: Map[String, Int] = groupedMap.map(kv => {
            val word = kv._1
            word -> kv._2.map(_._2).sum
        })
        println(temp1)
    }
}

/*


 */
