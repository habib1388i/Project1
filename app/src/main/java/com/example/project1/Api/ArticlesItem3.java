package com.example.project1.Api;


import com.google.gson.annotations.SerializedName;


public class ArticlesItem3 {

	@SerializedName("publishedAt")
	private String publishedAt;

	@SerializedName("author")
	private String author;

	@SerializedName("urlToImage")
	private String urlToImage;

	@SerializedName("description")
	private String description;

	@SerializedName("source3")
	private Source3 source3;

	@SerializedName("title")
	private String title;

	@SerializedName("url")
	private String url;

	@SerializedName("content")
	private Object content;

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

	public void setSource3(Source3 source3){
		this.source3 = source3;
	}

	public Source3 getSource3(){
		return source3;
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

	public void setContent(Object content){
		this.content = content;
	}

	public Object getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"ArticlesItem3{" +
			"publishedAt = '" + publishedAt + '\'' + 
			",author = '" + author + '\'' + 
			",urlToImage = '" + urlToImage + '\'' + 
			",description = '" + description + '\'' + 
			",source3 = '" + source3 + '\'' +
			",title = '" + title + '\'' + 
			",url = '" + url + '\'' + 
			",content = '" + content + '\'' + 
			"}";
		}
}