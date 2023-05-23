package com.sample.gof23.service.behavioralpattern.mediator;

import java.util.Map;

/**
 * @author 王贤
 */
public class ProjectB extends AbstractProject {

	public ProjectB(){
		projectName = "ProjectB";
	}
	
	public ProjectB(Map<String, Member> members, Map<String, Task> tasks) {
		initializeMember(members);
		initializeTask(tasks);
		projectName = "ProjectB";
	}
	
	public ProjectB setMembers(Map<String,Member> members){
		initializeMember(members);
		return this;
	}
	
	public ProjectB setTasks(Map<String,Task> tasks){
		initializeTask(tasks);
		return this;
	}
	
	
}
