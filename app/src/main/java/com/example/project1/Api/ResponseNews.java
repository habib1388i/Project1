package com.example.project1.Api;

import java.util.List;

import com.example.project1.Api.ArticlesItem3;
import com.google.gson.annotations.SerializedName;


public class ResponseNews{

	@SerializedName("totalResults")
	private int totalResults;

	@SerializedName("articles")
	private List<ArticlesItem3> articles;

	@SerializedName("status")
	private String status;

	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}

	public int getTotalResults(){
		return totalResults;
	}

	public void setArticles(List<ArticlesItem3> articles){
		this.articles = articles;
	}

	public List<ArticlesItem3> getArticles(){
		return articles;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponseNews{" + 
			"totalResults = '" + totalResults + '\'' + 
			",articles = '" + articles + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}