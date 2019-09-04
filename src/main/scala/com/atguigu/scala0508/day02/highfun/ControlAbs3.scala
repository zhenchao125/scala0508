package com.atguigu.scala0508.day02.highfun

/**
  * Author lzc
  * Date 2019-09-04 16:15
  */
object ControlAbs3 {
    def main(args: Array[String]): Unit = {
        var i = 2
        myWhile(i <= 100){
            println(i)
            i += 1
        }
    }
    
    def myWhile(condition: => Boolean)(op: => Unit): Unit = {
        if(condition){
            op
            myWhile(condition)(op)
        }
    }
}

/*
myWhile


 */