package com.sample.gof23.service.structuralpattern.composite;

/**
 * @author 王贤
 */
public class AbstractOrganization {
	
	protected String organizationName;
	protected String organizationType;

	
	public void add(AbstractOrganization organization){};
	public void remove(AbstractOrganization organization){};
	public void showOrganizationStructure(String parentName){}
	
	public AbstractOrganization(){}
	
	public AbstractOrganization(String name){organizationName = name;}	
	
	public void addName (String name)
	{
		this.organizationName = name;
	}
	
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}


}
