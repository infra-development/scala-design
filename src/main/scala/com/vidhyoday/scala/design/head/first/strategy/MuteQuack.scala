package com.vidhyoday.scala.design.head.first.strategy

class MuteQuack extends QuackBehavior {
  def quack(): Unit = {
    println("<< Silence >>")
  }
}
