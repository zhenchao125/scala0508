package com.atguigu.scala0508.day03.single

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019-09-06 15:07
  */
object Marker {
    
    
    val markers = mutable.Map(
        "red" -> new Marker("red"),
        "blue" -> new Marker("blue"),
        "yellow" -> new Marker("yellow"))
    
    def getMarker(color: String) = {
        markers.getOrElseUpdate(color, new Marker(color))
    }
    
    def main(args: Array[String]): Unit = {
        println(Marker.getMarker("red"))
        println(Marker.getMarker("blue"))
        println(Marker.getMarker("green"))
        println(Marker.getMarker("green"))
        
        
    }
}

// 主构造私有
class Marker private (val color: String) {
    println(s"$color  marker")
    
    override def toString: String = s"color"
}
/*


 */