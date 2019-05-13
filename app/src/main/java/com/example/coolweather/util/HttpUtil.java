package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 浅心 on 2019-05-13.
 */
public class HttpUtil {
    public static void sendOKHttpRequest(String adress, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(adress).build();
        client.newCall(request).enqueue(callback);
    }
}

