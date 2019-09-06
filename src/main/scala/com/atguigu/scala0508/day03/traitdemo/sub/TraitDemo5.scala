package com.atguigu.scala0508.day03.traitdemo.sub

object TraitDemo5 {
    def main(args: Array[String]): Unit = {
        val c:C = new C
        val a:A = new C
        // 动态混入
        val b:B = new C with B
    }
}
trait A
trait B
class C extends A