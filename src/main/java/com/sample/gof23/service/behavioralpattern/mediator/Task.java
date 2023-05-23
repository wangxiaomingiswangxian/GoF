package com.sample.gof23.service.behavioralpattern.mediator;

/**
 * @author 王贤
 */
public class Task {
	private String taskName ;
	
	public Task(){}
	
	public Task(String name){
		setTaskName(name);
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	

}
