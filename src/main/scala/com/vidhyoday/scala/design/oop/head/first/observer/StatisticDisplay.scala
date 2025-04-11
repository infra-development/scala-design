package com.vidhyoday.scala.design.oop.head.first.observer

import scala.collection.mutable.ListBuffer

class StatisticDisplay(weatherData: WeatherData) extends Observer, DisplayElement {
  var temperatureBuffer: ListBuffer[Float] = ListBuffer[Float]()
  var pressureBuffer: ListBuffer[Float] = ListBuffer[Float]()
  var humidityBuffer: ListBuffer[Float] = ListBuffer[Float]()

  weatherData.registerObserver(this)

  override def update(): Unit = {
    temperatureBuffer += weatherData.getTemperature
    humidityBuffer += weatherData.getHumidity
    pressureBuffer += weatherData.getPressure
    display()
  }

  override def display(): Unit = {
    var (temperature, humidity, pressure) = computeTheParameters
    println(s"Avg temperature: $temperature, humidity: $humidity, pressure: $pressure")
  }

  private def computeTheParameters = {
    var temperature = temperatureBuffer.sum / temperatureBuffer.length
    var humidity = humidityBuffer.sum / humidityBuffer.length
    var pressure = pressureBuffer.sum / pressureBuffer.length
    (temperature, humidity, pressure)
  }
}
