package com.vidhyoday.scala.design.fp.head.first.stategy

case class Duck(
                 flyBehavior: () => Unit,
                 quackBehavior: () => Unit,
                 display: () => Unit
               ) {
  def performFly(): Unit = flyBehavior()
  def performQuack(): Unit = quackBehavior()
  def performSwim(): Unit = println("All ducks float, even decoys!")
}