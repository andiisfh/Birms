package com.example.ferdy.birms.model.ocid;

import com.google.gson.annotations.SerializedName;

public class Identifier{

	@SerializedName("legalName")
	private String legalName;

	@SerializedName("id")
	private String id;

	public void setLegalName(String legalName){
		this.legalName = legalName;
	}

	public String getLegalName(){
		return legalName;
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
			"Identifier{" + 
			"legalName = '" + legalName + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}