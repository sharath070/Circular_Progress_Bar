package com.sharath070.jetweather_forecast.model

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)