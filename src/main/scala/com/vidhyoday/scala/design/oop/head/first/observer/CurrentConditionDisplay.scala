package com.vidhyoday.scala.design.oop.head.first.observer

class CurrentConditionDisplay(weatherData: WeatherData) extends Observer, DisplayElement {
  private var temperature: Float = 0.0f
  private var humidity: Float = 0.0f
  private var pressure: Float = 0.0f
  
  weatherData.registerObserver(this)
  
  override def update(): Unit = {
    temperature = weatherData.getTemperature
    humidity = weatherData.getHumidity
    pressure = weatherData.getPressure
    display()
  }
  
  override def display(): Unit = {
    println(s"Current conditions: $temperature °F and $humidity % humidity and $pressure inHg")
  }
}
