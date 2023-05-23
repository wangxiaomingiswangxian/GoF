package com.sample.gof23.service.behavioralpattern.command;

/**
 * @author 王贤
 */
public class Subordinate {
	
	private String name ;
	
	public Subordinate(){		
	}
	
	public Subordinate(String subordinateName){
		name = subordinateName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void executeCommand(String task){
		System.out.println(name+"处理"+task+"内容");
	}
	

}
