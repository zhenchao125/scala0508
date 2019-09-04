package com.atguigu.scala0508.day02.fun

object FunDemo2 {
    def main(args: Array[String]) {
       
       /* println(add(1))
        println(add(1, 2))
        println(add(1, 2, 3))*/
        
        //
        println(add( Array(1, 2): _*))
        println(add(1 to 100: _*))
    }
    
    def add(arr: Int*) = {
        
        var sum = 0
        for (elem <- arr) {
            sum += elem
        }
        sum
    }
    
    
}

/*
函数的签名:
    def add(a:Int, b:Int) : Int
    
    三要素: 函数名 形参列表  返回值类型
    
函数体:

    
1. 函数体内可以没有return, 这个时候会自动的把最后一行代码的值返回

2. 返回值类型也可以省略(: 和返回值类型一起省略), scala会根据最后一行代码的值进行退导返回值类型

3. 如果有return, 则不能省略返回值类型, 必须指定

4. = 省略的话, 表示这个函数一定返回的是 Unit . 不管函数体怎么定义, 一定返回Unit.
    返回Unit的函数, 有时候称为过程
    
5. 如果函数的形参的格式是 0, 则调用的时候, 可以省略 ()

6. 如果没有形参, 则声明的时候也可以省略(), 调用的旧不能再有圆括号
    和 val的声明要区别
    
7. 可变参数
----

纯函数:
    特点:
    1. 不产生副作用
        常见的副作用: 打印到控制台, 修改了外部变量的值, 向磁盘写入文件,...
        
    2. 引用透明.
        函数的返回值, 只和形参有关, 和其他任何的值没有关系
        
只有副作用, 没有返回值, 叫过程

纯函数天然的支持高并发!
 

 */