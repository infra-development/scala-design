package com.vidhyoday.scala.design.head.first.strategy

class Squeak extends QuackBehavior {
  def quack(): Unit = {
    println("Squeak")
  }
}
