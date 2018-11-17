package com.example.ferdy.birms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.ferdy.birms.adapter.DeksripsiCariAdapter;
import com.example.ferdy.birms.api.JSONResponse;
import com.example.ferdy.birms.api.RequestInterface;
import com.example.ferdy.birms.model.ApiCari;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CariActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ApiCari> cari;
    private DeksripsiCariAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari);
        //ini untuk membaca fragnen
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            if (bundle.getString("Some") != null) {
                Toast.makeText(getApplicationContext(),
                        "data:" + bundle.getString("some"),
                        Toast.LENGTH_SHORT).show();
            }
        }
        view();
    }

    //funsi

    private void view(){
        recyclerView = (RecyclerView) findViewById(R.id.Rv_Cari_deskripsi);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        loadJson();
    }
    private void loadJson(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.learn2crack.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestInterface request = retrofit.create(RequestInterface.class);
        Call<JSONResponse> call = request.getJSON(); //get json dapet dari interface
        call.enqueue(new Callback<JSONResponse>() {
            @Override
            public void onResponse(Call<JSONResponse> call, Response<JSONResponse> response) {
                //jika sukses
                JSONResponse jsonResponse = response.body();
                cari = new ArrayList<>(Arrays.asList(jsonResponse.getAndroid()));
                adapter = new DeksripsiCariAdapter(cari);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<JSONResponse> call, Throwable t) {
                Log.d( "Eorror",t.getMessage());
            }
        });
    }
}