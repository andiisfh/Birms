package com.example.ferdy.birms.model.ocid;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Planning{

	@SerializedName("milestones")
	private List<MilestonesItem> milestones;

	@SerializedName("budget")
	private Budget budget;

	public void setMilestones(List<MilestonesItem> milestones){
		this.milestones = milestones;
	}

	public List<MilestonesItem> getMilestones(){
		return milestones;
	}

	public void setBudget(Budget budget){
		this.budget = budget;
	}

	public Budget getBudget(){
		return budget;
	}

	@Override
 	public String toString(){
		return 
			"Planning{" + 
			"milestones = '" + milestones + '\'' + 
			",budget = '" + budget + '\'' + 
			"}";
		}
}