package com.sample.gof23.service.behavioralpattern.mediator;

import java.util.Map;

/**
 * @author 王贤
 */
public class ProjectA extends AbstractProject{
	
	public ProjectA(){
		projectName = "ProjectA";
	}
	
	public ProjectA(Map<String,Member> members,Map<String,Task> tasks){
		initializeMember(members);
		initializeTask(tasks);
		projectName = "ProjectA";
	}
	
	public ProjectA setMembers(Map<String,Member> members){
		initializeMember(members);
		return this;
	}
	
	public ProjectA setTasks(Map<String,Task> tasks){
		initializeTask(tasks);
		return this;
	}
	

}
