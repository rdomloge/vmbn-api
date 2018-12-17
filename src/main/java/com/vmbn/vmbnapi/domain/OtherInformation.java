package com.vmbn.vmbnapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OtherInformation {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String supportAndTraining;
	
	private String financingAvailable;
	
	private String website;

	public String getSupportAndTraining() {
		return supportAndTraining;
	}

	public void setSupportAndTraining(String supportAndTraining) {
		this.supportAndTraining = supportAndTraining;
	}

	public String getFinancingAvailable() {
		return financingAvailable;
	}

	public void setFinancingAvailable(String financingAvailable) {
		this.financingAvailable = financingAvailable;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
