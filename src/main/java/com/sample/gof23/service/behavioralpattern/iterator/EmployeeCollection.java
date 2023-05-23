package com.sample.gof23.service.behavioralpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王贤
 */
public class EmployeeCollection {

	List<Employee> employeeList = new ArrayList<>();
	private int employeeMax = 0;
	
	public EmployeeCollection(){}

	public EmployeeCollection addEmployee(Employee employee) {
		employeeList.add(employee);
		employeeMax++;
		return this ;
	}

	public Employee getEmployee(int i) {
		return employeeList.get(i);
	}

	public int getEmployeeMax() {
		return employeeMax;
	}

	public void setEmployeeMax(int employeeMax) {
		this.employeeMax = employeeMax;
	}

}
