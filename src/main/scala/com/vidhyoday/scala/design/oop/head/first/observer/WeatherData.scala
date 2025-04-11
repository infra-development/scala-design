package com.vidhyoday.scala.design.oop.head.first.observer

import scala.collection.mutable.ListBuffer

class WeatherData extends Subject {
  private var observers: ListBuffer[Observer] = ListBuffer()
  private var temperature: Float = 0.0f
  private var humidity: Float = 0.0f
  private var pressure: Float = 0.0f

  def registerObserver(observer: Observer): Unit = {
    observers = observers :+ observer
  }

  def removeObserver(observer: Observer): Unit = {
    observers = observers.filterNot(_ == observer)
  }

  def notifyObservers(): Unit = {
    observers.foreach(_.update())
  }

  def measurementsChanged(): Unit = {
    notifyObservers()
  }

  def setMeasurements(temperature: Float, humidity: Float, pressure: Float): Unit = {
    this.temperature = temperature
    this.pressure = pressure
    this.humidity = humidity
    measurementsChanged()
  }

  def getTemperature: Float = temperature

  def getHumidity: Float = humidity

  def getPressure: Float = pressure
}
