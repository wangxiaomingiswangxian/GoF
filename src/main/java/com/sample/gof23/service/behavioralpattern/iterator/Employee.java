package com.sample.gof23.service.behavioralpattern.iterator;

/**
 * @author 王贤
 */
public class Employee {
	
	private String employeeName;
	private String education ;
	
	public Employee(){
	}
	
	public Employee(String name ,String ed ){
		this.employeeName = name;
		this.education = ed;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}

}
