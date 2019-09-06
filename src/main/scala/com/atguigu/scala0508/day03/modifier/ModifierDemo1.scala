package com.atguigu.scala0508.day03.modifier

/**
  * Author lzc
  * Date 2019-09-06 13:56
  */
object ModifierDemo1 {
    def main(args: Array[String]): Unit = {
    
    }
}
class A{
    private[modifier] def foo() ={
    
    }
    
    foo()
}
class B extends A {
    /*private val a = new A
    a.foo   // 不允许*/
    
    /*super.foo()
    foo()*/
    
    
    val a = new A
    a.foo()
}

/*

java:
    public  protected(子父类, 同包)   默认(friendly) private

scala:
    
    3种:
    
        默认(public, 没有这个关键字)
        
        protected
            : 只能子父类.  同包内也不能访问
        
        private
    
        定制 private[包]
    
  
类  对象  抽象类   继承 ....

静态:
    

 */