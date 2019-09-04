package com.atguigu.scala0508.day02.highfun

/**
  * Author lzc
  * Date 2019-09-04 16:15
  */
object ControlAbs2 {
    def main(args: Array[String]): Unit = {
        runInThread{
            //...
            println(Thread.currentThread().getName)
        }
        
        runInThread{
            //....
        }
    }
    
    def runInThread(f: => Unit) ={
        new Thread(){
            override def run(): Unit = f
        }.start()
    }
}
/*
写一个函数, 可以运行一段代码在一个子线程中


 */