package com.example.project1.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project1.Api.ArticlesItem2;
import com.example.project1.Detail.Tv_Detail;
import com.example.project1.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Tv2Adapter extends RecyclerView.Adapter<Tv2Adapter.Tv2ViewHolder> {
    Context contexttv;
    List<ArticlesItem2> datatv;
    public Tv2Adapter(Context context, List<ArticlesItem2> data2) {
        contexttv = context;
        datatv = data2;

    }

    @NonNull
    @Override
    public Tv2ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Tv2ViewHolder(LayoutInflater.from(contexttv).inflate(R.layout.tampilan_tv1,null));
    }

    @Override
    public void onBindViewHolder(@NonNull Tv2ViewHolder tv2ViewHolder,final int i) {
    tv2ViewHolder.tvnew.setText(datatv.get(i).getAuthor());
        Picasso.get().load(datatv.get(i).getUrlToImage()).into(tv2ViewHolder.imgnew);
        tv2ViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contexttv, Tv_Detail.class);
                intent.putExtra("detail",datatv.get(i).getContent());
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

    public class Tv2ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgnew;
        TextView tvnew;
        public Tv2ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgnew = itemView.findViewById(R.id.img_tv1);
            tvnew = itemView.findViewById(R.id.tv_tv1);
        }
    }
}
