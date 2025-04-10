package com.vidhyoday.scala.design.oop.head.first.strategy

class ModelDuck extends Duck {
  flyBehavior = new NoFlyBehavior
  quackBehavior = new Quack
  
  override def display(): Unit = println("I'm a model duck")
}
