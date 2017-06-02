package com.horizoninfolab;

public class CostCenterImplementation {

	public static void main(String[] args) {	
	
	CostCenter CC1 = new CostCenter();
	CC1.setCcNumber(1);
	CC1.setDescription("Cost Center For QA Operations");
	CC1.setName("QA Cost Center");
	System.out.println(CC1.getName() +","+CC1.getDescription()+","+CC1.getDescription());
	
	
	
	}
}
