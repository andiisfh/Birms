package com.example.ferdy.birms.model.ocid;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PartiesItem{

	@SerializedName("identifier")
	private Identifier identifier;

	@SerializedName("address")
	private Address address;

	@SerializedName("contactPoint")
	private ContactPoint contactPoint;

	@SerializedName("roles")
	private List<String> roles;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public void setIdentifier(Identifier identifier){
		this.identifier = identifier;
	}

	public Identifier getIdentifier(){
		return identifier;
	}

	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		return address;
	}

	public void setContactPoint(ContactPoint contactPoint){
		this.contactPoint = contactPoint;
	}

	public ContactPoint getContactPoint(){
		return contactPoint;
	}

	public void setRoles(List<String> roles){
		this.roles = roles;
	}

	public List<String> getRoles(){
		return roles;
	}

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
			"PartiesItem{" + 
			"identifier = '" + identifier + '\'' + 
			",address = '" + address + '\'' + 
			",contactPoint = '" + contactPoint + '\'' + 
			",roles = '" + roles + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}