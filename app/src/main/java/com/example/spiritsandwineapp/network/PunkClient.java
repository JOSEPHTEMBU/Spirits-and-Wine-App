package com.example.spiritsandwineapp.network;

import com.example.spiritsandwineapp.Constants;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PunkClient {
    private static Retrofit retrofit = null;

    public static PunkApi getClient() {
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        if (retrofit == null) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
            okHttpClient.addInterceptor(httpLoggingInterceptor);
            okHttpClient.build();
        }
        retrofit = new Retrofit
                .Builder()
                .baseUrl(Constants.BREW_BASE_API)
                .client(okHttpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(PunkApi.class);
    }
}