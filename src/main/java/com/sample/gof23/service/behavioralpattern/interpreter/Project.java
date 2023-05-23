package com.sample.gof23.service.behavioralpattern.interpreter;

/**
 * @author 王贤
 */
public class Project {
	
	private String projectName;
	
	public Project (){		
	}
	
	public Project (String name){
		projectName =  name;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	

}
