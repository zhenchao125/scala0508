package com.atguigu.scala0508.day02.obj

import scala.beans.BeanProperty

class User(@BeanProperty var name: String, @BeanProperty val age:Int, sex: String){
    
    
    def foo() ={
        /*val name = "abc"
        println(this.name)*/
//        println(sex)
        println(sex)
    }
}

/*

java中的类:
     1. 如果类是public的, 则必须和文件名一致
     
     2. 一般, 一个.java有一个publci的类
     
 
 */