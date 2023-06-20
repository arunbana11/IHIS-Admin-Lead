package com.it.entity;

import jakarta.persistence.Entity;

@Entity
public class AdminPlansEntity {

	private Integer planId;
	private String planName;
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public AdminPlansEntity(Integer planId, String planName) {
		super();
		this.planId = planId;
		this.planName = planName;
	}
	
	
	
	
}
