package com.atguigu.scala0508.day05.sort

object SortDemo2 {
    def main(args: Array[String]): Unit = {
        val users = List(new User1(20, "lisi"), new User1(10, "zs"), new User1(15, "wangwu"), new User1(15, "abc"))
        
       val users1 = users.sorted(new Ordering[User1]{
           override def compare(x: User1, y: User1): Int = x.age -  y.age
       }.reverse)
        println(users1)
    
    /*
        val list1 = List(30, 50, 70, 60, 10, 20)
        println(list1.sorted(Ordering.Int.reverse))*/
    
        
    }
}
class User1(val age: Int, val name: String){
    override def toString: String = s"[$name, $age]"
}




/*
排序的本质其实就是比较元素的大小
1. 让元素本身具有和其他元素比较的能力  (Comparable   compareTo(other) this other   => Ordered compare   this other)
2. 第三方的比较机构来进行比较大小  (Comparator compare(O1, O2))


排序算法:
    冒泡
    选择
    插入
    
    归并
    希尔
    快速
    
    

    

3个支持排序的算子:

sorted
    1. 让对象具有比较的能力(Ordered)
    2. 提供第三方的比较器(Ordering)

sortBy

sortWith


 */