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

import com.example.project1.Api.ArticlesItem;
import com.example.project1.Detail.Tv_Detail;
import com.example.project1.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TvAdapter extends RecyclerView.Adapter<TvAdapter.TvViewHolder> {
    Context contexttv;
    List<ArticlesItem> datatv;
    


    public TvAdapter(Context context, List<ArticlesItem> data) {
        contexttv = context;
        datatv = data;

    }


    @NonNull
    @Override
    public TvViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new TvViewHolder(LayoutInflater.from(contexttv).inflate(R.layout.tampilan_tv,null));
    }

    @Override
    public void onBindViewHolder(@NonNull TvViewHolder tvViewHolder, final int i) {

        tvViewHolder.tvnew.setText(datatv.get(i).getAuthor());
        Picasso.get().load(datatv.get(i).getUrlToImage()).into(tvViewHolder.imgnew);
        tvViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contexttv, Tv_Detail.class);
                intent.putExtra("detail", (Bundle) datatv.get(i).getContent());
                intent.putExtra("tittle",datatv.get(i).getAuthor());
                intent.putExtra("image",datatv.get(i).getUrlToImage());
                contexttv.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return datatv.size();
    }

    public class TvViewHolder extends RecyclerView.ViewHolder {
        ImageView imgnew;
        TextView tvnew;
        public TvViewHolder(@NonNull View itemView) {
            super(itemView);
            imgnew = itemView.findViewById(R.id.img_tv);
            tvnew = itemView.findViewById(R.id.tv_tv);
        }
    }
}
