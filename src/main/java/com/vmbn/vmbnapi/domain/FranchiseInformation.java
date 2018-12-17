package com.vmbn.vmbnapi.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FranchiseInformation {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Enumerated(EnumType.STRING)
	private FranchiseOpportunity franchiseOpportunity;

	public FranchiseOpportunity getFranchiseOpportunity() {
		return franchiseOpportunity;
	}

	public void setFranchiseOpportunity(FranchiseOpportunity franchiseOpportunity) {
		this.franchiseOpportunity = franchiseOpportunity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
