package com.atguigu.scala0508.day05.pattern

/**
  * Author lzc
  * Date 2019-09-09 16:19
  */
object PatternObj2 {
    def main(args: Array[String]): Unit = {
        val names = "lisi,za,ww,zhiling"
        
        names match {
            case Names(one, "a", a@_*) => println(one)
        }
    }
}

object Names{
    // 匹配序列
    def unapplySeq(s: String) = {
    if(s.length == 0) None
    else Some(s.split(","))
}
}
/*


 */

