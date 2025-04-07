package com.vidhyoday.scala.design.oop.head.first.strategy

object MiniDuckSimulator {
  def main(args: Array[String]): Unit = {
    val mallardDuck = new MallardDuck
    mallardDuck.performQuack()
    mallardDuck.performFly()
    mallardDuck.performSwim()

    val modelDuck = new ModelDuck
    modelDuck.performFly()
    modelDuck.setFlyBehavior(new FlyWithRocket)
    modelDuck.setQuackBehavior(new Quack)
    modelDuck.performFly()
  }
}
