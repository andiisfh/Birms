package com.example.ferdy.birms;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ferdy.birms.adapter.DeksripsiBerita;
import com.example.ferdy.birms.api.JSONBerita;
import com.example.ferdy.birms.api.ReqInterfaceBerita;
import com.example.ferdy.birms.model.ApiBerita;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class BeritaFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<ApiBerita> beritaArrayList;
    private DeksripsiBerita berita;

    public BeritaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_berita, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycleviewberita);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(berita);


        return rootView;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://103.195.90.253")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ReqInterfaceBerita reqInterfaceBerita = retrofit.create(ReqInterfaceBerita.class);
        Call<JSONBerita> call = reqInterfaceBerita.getDataApi();//get data api
        call.enqueue(new Callback<JSONBerita>() {
            @Override
            public void onResponse(Call<JSONBerita> call, Response<JSONBerita> response) {
                JSONBerita jsonBerita = response.body();
                beritaArrayList = new ArrayList<>(Arrays.asList(jsonBerita.getDataBerita()));
               berita = new DeksripsiBerita(beritaArrayList);
               recyclerView.setAdapter(berita);
            }

            @Override
            public void onFailure(Call<JSONBerita> call, Throwable t) {
                Log.d( "Eroor",t.getMessage());
            }
        });
    }
}
