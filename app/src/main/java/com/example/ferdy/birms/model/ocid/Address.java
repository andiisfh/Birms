package com.example.ferdy.birms.model.ocid;

import com.google.gson.annotations.SerializedName;

public class Address{

	@SerializedName("streetAddress")
	private String streetAddress;

	public void setStreetAddress(String streetAddress){
		this.streetAddress = streetAddress;
	}

	public String getStreetAddress(){
		return streetAddress;
	}

	@Override
 	public String toString(){
		return 
			"Address{" + 
			"streetAddress = '" + streetAddress + '\'' + 
			"}";
		}
}