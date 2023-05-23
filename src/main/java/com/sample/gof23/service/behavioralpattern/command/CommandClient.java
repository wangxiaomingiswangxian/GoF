package com.sample.gof23.service.behavioralpattern.command;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class CommandClient   {

	private final Subordinate subordinate =new Subordinate();

	private final Manager manager = new Manager();

	private final ReportCommand command1 =new ReportCommand();

	private final PlanCommand command2 = new PlanCommand();
	

	public int run(String... args){
		

		subordinate.setName("小刘");						
		command1.setMan(subordinate);		
		
		manager.setCommand(command1);		
		manager.executeCommand();
				
		command2.setMan(subordinate);	
		manager.setCommand(command2);		
		manager.executeCommand();
		return 0;
	}


}
