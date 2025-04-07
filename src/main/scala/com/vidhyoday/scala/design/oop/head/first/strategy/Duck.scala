package com.vidhyoday.scala.design.oop.head.first.strategy

abstract class Duck {
  var flyBehavior: FlyBehavior = _
  var quackBehavior: QuackBehavior = _

  def display(): Unit

  def performFly(): Unit = {
    flyBehavior.fly()
  }

  def performQuack(): Unit = {
    quackBehavior.quack()
  }

  def performSwim(): Unit = {
    println("All ducks float, even decoys!")
  }

  def setFlyBehavior(flyBehavior: FlyBehavior): Unit = {
    this.flyBehavior = flyBehavior
  }

  def setQuackBehavior(quackBehavior: QuackBehavior): Unit = {
    this.quackBehavior = quackBehavior
  }
  
}
