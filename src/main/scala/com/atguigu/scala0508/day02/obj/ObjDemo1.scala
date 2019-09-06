package com.atguigu.scala0508.day02.obj

object ObjDemo1 {
    def main(args: Array[String]): Unit = {
        
        val user = new User("lisi", 20, "f")
        println(user.name)  // get
        println(user.age)
        user.name = "aaa"  // set
//        user.age = 30
        println(user)
        user.foo
//        user.sex
        println(user.getName)
        println(user.name)
    }
}
