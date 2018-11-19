package com.example.ferdy.birms.model.ocid;

import com.google.gson.annotations.SerializedName;

public class AwardsItem{

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("status")
	private String status;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
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
			"AwardsItem{" + 
			"id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}