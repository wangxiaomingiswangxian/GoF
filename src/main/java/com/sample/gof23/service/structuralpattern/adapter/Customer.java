package com.sample.gof23.service.structuralpattern.adapter;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class Customer {

	private String customerName;
	private String requirement = null;

	
	public void setRequirement(String require) {
		requirement = require;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getRequirement() {
		return requirement;
	}

	public String commitRequirement() {
		System.out.println("————用户提交需求————");
		return requirement;
	}

}
