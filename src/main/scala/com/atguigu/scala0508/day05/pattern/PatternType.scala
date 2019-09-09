package com.atguigu.scala0508.day05.pattern

/**
  * Author lzc
  * Date 2019-09-09 15:08
  */
object PatternType {
    def main(args: Array[String]): Unit = {
        val s = List(1, 2, "a", "abc", "+", "-", true)
        
        /*for(c <- s){
            c match {
                case a: Int => println(a + 1)
                case "+" => println(1)
                case "-" => println(1)
                case a => println(a)
            }
        }*/
        
        for (c <- s) {
            c match {
                // 匹配类型
                case a: Int => println(a + 1)
                // 添加守卫
                case op: String if op == "+" || op == "-" => println(1)
                case a => println(a)
            }
        }
    }
}
