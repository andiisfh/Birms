package com.example.ferdy.birms.model.ocid;

import com.google.gson.annotations.SerializedName;

public class MilestonesItem{

	@SerializedName("dueDate")
	private String dueDate;

	@SerializedName("dateMet")
	private String dateMet;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private String id;

	@SerializedName("title")
	private String title;

	@SerializedName("status")
	private String status;

	public void setDueDate(String dueDate){
		this.dueDate = dueDate;
	}

	public String getDueDate(){
		return dueDate;
	}

	public void setDateMet(String dateMet){
		this.dateMet = dateMet;
	}

	public String getDateMet(){
		return dateMet;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
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
			"MilestonesItem{" + 
			"dueDate = '" + dueDate + '\'' + 
			",dateMet = '" + dateMet + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}