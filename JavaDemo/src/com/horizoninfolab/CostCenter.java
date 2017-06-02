package com.horizoninfolab;

import java.util.Date;


public class CostCenter {

	private Integer id;
	
	private Integer ccNumber;
	
	private String name;
	
	private String description;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(Integer ccNumber) {
		this.ccNumber = ccNumber;
	}
	
	
}
