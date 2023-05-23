package com.sample.gof23.service.behavioralpattern.iterator;

/**
 * @author 王贤
 */
public class ImplementIterator extends Iterator {

	private EmployeeCollection employeeCollection;
	private int currentIndex;
	
	public ImplementIterator (){}
	
	public ImplementIterator (EmployeeCollection collection){
		initializeIterator(collection);
	}	

	private void initializeIterator(EmployeeCollection collection) {
		employeeCollection = collection;
		currentIndex = collection.getEmployeeMax() - 1;
	}
	
	public void setEmployeeCollection(EmployeeCollection collection) {
		employeeCollection = collection;
		currentIndex = collection.getEmployeeMax() - 1;
	}

	@Override
	public Employee next() {
		if (currentIndex == -1) {
			return null;
		}
		return employeeCollection.getEmployee(currentIndex--);
	}

}
