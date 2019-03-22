package com.example.project1.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.SportViewHolder> {
    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder sportViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class SportViewHolder extends RecyclerView.ViewHolder {
        public SportViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
