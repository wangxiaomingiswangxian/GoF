package com.sample.gof23.service.behavioralpattern.mediator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author 王贤
 */
public abstract class AbstractProject {
	
	protected String projectName ;
	protected TechnicalDirector leader;
	protected Map<String,Member> memberMap = new HashMap<String,Member>();
	protected Map<String,Task> taskMap = new HashMap<String,Task>();
	
	protected void initializeTask(Map<String,Task> map){
		taskMap = map;
	}
	
	protected void initializeMember(Map<String,Member> map){
		memberMap = map;
	}
	
	public void addMember(Member member){
		memberMap.put(member.getMemberName(), member);
	}
	public void removeMember(Member member){
		memberMap.remove(member.getMemberName());
	}
	
	public void addTask(Task task){
		taskMap.put(task.getTaskName(), task);
	}
	
	public void reduceTask(Task task){
		taskMap.remove(task.getTaskName());
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public TechnicalDirector getLeader() {
		return leader;
	}
	public void setLeader(TechnicalDirector leader) {
		this.leader = leader;
	}
	
	public void showProjectContent(){
		System.out.println("显示"+getProjectName()+"项目成员和任务情况：");
		System.out.print("项目成员:");
		String memberName;

		Iterator<String> it = memberMap.keySet().iterator();
		while (it.hasNext()){
			memberName = it.next();
			System.out.print(memberName+";");
		}
		System.out.println();
		
		String taskName;
		System.out.print("项目任务:");
		it = taskMap.keySet().iterator();
		while (it.hasNext()){
			taskName = it.next();
			System.out.print(taskName+";");
		}
		System.out.println();
		
	}

}
