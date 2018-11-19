package com.example.ferdy.birms.model.ocid;

import com.google.gson.annotations.SerializedName;

public class Amount{

	@SerializedName("amount")
	private long amount;

	@SerializedName("currency")
	private String currency;

	public void setAmount(long amount){
		this.amount = amount;
	}

	public long getAmount(){
		return amount;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	@Override
 	public String toString(){
		return 
			"Amount{" + 
			"amount = '" + amount + '\'' + 
			",currency = '" + currency + '\'' + 
			"}";
		}
}