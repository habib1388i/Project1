package com.example.project1.EndPoint;

import com.example.project1.Api.ResponseNews;
import com.example.project1.Api.ResponseTv;
import com.example.project1.Api.ResponseTvTop;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HotNewsService {
    @GET("everything?sources=mtv-news&apiKey=224d864c24404ed287ad4b9533d1e0b6")
    Call<ResponseTv> getDataTv();

    @GET("top-headlines?sources=mtv-news&apiKey=224d864c24404ed287ad4b9533d1e0b6")
    Call<ResponseTvTop> getDataTvTop();

    @GET("everything?sources=cbs-news&apiKey=224d864c24404ed287ad4b9533d1e0b6")
    Call<ResponseNews> getDataNews();
}
