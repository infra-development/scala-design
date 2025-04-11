package com.vidhyoday.scala.design.oop.head.first.observer

object SimulatorWeatherData {
  def main(args: Array[String]): Unit = {
    val weatherData = new WeatherData()
    val currentConditionsDisplay = new CurrentConditionDisplay(weatherData)
    val statisticsDisplay = new StatisticDisplay(weatherData)

    weatherData.setMeasurements(80, 65, 30.4f)
    weatherData.setMeasurements(82, 70, 29.2f)
    weatherData.setMeasurements(78, 90, 29.2f)
  }

}
