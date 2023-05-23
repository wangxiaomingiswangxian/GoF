package com.sample.gof23.service.behavioralpattern.mediator;

/**
 * @author 王贤
 */
public abstract class Mediator {
	
	public void changMember(AbstractProject project1,AbstractProject project2,Member member){
		project1.removeMember(member);
		project2.addMember(member);
	}
	
	public void changTask(AbstractProject project1,AbstractProject project2,Task task){
		project1.reduceTask(task);
		project2.addTask(task);
	}
	
	public void doCoordination(){}

}
