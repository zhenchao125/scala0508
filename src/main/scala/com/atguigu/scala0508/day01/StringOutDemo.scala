package com.atguigu.scala0508.day01

import scala.io.StdIn

/**
  * Author lzc
  * Date 2019-09-03 11:38
  */
object StringOutDemo {
    def main(args: Array[String]): Unit = {
        //        val a = 20
        //        printf("a的的值是: %d  %.2f %s", a, 20.889, "abc")
        
        val name = "zs"
        val age = 20
        val s =
            s"""
               |select
               |	name,
               |	age,
               |	sex
               |from user
               |where name='${name}' and age=${age + 2}
            """.stripMargin
        println(s)
        
        val a = s"name = $name adflkdsjal "
        println(a)
       
        val line = StdIn.readLine("请输入你的银行卡密码:")
        println(line)
        
    }
    
}

/*
1. java 输出
2. println()
3. printf

4. 字符串模板
    原始字符串
    
    模板

new BufferedReader(new InputStreamReader(System.in))
Scanner(System.in)

 */