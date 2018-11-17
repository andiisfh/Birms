package com.example.ferdy.birms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class CariActivity extends AppCompatActivity {

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
    }

}