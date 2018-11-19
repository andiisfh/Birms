package com.example.ferdy.birms.api;

import com.example.ferdy.birms.BuildConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Andi Insanudin on 19/11/18.
 */
public class Config {

    private static final String ENDPOINT = "http://103.195.90.253";

    private static final int CONNECTION_TIMEOUT = 30;
    private static final int READ_TIMEOUT = 30;
    private static final int WRITE_TIMEOUT = 30;

    public static API getAPI() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder build = new OkHttpClient.Builder();
        build.connectTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS);
        build.readTimeout(READ_TIMEOUT, TimeUnit.SECONDS);
        build.writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS);
        if (BuildConfig.DEBUG) {
            build.addInterceptor(interceptor);
        }
        build.build();
        OkHttpClient client = build.build();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit.create(API.class);
    }
}
