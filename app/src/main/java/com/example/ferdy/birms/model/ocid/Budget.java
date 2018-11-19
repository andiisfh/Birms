package com.example.ferdy.birms.model.ocid;

import com.google.gson.annotations.SerializedName;

public class Budget{

	@SerializedName("amount")
	private Amount amount;

	@SerializedName("description")
	private String description;

	@SerializedName("project")
	private String project;

	@SerializedName("id")
	private Object id;

	public void setAmount(Amount amount){
		this.amount = amount;
	}

	public Amount getAmount(){
		return amount;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setProject(String project){
		this.project = project;
	}

	public String getProject(){
		return project;
	}

	public void setId(Object id){
		this.id = id;
	}

	public Object getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Budget{" + 
			"amount = '" + amount + '\'' + 
			",description = '" + description + '\'' + 
			",project = '" + project + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}