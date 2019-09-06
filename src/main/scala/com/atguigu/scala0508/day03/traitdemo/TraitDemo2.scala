package com.atguigu.scala0508.day03.traitdemo

object TraitDemo2 {
    def main(args: Array[String]): Unit = {
        val abc = new ABC
        abc.foo
    }
}

trait F{
    println("f")
    
    def foo= {
        println("f foo")
    }
}

trait A extends F{
    println("a")
   override def foo= {
        println("a foo")
    }
}

trait B extends F{
    println("b")
    
    override def foo = {
        println("b foo")
    }
}

trait C extends F{
    println("c")
    override def foo= {
        super[F].foo
        println("c foo")
    }
}


class ABC extends A with B with C{
    println("abc")
    
    /*override def foo= {
        println("abc foo")
    }*/
}