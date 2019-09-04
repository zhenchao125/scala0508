package com.atguigu.scala0508.day01.ifdemo

/**
  * Author lzc
  * Date 2019-09-03 15:34
  */
object IfDemo1 {
    def main(args: Array[String]): Unit = {
        /*val a = 3
        val b = if (a > 3) {
            10
        } else {
            20
            100
        }
        println(b)*/
        
        /*val m = 30
        val n = 20
        
        val max = if(m > n) m else n
        println(max)*/
        
        /*val m = -40
        val r =  if(m >= 0) math.sqrt(m) else throw new IllegalArgumentException*/
        
        
        /* var aa: Any = 3
         var bb = 4
         aa = (bb = 5)
         println(aa)*/
        
        var aa = 3
        println(aa = 4)
    }
}

/*

在scala中, 所有的语法结构都值和类型,  最后一行代码的值, 就是语法结构的值

赋值语句的值是 Until

顺序
分支
    java
            if
                 ...
            
            
            switch(x){
             case 常量:
              break;
            }
            1. x 类型: byte short char int String enum
              case后面必须是常量
              
            2. case穿透
            
循环
    java
            while
            do...while
            for
            
    scala:
          while
          do...while
          
          for: 本质不是循环, 而是一种遍历
    
   
 */
