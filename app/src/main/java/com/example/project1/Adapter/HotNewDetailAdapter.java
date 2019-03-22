package com.example.project1.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project1.Api.ArticlesItem3;
import com.example.project1.Detail.News_Detail;
import com.example.project1.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HotNewDetailAdapter extends RecyclerView.Adapter<HotNewDetailAdapter.NewDetailViewHolder> {
    Context contextnew;
    List<ArticlesItem3> datanew;
    public HotNewDetailAdapter(Context context, List<ArticlesItem3> data) {
        contextnew = context;
        datanew = data;

    }

    @NonNull
    @Override
    public NewDetailViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new NewDetailViewHolder(LayoutInflater.from(contextnew).inflate(R.layout.tampilan_detailnew,null));
    }

    @Override
    public void onBindViewHolder(@NonNull NewDetailViewHolder newDetailViewHolder, int i) {
        newDetailViewHolder.tv1.setText(datanew.get(i).getAuthor());
        Picasso.get().load(datanew.get(i).getUrlToImage()).into(newDetailViewHolder.img1);
    }

    @Override
    public int getItemCount() {
        return datanew.size();
    }

    public class NewDetailViewHolder extends RecyclerView.ViewHolder {
        ImageView img1;
        TextView tv1;
        public NewDetailViewHolder(@NonNull View itemView) {
            super(itemView);
            img1 = itemView.findViewById(R.id.img_detailnew);
            tv1 = itemView.findViewById(R.id.tv_detailnew);

        }
    }
}
