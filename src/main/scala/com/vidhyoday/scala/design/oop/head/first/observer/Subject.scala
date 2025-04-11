package com.vidhyoday.scala.design.oop.head.first.observer

trait Subject {
  def registerObserver(observer: Observer): Unit
  def removeObserver(observer: Observer): Unit
  def notifyObservers(): Unit
}
