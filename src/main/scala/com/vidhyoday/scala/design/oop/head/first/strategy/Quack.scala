package com.vidhyoday.scala.design.oop.head.first.strategy

class Quack extends QuackBehavior {
  def quack(): Unit = {
    println("Quack")
  }
}
