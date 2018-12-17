package com.vmbn.vmbnapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BusinessOperation {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String employeesDescription;
	
	private String yearsEstablished;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmployeesDescription() {
		return employeesDescription;
	}

	public void setEmployeesDescription(String employeesDescription) {
		this.employeesDescription = employeesDescription;
	}

	public String getYearsEstablished() {
		return yearsEstablished;
	}

	public void setYearsEstablished(String yearsEstablished) {
		this.yearsEstablished = yearsEstablished;
	}
}
