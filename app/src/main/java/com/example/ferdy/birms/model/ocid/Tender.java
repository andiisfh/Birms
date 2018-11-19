package com.example.ferdy.birms.model.ocid;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tender{

	@SerializedName("numberOfTenderers")
	private int numberOfTenderers;

	@SerializedName("procuringEntity")
	private ProcuringEntity procuringEntity;

	@SerializedName("procurementMethod")
	private String procurementMethod;

	@SerializedName("id")
	private int id;

	@SerializedName("mainProcurementCategory")
	private String mainProcurementCategory;

	@SerializedName("milestones")
	private List<Object> milestones;

	@SerializedName("title")
	private String title;

	@SerializedName("tenderPeriod")
	private TenderPeriod tenderPeriod;

	@SerializedName("tenderers")
	private List<TenderersItem> tenderers;

	@SerializedName("value")
	private Value value;

	@SerializedName("contractPeriod")
	private ContractPeriod contractPeriod;

	@SerializedName("status")
	private String status;

	public void setNumberOfTenderers(int numberOfTenderers){
		this.numberOfTenderers = numberOfTenderers;
	}

	public int getNumberOfTenderers(){
		return numberOfTenderers;
	}

	public void setProcuringEntity(ProcuringEntity procuringEntity){
		this.procuringEntity = procuringEntity;
	}

	public ProcuringEntity getProcuringEntity(){
		return procuringEntity;
	}

	public void setProcurementMethod(String procurementMethod){
		this.procurementMethod = procurementMethod;
	}

	public String getProcurementMethod(){
		return procurementMethod;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setMainProcurementCategory(String mainProcurementCategory){
		this.mainProcurementCategory = mainProcurementCategory;
	}

	public String getMainProcurementCategory(){
		return mainProcurementCategory;
	}

	public void setMilestones(List<Object> milestones){
		this.milestones = milestones;
	}

	public List<Object> getMilestones(){
		return milestones;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setTenderPeriod(TenderPeriod tenderPeriod){
		this.tenderPeriod = tenderPeriod;
	}

	public TenderPeriod getTenderPeriod(){
		return tenderPeriod;
	}

	public void setTenderers(List<TenderersItem> tenderers){
		this.tenderers = tenderers;
	}

	public List<TenderersItem> getTenderers(){
		return tenderers;
	}

	public void setValue(Value value){
		this.value = value;
	}

	public Value getValue(){
		return value;
	}

	public void setContractPeriod(ContractPeriod contractPeriod){
		this.contractPeriod = contractPeriod;
	}

	public ContractPeriod getContractPeriod(){
		return contractPeriod;
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
			"Tender{" + 
			"numberOfTenderers = '" + numberOfTenderers + '\'' + 
			",procuringEntity = '" + procuringEntity + '\'' + 
			",procurementMethod = '" + procurementMethod + '\'' + 
			",id = '" + id + '\'' + 
			",mainProcurementCategory = '" + mainProcurementCategory + '\'' + 
			",milestones = '" + milestones + '\'' + 
			",title = '" + title + '\'' + 
			",tenderPeriod = '" + tenderPeriod + '\'' + 
			",tenderers = '" + tenderers + '\'' + 
			",value = '" + value + '\'' + 
			",contractPeriod = '" + contractPeriod + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}