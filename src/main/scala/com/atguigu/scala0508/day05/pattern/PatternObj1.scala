package com.atguigu.scala0508.day05.pattern

/**
  * Author lzc
  * Date 2019-09-09 16:19
  */
object PatternObj1 {
    def main(args: Array[String]): Unit = {
        val user: Any = new User("lisi", 20)
        
        /*user match {
            case User(name, _) => println(name)
        }*/
        
        val User(name, _) = user
        println(name)
    }
}
/*object User{
    def unapply(arg: User): Option[(String, Int)] = Some((arg.name, arg.age))
    
}*/

// 样例类
case class User(val name: String, val age:Int)
class User1(val name: String, val age:Int)
