package com.atguigu.scala0508.day05.sort

object SortDemo1 {
    def main(args: Array[String]): Unit = {
        /*val list1 = ArrayBuffer(30, 50, 70, 60, 10, 20)
//        val list2 = list1.sorted.reverse
        list1.sorted
        
        println(list1)
        println(list2)*/
        println(new User(20, "lisi") > new User(10, "zs"))
        val users = List(new User(20, "lisi"), new User(10, "zs"), new User(15, "wangwu"), new User(15, "abc"))
        
        println(users.sorted)
    }
}
class User(val age: Int, val name: String) extends Ordered[User] {
    /*override def compareTo(o: User): Int = {
        var r = o.age - this.age
        if (r == 0) {
            r = this.name.compareTo(o.name)
        }
        r
    }*/
    
    override def toString: String = s"[$name, $age]"
    
    override def compare(o: User): Int = {
        var r = o.age - this.age
        if (r == 0) {
            r = this.name.compareTo(o.name)
        }
        r
    }
}


/*
class User(val age: Int, val name: String) extends Comparable[User] {
    override def compareTo(o: User): Int = {
        var r = o.age - this.age
        if (r == 0) {
            r = this.name.compareTo(o.name)
        }
        r
    }
    
    override def toString: String = s"[$name, $age]"
}
*/


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

sortBy

sortWith


 */