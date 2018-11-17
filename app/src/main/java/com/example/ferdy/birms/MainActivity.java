package com.example.ferdy.birms;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;

import com.example.ferdy.birms.adapter.DeksripsiBerita;
import com.example.ferdy.birms.adapter.DeksripsiCariAdapter;
import com.example.ferdy.birms.api.JSONBerita;
import com.example.ferdy.birms.api.ReqInterfaceBerita;
import com.example.ferdy.birms.model.ApiBerita;
import com.example.ferdy.birms.model.ApiCari;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {



//    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_beranda:
                    BerandaFragment berandaFragment = new BerandaFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content, berandaFragment);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_berita:
                    BeritaFragment beritaFragment = new BeritaFragment();
                    FragmentTransaction fragmentberTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentberTransaction.replace(R.id.content, beritaFragment);
                    fragmentberTransaction.commit();
                    return true;
                case R.id.navigation_cari:
                    cariFragment cariFragment = new cariFragment();
                    FragmentTransaction fragmentcarTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentcarTransaction.replace(R.id.content, cariFragment);
                    fragmentcarTransaction.commit();
                    return true;
                case R.id.navigation_pengadaan:
                    pengadaanFragment pengadaanFragment = new pengadaanFragment();
                    FragmentTransaction fragmentpeTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentpeTransaction.replace(R.id.content, pengadaanFragment);
                    fragmentpeTransaction.commit();
                    return true;
                case R.id.navigation_statistik:
                    statistikFragment statistikFragment = new statistikFragment();
                    FragmentTransaction fragmentstaTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentstaTransaction.replace(R.id.content, statistikFragment);
                    fragmentstaTransaction.commit();
                    return  true;
            }
            return false;
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        BerandaFragment berandaFragment = new BerandaFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content, berandaFragment);
        fragmentTransaction.commit();


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }



}
