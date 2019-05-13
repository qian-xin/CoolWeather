package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 浅心 on 2019-05-13.
 */
public class Now {
    @SerializedName("tmp")
    public String tempeture;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}


