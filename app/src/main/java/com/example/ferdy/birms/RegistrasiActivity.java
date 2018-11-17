package com.example.ferdy.birms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrasiActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        TextView login = (TextView)findViewById(R.id.lnkLogin);
        login.setMovementMethod(LinkMovementMethod.getInstance());
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrasiActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
