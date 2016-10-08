package com.unbelievable.tangweny.retrofitsimple.http;

import com.unbelievable.tangweny.retrofitsimple.ResultItem;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by tangweny on 2016/10/8.
 */
public class RetrofitClient {
    private static APIService service;
    private static final String BASE_URL = "http://retrofit.devwiki.net";
    private RetrofitClient(){}
    public static APIService create(){
        Retrofit client = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return client.create(APIService.class);
    }

    public interface APIService {
        @GET("/simple")
        Call<ResultItem> getResultItem();
    }
}
