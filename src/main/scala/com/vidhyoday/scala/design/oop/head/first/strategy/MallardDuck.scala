package com.vidhyoday.scala.design.oop.head.first.strategy

class MallardDuck extends Duck {

  flyBehavior = new FlyWithWings
  quackBehavior = new Quack

  override def display(): Unit = println("I'm a real Mallard duck")
}
