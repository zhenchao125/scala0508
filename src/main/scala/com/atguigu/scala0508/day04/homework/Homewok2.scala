package com.atguigu.scala0508.day04.homework

/**
  * Author lzc
  * Date 2019-09-07 08:57
  */
object Homewok2 {
    def main(args: Array[String]): Unit = {
        val redColor = new Card("♠")
        println(redColor.toString)
        println(redColor.isRed)
    }
}

class Card(val color: String) {
    override def toString: String = s"${this.color}"
    def isRed: Boolean = if(color == "♦" || color == "♥") true else false
}

/*
2. 编写一个扑克牌只能有 4 种花色,让其 toString 方法分别返回♣,♦,♥,♠，并实现一个函数,检查某张牌的花色是否为红色
 */