package com.example.ferdy.birms.model.ocid;

import com.google.gson.annotations.SerializedName;

public class ContactPoint{

	@SerializedName("telephone")
	private String telephone;

	@SerializedName("email")
	private String email;

	public void setTelephone(String telephone){
		this.telephone = telephone;
	}

	public String getTelephone(){
		return telephone;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"ContactPoint{" + 
			"telephone = '" + telephone + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}