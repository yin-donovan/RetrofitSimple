package com.unbelievable.tangweny.retrofitsimple.http;

import com.unbelievable.tangweny.retrofitsimple.PhoneResult;
import com.unbelievable.tangweny.retrofitsimple.ResultItem;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by tangweny on 2016/10/8.
 */
public class HttpClient {

    public interface PhoneService {
        @GET("")
        Call<PhoneResult> getResult();

        @GET("/apistore/mobilenumber/mobilenumber")
        Call<PhoneResult> getResult(@Header("apikey") String apikey, @Query("phone") String phone);

        @GET("/simple")
        Call<ResultItem> getResultItem();
    }
}
