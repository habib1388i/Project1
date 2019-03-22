package com.example.project1.Activity;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.project1.Fragment.HotRecyler;
import com.example.project1.R;

public class LoginActivity extends AppCompatActivity {

    Button btn;
    EditText edt1, edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn = findViewById(R.id.btn_login_lgn);
        edt1 = findViewById(R.id.edt_email_lgn);
        edt2 = findViewById(R.id.edt_password_lgn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() == 0) {
                    edt1.setError("Email Wajib diisi");
                }
                if (edt2.getText().length() == 0) {
                    edt2.setError("Password Wajib diisi");
                } else {
                    Intent pindah = new Intent(LoginActivity.this, NavigationActivity.class);
                    pindah.putExtra("Welcome" + "Gmail", edt1.getText().toString());
                    startActivity(pindah);
                }


            }
        });
    }

    public void singup(View view) {
        startActivity(new Intent(LoginActivity.this, RegiterActivity.class));
    }
}
