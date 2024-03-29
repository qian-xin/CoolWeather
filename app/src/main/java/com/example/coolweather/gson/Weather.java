package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 浅心 on 2019-05-13.
 */
public class Weather {
    public String status;  //返回是否成功返回值

    public Basic basic;

    public Forecast forecast;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;  //解析出数组




}


