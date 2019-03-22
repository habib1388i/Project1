package com.example.project1.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.project1.Adapter.Tv2Adapter;
import com.example.project1.Adapter.TvAdapter;
import com.example.project1.Api.ArticlesItem;
import com.example.project1.Api.ArticlesItem2;
import com.example.project1.Api.ResponseTv;
import com.example.project1.Api.ResponseTvTop;
import com.example.project1.EndPoint.HotNewsRetrofit;
import com.example.project1.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class TvFragment extends Fragment {

    RecyclerView rvnews, rvtopnews;
    TvAdapter adapter;
    Tv2Adapter adapter2;
    List<ArticlesItem> data;
    List<ArticlesItem2> data2;

    public TvFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tv, container, false);
        rvnews = view.findViewById(R.id.rv_tv2);
        rvtopnews = view.findViewById(R.id.rv_tv1);
        rvtopnews.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        rvnews.setLayoutManager(new LinearLayoutManager(getActivity()));

        getDataNew();
        getDataTopNew();
        return view;

    }


    private void getDataNew() {
        HotNewsRetrofit.getHotInstance().getDataTv().enqueue(new Callback<ResponseTv>() {
            @Override
            public void onResponse(Call<ResponseTv> call, Response<ResponseTv> response) {
                if (response.isSuccessful()) {
                    data = response.body().getArticles();
                    adapter = new TvAdapter(getActivity(), data);
                    rvnews.setAdapter(adapter);
                }

            }

            @Override
            public void onFailure(Call<ResponseTv> call, Throwable t) {
                Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void getDataTopNew() {
        HotNewsRetrofit.getHotInstance().getDataTvTop().enqueue(new Callback<ResponseTvTop>() {
            @Override
            public void onResponse(Call<ResponseTvTop> call, Response<ResponseTvTop> response) {
                if (response.isSuccessful()) {
                    data2 = response.body().getArticles();
                    adapter2 = new Tv2Adapter(getActivity(), data2);
                    rvtopnews.setAdapter(adapter2);
                }
            }

            @Override
            public void onFailure(Call<ResponseTvTop> call, Throwable t) {
                Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }


}
