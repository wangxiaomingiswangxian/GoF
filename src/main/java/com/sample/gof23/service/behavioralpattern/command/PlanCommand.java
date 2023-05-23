package com.sample.gof23.service.behavioralpattern.command;

/**
 * @author 王贤
 */
public class PlanCommand extends Command{

	@Override
	public void execute(){
		System.out.println("——————编写计划——————");
		man.executeCommand("编写计划");
	}

}
