package com.example.ferdy.birms.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ferdy.birms.R;
import com.example.ferdy.birms.model.ApiCari;

import java.util.ArrayList;

public class DeksripsiCariAdapter extends RecyclerView.Adapter<DeksripsiCariAdapter.ViewHolder> {

    private ArrayList<ApiCari> cari;



    public  DeksripsiCariAdapter(ArrayList<ApiCari> cari){
        this.cari = cari;
    }

    @NonNull
    @Override
    public DeksripsiCariAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_cari,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DeksripsiCariAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tv_name.setText(cari.get(i).getName());
        viewHolder.tv_ver.setText(cari.get(i).getVer());
        viewHolder.tv_api.setText(cari.get(i).getApi());
    }

    @Override
    public int getItemCount() {
        return cari.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name,tv_ver,tv_api;
        public ViewHolder (View view){
            super(view);

            tv_name = (TextView) view.findViewById(R.id.tv_judul_Project);
            tv_ver = (TextView) view.findViewById(R.id.tv_tanggal_pengadaan);
            tv_api = (TextView) view.findViewById(R.id.tv_pengadaan);


        }
    }
}
