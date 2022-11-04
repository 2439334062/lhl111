package com.example.lhl111.utils;

import com.example.lhl111.Service.GetRequest;
import com.github.leonardoxh.livedatacalladapter.LiveDataCallAdapterFactory;
import com.github.leonardoxh.livedatacalladapter.LiveDataResponseBodyConverterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewUtils {
    public   static final String BASE_URL = "http://topline.luhanlin.top/topline/";
    public  static GetRequest get(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(LiveDataCallAdapterFactory.create())
                .addConverterFactory(LiveDataResponseBodyConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
       return retrofit.create(GetRequest.class);
    }


}
