package com.vidhyoday.scala.design.oop.head.first.strategy

class FlyWithRocket extends FlyBehavior {
  def fly(): Unit = {
    println("I'm flying with a rocket!")
  }
}
