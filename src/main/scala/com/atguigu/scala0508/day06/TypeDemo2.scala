package com.atguigu.scala0508.day06

/**
  * Author lzc
  * Date 2019-09-10 14:05
  */
object TypeDemo2 {
    def main(args: Array[String]): Unit = {
        val user = new User("lisi", 20)
        println(user("name"))
        
        user("name") = "zhiling"
        println(user.name)
        
        user.unary_!
        !user
        
    }
 
    
}
object User{
    def apply() = {
        println("伴生对象  apply")
    }
}
class User(var name: String, var age:Int){
    // 前置运算符 !user
    def unary_! = {
        println("......")
    }
    
    def foo()={
        println("foo...")
    }
    def apply(propName: String) = {
        if(propName == "name") name
        else if(propName == "age") age
    }
    
    def update(propName: String, v: String) = if(propName == "name") this.name = v
}

/*
Any
AnyVal
AnyRef
Nothing

Option
    空指针问题
    Some
    None
    
Either
    Left
    Right

类型推断:
    1. 推得类型和预期不一致
        val a: Double = 1
    2. 递归函数的返回值不能推导
    
    3. 函数属性如果使用 _ 作为默认值, 不能推导
        class A{
            val a :Int= _
        }
    4. 当显示的使用return, 返回值类型也不能推导
    
_ 使用总结:
    1. 通配符到如包或者类
    2. 匿名函数的省略 _
    3. 部分应用函数
        val sqrt = math.pow(_, 2)
    4. 访问元组的元素
        t._1, ....
        
    5. 模式匹配中的统配匹配
    
    6. 利用 _ 去给属性设置默认值 (数字: 0, 对象: null, boolean false)
    
    7. 传递函数, 而不是调用函数
        def foo(){  }
        
        val f = foo _
    8. 异常catch
    
    9. 分解操作:  rest: _*  rest@_*
    
    10. 用于定义标识符中包含 :   foo_:
    
 
 方法的约定:
    运算符结合性
    
    :
    
 apply和update:
  
  apply:
    1. 在伴生对象中
       伴生对象(...) 其实就是在调用伴生对象的apply方法
    2. 在伴生类中
        val user = new User("lisi", 20)
        user("name")
        
     3. 用apply去调用方法
    
    
   update:
          ...
   
    
    
    
    
    
    
    
    
    
    
    
 
 
 
 
 
 

 */