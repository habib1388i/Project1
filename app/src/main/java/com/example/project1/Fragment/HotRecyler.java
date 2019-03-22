package com.example.project1.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.project1.Adapter.HotNewAdapter;
import com.example.project1.Api.ArticlesItem3;
import com.example.project1.Api.ResponseNews;
import com.example.project1.EndPoint.HotNewsRetrofit;
import com.example.project1.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotRecyler extends Fragment {
    RecyclerView rv;
    HotNewAdapter adapter;
    List<ArticlesItem3> data;




    public HotRecyler() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hot_recyler, container, false);
        rv = view.findViewById(R.id.rv_news);
        rv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        getDataNews();
        return view;

    }

    private void getDataNews() {
        HotNewsRetrofit.getHotInstance().getDataNews().enqueue(new Callback<ResponseNews>() {
            @Override
            public void onResponse(Call<ResponseNews> call, Response<ResponseNews> response) {
                if (response.isSuccessful()){
                    data = response.body().getArticles();
                    adapter = new HotNewAdapter(getActivity(),data);
                    rv.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ResponseNews> call, Throwable t) {
                Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
