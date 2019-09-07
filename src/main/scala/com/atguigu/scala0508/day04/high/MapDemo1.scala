package com.atguigu.scala0508.day04.high

object MapDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        val list2 = list1.map(x => (x, x * x, x * x * x))
        println(list2)
    }
}
/*
map的作用: 用来调整数据类型

foreach, map

map:  一个结合map之后, 他的长度不会增加也不会减少

 */