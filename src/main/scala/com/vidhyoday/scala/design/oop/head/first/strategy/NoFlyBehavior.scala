package com.vidhyoday.scala.design.oop.head.first.strategy

class NoFlyBehavior extends FlyBehavior {
  def fly(): Unit = {
    println("I can't fly")
  }
}
