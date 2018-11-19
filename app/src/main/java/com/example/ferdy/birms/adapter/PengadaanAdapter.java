package com.example.ferdy.birms.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ferdy.birms.R;
import com.example.ferdy.birms.model.ocid.Buyer;
import com.example.ferdy.birms.model.ocid.DataItem;
import com.example.ferdy.birms.model.ocid.Planning;
import com.example.ferdy.birms.model.ocid.Tender;
import com.example.ferdy.birms.utils.Converter;

import java.util.List;

public class PengadaanAdapter extends RecyclerView.Adapter<PengadaanAdapter.ViewHolder> {

    private Context mContext;
    private List<DataItem> mOcidDataList;

    public PengadaanAdapter(Context context, List<DataItem> ocidDataList) {
        mContext = context;
        mOcidDataList = ocidDataList;
    }

    @NonNull
    @Override
    public PengadaanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_pengadaan, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PengadaanAdapter.ViewHolder viewHolder, int i) {
        Planning planning = mOcidDataList.get(i).getPlanning();
        Buyer buyer = mOcidDataList.get(i).getBuyer();
        Tender tender = mOcidDataList.get(i).getTender();

        viewHolder.tv_judul.setText(planning.getBudget().getProject());
        viewHolder.tv_deskripsi.setText(buyer.getName());
        viewHolder.tv_klasifikasi.setText(tender.getMainProcurementCategory());
        viewHolder.tv_tanggal.setText(Converter.reformatDate(mOcidDataList.get(i).getDate()));
        viewHolder.tv_pagu.setText(Converter.numberFormat(String.valueOf(planning.getBudget().getAmount().getAmount()), true));

        if (tender.getId() != 0) {
            viewHolder.tv_kontrak.setText(Converter.numberFormat(String.valueOf(tender.getValue().getAmount()), true));
            viewHolder.tv_progres.setText(tender.getStatus());
        } else {
            viewHolder.tv_kontrak.setText("-");
            viewHolder.tv_progres.setText("-");
        }
    }

    @Override
    public int getItemCount() {
        return mOcidDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_judul, tv_deskripsi, tv_tanggal, tv_pagu, tv_kontrak, tv_progres, tv_klasifikasi;

        public ViewHolder(View view) {
            super(view);

            tv_judul = view.findViewById(R.id.tv_judul_project);
            tv_deskripsi = view.findViewById(R.id.tv_deskripsi_project);
            tv_tanggal = view.findViewById(R.id.tv_tanggal_pengadaan);
            tv_pagu = view.findViewById(R.id.tvpagu);
            tv_kontrak = view.findViewById(R.id.tvkontrak);
            tv_progres = view.findViewById(R.id.tv_progres);
            tv_klasifikasi = view.findViewById(R.id.tv_pengadaan);
        }
    }
}
