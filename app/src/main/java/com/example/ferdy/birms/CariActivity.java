package com.example.ferdy.birms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ferdy.birms.adapter.PengadaanAdapter;
import com.example.ferdy.birms.api.Config;
import com.example.ferdy.birms.model.ocid.ApiSingleOcid;
import com.example.ferdy.birms.model.ocid.DataItem;
import com.example.ferdy.birms.utils.Converter;
import com.example.ferdy.birms.utils.EqualISpacingtemDecoration;

import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CariActivity extends AppCompatActivity {

    private ProgressBar mPBLoading;
    private RecyclerView mRVList;
    private TextView mTVKeyword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari);

        mPBLoading = findViewById(R.id.pb_loading);
        mRVList = findViewById(R.id.Rv_Cari_deskripsi);
        mTVKeyword = findViewById(R.id.tv_kontrak_katakunci);

        mRVList.setLayoutManager(new LinearLayoutManager(this));
        mRVList.addItemDecoration(new EqualISpacingtemDecoration(Converter.dpToPx(this, 10), 1));
        mRVList.setHasFixedSize(true);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mTVKeyword.setText(" kontrak, berdasarkan Kata Kunci " +bundle.getString("ocid"));
            getByOcid(bundle.getString("ocid"));
        }
    }

    private void getByOcid(String ocid) {
        mPBLoading.setVisibility(View.VISIBLE);
        mRVList.setVisibility(View.GONE);

        Call<ApiSingleOcid> call = Config.getAPI().getByOcid("6WkBFKh6SS4ibE2O0Fm5UHGEQWv8hQbj", ocid);
        call.enqueue(new Callback<ApiSingleOcid>() {
            @Override
            public void onResponse(Call<ApiSingleOcid> call, Response<ApiSingleOcid> response) {
                mPBLoading.setVisibility(View.GONE);
                mRVList.setVisibility(View.VISIBLE);

                if (response.body().getStatus().equals("200")) {
                    List<DataItem> dataItems = new ArrayList<>();
                    dataItems.add(response.body().getData());

                    PengadaanAdapter adapter = new PengadaanAdapter(CariActivity.this, dataItems);
                    mRVList.setAdapter(adapter);
                } else {
                    Toast.makeText(CariActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ApiSingleOcid> call, Throwable t) {
                mPBLoading.setVisibility(View.GONE);

                String message = "";
                if (t instanceof SocketTimeoutException) {
                    message = "request time out";
                } else if (t instanceof ConnectException || t instanceof UnknownHostException || t instanceof TimeoutException || t instanceof SocketException) {
                    message = "no internet connection";
                } else {
                    if (t.getMessage() != null)
                        message = t.getMessage();
                }

                Toast.makeText(CariActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}