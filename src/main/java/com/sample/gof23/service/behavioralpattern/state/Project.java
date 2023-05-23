package com.sample.gof23.service.behavioralpattern.state;

/**
 * @author 王贤
 */
public class Project {	
	
	private String projectName ;	
	private State currentState;
	
	public Project() {		
	}
	
	public Project(String projectName) {
		super();
		this.projectName = projectName;
	}
	
	public String getProjectName() {
		return projectName;
	}	

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public void setCurrentState(State state){
		currentState = state;
	}
	
	public void doCurrentWork(){
		currentState.doWork(this);
	}

	

}
