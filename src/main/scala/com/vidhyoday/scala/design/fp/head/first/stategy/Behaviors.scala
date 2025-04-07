package com.vidhyoday.scala.design.fp.head.first.stategy

object Behaviors {
  val flyWithWings: () => Unit = () => println("I'm flying with wings!")
  val flyNoWay: () => Unit = () => println("I can't fly!")
  val quack: () => Unit = () => println("Quack!")
  val squeak: () => Unit = () => println("Squeak!")
  val muteQuack: () => Unit = () => println("<< Silence >>")
}