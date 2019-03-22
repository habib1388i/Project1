package com.example.project1.Detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project1.Adapter.HotNewDetailAdapter;
import com.example.project1.Api.ArticlesItem3;
import com.example.project1.Api.ResponseNews;
import com.example.project1.EndPoint.HotNewsRetrofit;
import com.example.project1.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class News_Detail extends AppCompatActivity {

    ImageView imgdetailtv;
    TextView tv1 , tv2;
    RecyclerView rv;
    HotNewDetailAdapter adapter;
    List<ArticlesItem3> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__detail);
        imgdetailtv = findViewById(R.id.img_detailnew);
        tv1 = findViewById(R.id.tv_namanew);
        tv2 = findViewById(R.id.tv_detailnew);
        rv = findViewById(R.id.rv_newdetail);
        rv.setLayoutManager(new LinearLayoutManager(News_Detail.this,LinearLayoutManager.HORIZONTAL,false));

        tv1.setText(getIntent().getStringExtra("tittle"));
        tv2.setText(getIntent().getStringExtra("detail"));
        Picasso.get().load(getIntent().getStringExtra("image")).into(imgdetailtv);

        getDataNews();

    }

    private void getDataNews() {
        HotNewsRetrofit.getHotInstance().getDataNews().enqueue(new Callback<ResponseNews>() {
            @Override
            public void onResponse(Call<ResponseNews> call, Response<ResponseNews> response) {
                if (response.isSuccessful()){
                    data = response.body().getArticles();
                    adapter = new HotNewDetailAdapter(News_Detail.this,data);
                    rv.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ResponseNews> call, Throwable t) {
                Toast.makeText(News_Detail.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
