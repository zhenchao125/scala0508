package com.atguigu.scala0508.day01.opatation

object OptDemo1 {
    def main(args: Array[String]): Unit = {
        /*val s = ""
        val a: String = "a" + s
        val b: String = "a" + s
    
        println(a.eq(b))*/
        
        val i: Int = 2 + 3  // 2 + 3
        println(i)
    
        println(2 toString)
        
        
    }
}

/*
在scala中其实是没有任何的运算符的!

1. 当调用对象的方法时候, . 可以省略, 如果参数只有一个, 或者没有, ()也可以省略



经典除:
     10 / 3 = 3
     
真除:
    10 / 3 = 3.3333... (python)
    
    10 // 3 = 2 (python的经典)


java:
    ==
    基本
        值
    
    引用
        地址值
        
     equals  "等"

scala:
    ==
        更加的类似于java中的equals
        
    
    java中的 == 用 在scala中使用 eq()
    

++  --  ?:

a++  a += 1
a--  a -= 1

?:   if()...
    
 */