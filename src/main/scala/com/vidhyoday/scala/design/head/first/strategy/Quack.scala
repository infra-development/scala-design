package com.vidhyoday.scala.design.head.first.strategy

class Quack extends QuackBehavior {
  def quack(): Unit = {
    println("Quack")
  }
}
