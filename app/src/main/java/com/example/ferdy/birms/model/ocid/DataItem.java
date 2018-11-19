package com.example.ferdy.birms.model.ocid;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataItem{

	@SerializedName("date")
	private String date;

	@SerializedName("initiationType")
	private String initiationType;

	@SerializedName("tender")
	private Tender tender;

	@SerializedName("planning")
	private Planning planning;

	@SerializedName("awards")
	private List<Object> awards;

	@SerializedName("parties")
	private List<PartiesItem> parties;

	@SerializedName("_id")
	private String ids;

	@SerializedName("id")
	private String id;

	@SerializedName("tag")
	private List<String> tag;

	@SerializedName("ocid")
	private String ocid;

	@SerializedName("buyer")
	private Buyer buyer;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setInitiationType(String initiationType){
		this.initiationType = initiationType;
	}

	public String getInitiationType(){
		return initiationType;
	}

	public void setTender(Tender tender){
		this.tender = tender;
	}

	public Tender getTender(){
		return tender;
	}

	public void setPlanning(Planning planning){
		this.planning = planning;
	}

	public Planning getPlanning(){
		return planning;
	}

	public void setAwards(List<Object> awards){
		this.awards = awards;
	}

	public List<Object> getAwards(){
		return awards;
	}

	public void setParties(List<PartiesItem> parties){
		this.parties = parties;
	}

	public List<PartiesItem> getParties(){
		return parties;
	}

	public void setIds(String ids){
		this.ids = ids;
	}

	public String getIds(){
		return ids;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTag(List<String> tag){
		this.tag = tag;
	}

	public List<String> getTag(){
		return tag;
	}

	public void setOcid(String ocid){
		this.ocid = ocid;
	}

	public String getOcid(){
		return ocid;
	}

	public void setBuyer(Buyer buyer){
		this.buyer = buyer;
	}

	public Buyer getBuyer(){
		return buyer;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"date = '" + date + '\'' + 
			",initiationType = '" + initiationType + '\'' + 
			",tender = '" + tender + '\'' + 
			",planning = '" + planning + '\'' +
			",awards = '" + awards + '\'' + 
			",parties = '" + parties + '\'' + 
			",_id = '" + ids + '\'' +
			",id = '" + id + '\'' + 
			",tag = '" + tag + '\'' + 
			",ocid = '" + ocid + '\'' + 
			",buyer = '" + buyer + '\'' + 
			"}";
		}
}