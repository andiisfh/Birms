package com.example.ferdy.birms.model.ocid;

import com.google.gson.annotations.SerializedName;

public class TenderPeriod{

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("startDate")
	private String startDate;

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	@Override
 	public String toString(){
		return 
			"TenderPeriod{" + 
			"endDate = '" + endDate + '\'' + 
			",startDate = '" + startDate + '\'' + 
			"}";
		}
}