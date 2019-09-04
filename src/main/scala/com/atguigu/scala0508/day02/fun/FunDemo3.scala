package com.atguigu.scala0508.day02.fun

object FunDemo3 {
    def main(args: Array[String]) {
        // 5 + 3,  6 + 3, 7+3 ....
        
        /*add(2,3)
        add(3,3)
        add(4,3)
        println(add(4))
        println(add(4, 5))*/
        
        println(add(10, 20, 30))
        
        println(add(10, c = 20)) // 命名参数
        
        
        println(add(b = 1, c = 2, a = 10))
        
        println(sumPrime(100, 101))
    }
    
    def add(a: Int, b: Int = 3, c: Int) = a + b + c
    
    
    // 100 - 1000 之间所有的质数的和
    def sumPrime(from: Int, to: Int) = {
        var sum = 0
        for (n <- from to to) {
            if (isPrime(n)) sum += n
        }
        sum
    }
    
    def isPrime(num: Int): Boolean = {
        for (i <- 2 until num) {
            if (num % i == 0) return false
        }
        true
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

8. 参数的默认值
    当传递实时不传,在会使用默认值
    
9. 命名参数:
    调用的时候, 指定形参的名字
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