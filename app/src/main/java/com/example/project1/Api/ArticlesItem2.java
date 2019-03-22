package com.example.project1.Api;

import com.google.gson.annotations.SerializedName;

public class ArticlesItem2 {

	@SerializedName("publishedAt")
	private String publishedAt;

	@SerializedName("author")
	private String author;

	@SerializedName("urlToImage")
	private String urlToImage;

	@SerializedName("description")
	private String description;

	@SerializedName("source2")
	private Source2 source2;

	@SerializedName("title")
	private String title;

	@SerializedName("url")
	private String url;

	@SerializedName("content")
	private String content;

	public void setPublishedAt(String publishedAt){
		this.publishedAt = publishedAt;
	}

	public String getPublishedAt(){
		return publishedAt;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public String getAuthor(){
		return author;
	}

	public void setUrlToImage(String urlToImage){
		this.urlToImage = urlToImage;
	}

	public String getUrlToImage(){
		return urlToImage;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setSource2(Source2 source2){
		this.source2 = source2;
	}

	public Source2 getSource2(){
		return source2;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"ArticlesItem2{" +
			"publishedAt = '" + publishedAt + '\'' + 
			",author = '" + author + '\'' + 
			",urlToImage = '" + urlToImage + '\'' + 
			",description = '" + description + '\'' + 
			",source2 = '" + source2 + '\'' +
			",title = '" + title + '\'' + 
			",url = '" + url + '\'' + 
			",content = '" + content + '\'' + 
			"}";
		}
}