package com.example.classtovmm.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitRequest {
    public  static Retrofit retrofit;

    public static Retrofit getRetrofit(){
        if(retrofit == null){
            Retrofit.Builder builder = new Retrofit.Builder();
            builder.baseUrl("https://api.github.com/");
            builder.addConverterFactory(GsonConverterFactory.create());
            Retrofit retrofit = builder
                    .build();

        }
        return retrofit;
    }
}
