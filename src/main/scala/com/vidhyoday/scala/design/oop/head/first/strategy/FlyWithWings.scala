package com.vidhyoday.scala.design.oop.head.first.strategy

class FlyWithWings extends FlyBehavior {
  override def fly(): Unit = {
    println("I'm flying with wings!")
  }
}
