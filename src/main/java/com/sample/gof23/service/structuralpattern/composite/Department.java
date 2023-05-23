package com.sample.gof23.service.structuralpattern.composite;


import java.util.ArrayList;
import java.util.List;

/**
 * @author 王贤
 */
public class Department extends AbstractOrganization{
	private final List<AbstractOrganization> componentList = new ArrayList<>();
		
	public Department (String name){		
		super(name);
		organizationType = "Department";
	}
	
	public Department (){		
		organizationType = "Department";
	}
	
	@Override
	public void add(AbstractOrganization organization){
		componentList.add(organization);
	}
	@Override
	public void showOrganizationStructure(String parentName){
		String organizationName = this.getOrganizationName();
		System.out.println(parentName + organizationName);
		for (AbstractOrganization organization : componentList) {
			organization.showOrganizationStructure(parentName + organizationName + "——");
		}		
	}
}
