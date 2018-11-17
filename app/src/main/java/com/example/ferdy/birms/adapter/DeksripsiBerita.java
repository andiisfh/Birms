package com.example.ferdy.birms.adapter;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ferdy.birms.R;
import com.example.ferdy.birms.model.ApiBerita;

import java.util.ArrayList;

public class DeksripsiBerita extends RecyclerView.Adapter<DeksripsiBerita.ViewBerita> {

    private ArrayList<ApiBerita>  beritaArrayList;

    public DeksripsiBerita(ArrayList<ApiBerita> beritaArrayList){
        this.beritaArrayList = beritaArrayList;
    }


    @NonNull
    @Override
    public DeksripsiBerita.ViewBerita onCreateViewHolder(@NonNull ViewGroup viewGroup1, int i) {
        View v = LayoutInflater.from(viewGroup1.getContext()).inflate(R.layout.list_berita,viewGroup1,false);
        return new ViewBerita(v);
    }

    @TargetApi(Build.VERSION_CODES.M)
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull DeksripsiBerita.ViewBerita viewBerita, int i) {
        viewBerita.tv_judul_berita.setText(beritaArrayList.get(i).getJudul());
        viewBerita.tv_tanggal_berita.setText(beritaArrayList.get(i).getDate_created());
        viewBerita.tv_deskripsi_berita.setText(beritaArrayList.get(i).getKeterangan());

    }

    @Override
    public int getItemCount() {
        return beritaArrayList.size();
    }

    public class ViewBerita extends RecyclerView.ViewHolder {
        private TextView tv_judul_berita,tv_tanggal_berita,tv_deskripsi_berita;
        public ViewBerita (View view){
            super(view);
            tv_judul_berita = (TextView) view.findViewById(R.id.judul_berita);
            tv_tanggal_berita = (TextView) view.findViewById(R.id.tv_tanggal_berita);
            tv_deskripsi_berita = (TextView) view.findViewById(R.id.tv_deskripsi_berita);


        }
    }
}
