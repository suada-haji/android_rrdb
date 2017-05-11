package com.example.suadahaji.androidrrdb.api;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * This module provides the api dependencies
 */

@Module
public class ApiModule {
    public static final String BASE_URL = "http://api.nytimes.com/svc/";

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {
        return new OkHttpClient()
                .newBuilder()
                .build();
    }

    /**
     *  Create the Retrofit instance
     * */

    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .client(okHttpClient)
                // Sets the API base url
                .baseUrl(BASE_URL)
                // Converter factory for serialization and deserialization of objects
                .addConverterFactory(GsonConverterFactory.create())
                // Supports service method return types
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    /**
     * Creates an implementation of the API endpoints defined by the ApiManager interface.
     */

    @Provides
    @Singleton
    ApiManager provideApiManager(Retrofit retrofit) {
        return retrofit.create(ApiManager.class);
    }
}
