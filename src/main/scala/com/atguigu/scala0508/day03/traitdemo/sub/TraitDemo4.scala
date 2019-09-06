package com.atguigu.scala0508.day03.traitdemo.sub

object TraitDemo4 {
    def main(args: Array[String]): Unit = {
        val console = new Console
        console.log()
    }
}

/*trait Logger extends Exception{
    def log() ={
        println(getMessage)
    }
}*/

trait Logger {
    // 自身类型. 强制Logger的子类, 必须继承Exception或者Exception的子类
//    this: Exception =>
    _: Exception =>
    
    def log() = {
        println(getMessage)
    }
}

class Console extends RuntimeException with Logger

/*
1. trait 继承类
2. selfType 自身类型

3. 特质的动态叠加
 */
