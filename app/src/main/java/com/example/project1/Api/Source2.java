package com.example.project1.Api;

import com.google.gson.annotations.SerializedName;

public class Source2 {

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Source2{" +
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}