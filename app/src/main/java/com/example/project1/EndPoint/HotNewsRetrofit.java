package com.example.project1.EndPoint;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HotNewsRetrofit {

    public static String url = "https://newsapi.org/v2/";
    public static Retrofit setInit(){
        return new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
    }
    public static HotNewsService getHotInstance(){
        return setInit().create(HotNewsService.class);
    }
}
