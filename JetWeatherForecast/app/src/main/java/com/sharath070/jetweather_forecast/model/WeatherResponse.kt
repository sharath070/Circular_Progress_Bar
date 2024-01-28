package com.sharath070.jetweather_forecast.model

data class WeatherResponse(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<>,
    val message: Double
)