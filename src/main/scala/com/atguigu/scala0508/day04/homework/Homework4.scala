package com.atguigu.scala0508.day04.homework

object Homework4 {
    def main(args: Array[String]): Unit = {
    
    }
}

abstract class Shape {
    def centerPoint: Point
}

class Rectangle(leftTop: Point, rightBottom: Point) extends Shape {
    override def centerPoint: Point = {
        new Point((leftTop.x + rightBottom.x) / 2, (leftTop.y + rightBottom.y) / 2)
    }
    def area: Double = ((leftTop.x - rightBottom.x) * (leftTop.y - rightBottom.y)).abs
}


class Circle(center: Point, r: Double) extends Shape {
    override def centerPoint: Point = center
    
    def area: Double = math.Pi * r * r
}


/*


5. 定义一个抽象类 Shape，一个抽象方法 centerPoint，以及该抽象类的子类 Rectangle 和 Circle。
为子类提供合适的构造器，并重写centerPoint方法, 并提供计算面积的方法 (根据需要添加相应的属性)

4. 设计一个Point类，其x和y坐标可以通过构造器提供。
     提供一个子类 LabeledPoint，其构造器接受一个标签值和x,y坐标,比如:new LabeledPoint(“Black Thursday”,1929,230.07)

 */