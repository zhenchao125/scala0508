package com.atguigu.scala0508.day03.pck

/**
  * Author lzc
  * Date 2019-09-06 09:58
  */
object PckDemo1 {
    def main(args: Array[String]): Unit = {
        
    }
}

// com.atguigu.scala0508.day03.pck
class A {

}

// com.atguigu.scala0508.day03.pck.sub
package sub {
    
    class B {
    
    }
    
    package sub1 {
        class C{
            def foo = {
                val b:B = null
            }
        }
    }
}

/*

1. 声明包
    1. 和java一样
    2. 包语句
        package a{
        
        }

2. 导包
 


 */