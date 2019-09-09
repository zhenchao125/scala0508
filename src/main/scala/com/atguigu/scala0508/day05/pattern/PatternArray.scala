package com.atguigu.scala0508.day05.pattern

/**
  * Author lzc
  * Date 2019-09-09 15:31
  */
object PatternArray {
    def main(args: Array[String]): Unit = {
        val arr: Any = Array(10, 20, 30, 20, 20)
        
        arr match {
            //            case Array(10,20,30) => println("Array(10,20,30)...")
            //            case Array(10, _, _) => println("Array(10,_,_)...")
            //            case Array(10, a, _) => println(s"Array(10,$a,_)...")
            //            case Array(10, _*) => println("Array(10, _*)")
            case Array(10, a@_*) => println("Array(10, _*)" + a.mkString(", "))

            case _ =>
        }
    }
}

/*
匹配对象:
    匹配数组的内容:


 */