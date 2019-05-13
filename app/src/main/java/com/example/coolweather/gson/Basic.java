package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 浅心 on 2019-05-13.
 */
public class Basic {

    @SerializedName("city")   //JSON字段和Java字段建立映射
    public String cityName;   //城市名

    @SerializedName("id")
    public String weatherId;  //天气情况

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;   //天气更新时间

    }
}
