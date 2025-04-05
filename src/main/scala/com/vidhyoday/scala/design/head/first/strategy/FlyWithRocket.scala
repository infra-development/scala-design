package com.vidhyoday.scala.design.head.first.strategy

class FlyWithRocket extends FlyBehavior {
  def fly(): Unit = {
    println("I'm flying with a rocket!")
  }
}
