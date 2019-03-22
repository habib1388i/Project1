package com.example.project1.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project1.Api.ArticlesItem3;
import com.example.project1.Api.ResponseNews;
import com.example.project1.Detail.News_Detail;
import com.example.project1.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HotNewAdapter extends RecyclerView.Adapter<HotNewAdapter.NewViewHolde> {
Context contextnews;
List<ArticlesItem3> datanews;

    public HotNewAdapter(Context context, List<ArticlesItem3> data) {

        contextnews = context;
        datanews = data;

    }

    @NonNull
    @Override
    public NewViewHolde onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return new NewViewHolde(LayoutInflater.from(contextnews).inflate(R.layout.tampilan_news,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NewViewHolde newViewHolde,final int i) {
        newViewHolde.tv1.setText(datanews.get(i).getAuthor());
        newViewHolde.tv2.setText(datanews.get(i).getTitle());
        Picasso.get().load(datanews.get(i).getUrlToImage()).into(newViewHolde.imgnews);
        newViewHolde.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contextnews, News_Detail.class);
                intent.putExtra("detail", (Bundle) datanews.get(i).getContent());
                intent.putExtra("tittle",datanews.get(i).getAuthor());
                intent.putExtra("image",datanews.get(i).getUrlToImage());
                contextnews.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return datanews.size();
    }

    public class NewViewHolde extends RecyclerView.ViewHolder {
        ImageView imgnews;
        TextView tv1,tv2;
        public NewViewHolde(@NonNull View itemView) {
            super(itemView);
            imgnews = itemView.findViewById(R.id.img_new);
            tv1 = itemView.findViewById(R.id.tv_tvnew);
            tv2 = itemView.findViewById(R.id.tv_tvnews);

        }
    }
}
