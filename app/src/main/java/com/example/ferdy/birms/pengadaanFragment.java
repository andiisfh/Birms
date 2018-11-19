package com.example.ferdy.birms;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.ferdy.birms.adapter.PengadaanAdapter;
import com.example.ferdy.birms.api.Config;
import com.example.ferdy.birms.model.ocid.ApiOcid;
import com.example.ferdy.birms.utils.Converter;
import com.example.ferdy.birms.utils.EqualISpacingtemDecoration;

import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class pengadaanFragment extends Fragment {

    private ProgressBar mPBLoading;
    private RecyclerView mRVList;
    private Button mBtnAll;

    public pengadaanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pengadaan, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mPBLoading = view.findViewById(R.id.pb_loading);
        mRVList = view.findViewById(R.id.rv_list);
        mBtnAll = view.findViewById(R.id.all_btn);

        mRVList.setLayoutManager(new LinearLayoutManager(getContext()));
        mRVList.addItemDecoration(new EqualISpacingtemDecoration(Converter.dpToPx(getContext(), 10), 1));
        mRVList.setHasFixedSize(true);

        mBtnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAllOcid();
            }
        });
    }

    private void getAllOcid() {
        mPBLoading.setVisibility(View.VISIBLE);
        mRVList.setVisibility(View.GONE);

        Call<ApiOcid> call = Config.getAPI().getAllOcid("6WkBFKh6SS4ibE2O0Fm5UHGEQWv8hQbj");
        call.enqueue(new Callback<ApiOcid>() {
            @Override
            public void onResponse(Call<ApiOcid> call, Response<ApiOcid> response) {
                mPBLoading.setVisibility(View.GONE);
                mRVList.setVisibility(View.VISIBLE);

                if (response.body().getStatus().equals("200")) {
                    PengadaanAdapter adapter = new PengadaanAdapter(getContext(), response.body().getData());
                    mRVList.setAdapter(adapter);
                } else {
                    Toast.makeText(getContext(), response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ApiOcid> call, Throwable t) {
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

                Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}