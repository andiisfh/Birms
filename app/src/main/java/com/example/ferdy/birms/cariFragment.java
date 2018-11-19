package com.example.ferdy.birms;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class cariFragment extends Fragment {


    public cariFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        final View view = inflater.inflate(R.layout.fragment_cari, container, false);

        final EditText etOcid = view.findViewById(R.id.Edit_cari);
        Button btnoppen = (Button) view.findViewById(R.id.tombol);
        btnoppen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etOcid.getText().length() > 0) {
                    Intent in = new Intent(getActivity(), CariActivity.class);
                    in.putExtra("ocid", etOcid.getText().toString());
                    startActivity(in);
                } else {
                    Toast.makeText(getContext(), "Tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });
        return view;
    }

}
