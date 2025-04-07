package com.vidhyoday.scala.design.oop.head.first.strategy

class Squeak extends QuackBehavior {
  def quack(): Unit = {
    println("Squeak")
  }
}
