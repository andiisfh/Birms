package com.example.ferdy.birms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {


    private EditText editTextEmail;
    private EditText editTextPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView register = (TextView) findViewById(R.id.lnkRegister);
        register.setMovementMethod(LinkMovementMethod.getInstance());
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegistrasiActivity.class);
                startActivity(intent);
            }
        });
    }
}
