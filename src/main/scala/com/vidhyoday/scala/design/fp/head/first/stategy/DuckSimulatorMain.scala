package com.vidhyoday.scala.design.fp.head.first.stategy

object DuckSimulatorMain extends App {

  import Behaviors._

  val mallard = Duck(flyWithWings, quack, () => println("I'm a real Mallard duck"))
  mallard.performQuack()
  mallard.performFly()
  mallard.performSwim()
  mallard.display()

  val model = Duck(flyNoWay, muteQuack, () => println("I'm a model duck"))
  model.performFly()
  model.performQuack()
  model.performSwim()
  model.display()

  // Changing behavior at runtime
  val modelWithRocket = model.copy(flyBehavior = () => println("I'm flying with a rocket!"))
  modelWithRocket.performFly()
}
