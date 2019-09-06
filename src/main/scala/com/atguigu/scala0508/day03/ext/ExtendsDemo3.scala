package com.atguigu.scala0508.day03.ext

/**
  * Author lzc
  * Date 2019-09-06 11:17
  */
object ExtendsDemo3 {
    def main(args: Array[String]): Unit = {
        
        val circle1 = new Circle(0, 0, 4)
        val circle2 = new Circle(3, 4, 6)
        println(circle1.distance(circle2))
        println(circle1.area)
    }
}


class Point(val x: Double, val y: Double) {
    def distance(other: Point) = math.sqrt((this.x - other.x) * (this.x - other.x) + (this.y - other.y) * (this.y - other.y))
    
}

class Circle(override val x: Double, override val y: Double, val r: Double) extends Point(x, y) {
    override def toString: String = s"x: $x, y: $y, r: $r"
    
    def area = math.Pi * r * r
}


/*
点  圆形


 */
