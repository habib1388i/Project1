package com.example.project1.Detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project1.R;
import com.squareup.picasso.Picasso;

public class Tv2_Detail extends AppCompatActivity {
    ImageView imgdetailtv;
    TextView tv1 , tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv2__detail);

        imgdetailtv = findViewById(R.id.img_detailtv);
        tv1 = findViewById(R.id.tv_namatv);
        tv2 = findViewById(R.id.tv_detailtv);

        tv1.setText(getIntent().getStringExtra("tittle"));
        tv2.setText(getIntent().getStringExtra("detail"));
        Picasso.get().load(getIntent().getStringExtra("image")).into(imgdetailtv);

    }
}
