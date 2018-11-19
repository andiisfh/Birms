package com.example.ferdy.birms.api;

import com.example.ferdy.birms.model.ocid.ApiOcid;
import com.example.ferdy.birms.model.ocid.ApiSingleOcid;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Andi Insanudin on 19/11/18.
 */
public interface API {

    @GET("/api/getallocid")
    Call<ApiOcid> getAllOcid(@Query("key") String key);

    @GET("/api/getreleasebyocid?key=6WkBFKh6SS4ibE2O0Fm5UHGEQWv8hQbj")
    Call<ApiSingleOcid> getByOcid(@Query("key") String key, @Query("ocid") String ocid);
}
