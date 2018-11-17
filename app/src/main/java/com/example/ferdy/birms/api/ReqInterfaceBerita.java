package com.example.ferdy.birms.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ReqInterfaceBerita {

    @GET("/api/getallnews?key=6WkBFKh6SS4ibE2O0Fm5UHGEQWv8hQbj")
    Call<JSONBerita> getDataApi();

    
}
