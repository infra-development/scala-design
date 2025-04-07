package com.vidhyoday.scala.design.oop.head.first.strategy

class MuteQuack extends QuackBehavior {
  def quack(): Unit = {
    println("<< Silence >>")
  }
}
