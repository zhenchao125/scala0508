package com.atguigu.scala0508.day06.exception

/**
  * Author lzc
  * Date 2019-09-10 10:14
  */
object ExceptionDemo1 {
    def main(args: Array[String]): Unit = {
        try {
//            val a = 1 / 0
            throw new IllegalArgumentException("你犯法了")
        }catch{
            case e: ArithmeticException => println(e)
            case e: RuntimeException => println(e)
            case e: Exception => println(e)
            case _ =>
        }finally {
            println("finally")
        }
        
        println("aaa")
    
       try{
           foo("abc")
       }catch {
           case e:NumberFormatException => println("字符串的格式不对")
       }
    }
    
    @throws(classOf[NumberFormatException])
    def foo(a: String)  = {
        a.toInt
    }
    
    
}

/*
java:
    编译时(受检异常)
        代码中必须处理:
            try
            
            catch
            
            finally
            
            
            抛
                抛声明
                    throws 异常类, 异常类
                
                抛对象
                    throw 异常对象
    
        运行时
            预计有异常, 可以提前处理.
            
                ...
                
scala:
 
 
 */
