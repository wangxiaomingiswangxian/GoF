package com.sample.gof23.service.structuralpattern.composite;

/**
 * @author 王贤
 */
public class WorkTeam extends AbstractOrganization{
	
	public WorkTeam (String name){		
		super(name);
		organizationType = "WorkTeam";
	}
	
	public WorkTeam (){		
		organizationType = "WorkTeam";
	}

	@Override
	public void add(AbstractOrganization c){
		System.out.println("这是叶子节点，下面没有内容");
	}

	@Override
	public void showOrganizationStructure(String parentName){
		String organizationName = this.getOrganizationName();
		System.out.println(parentName+ organizationName);		
	}

}
