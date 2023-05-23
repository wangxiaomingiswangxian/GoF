package com.sample.gof23.service.behavioralpattern.command;

/**
 * @author 王贤
 */
public abstract class Command {
	protected Subordinate man;
	
	public void setMan(Subordinate man) {
		this.man = man;
	}
	
	public void execute(){}

}
