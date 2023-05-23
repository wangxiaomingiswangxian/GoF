package com.sample.gof23.service.behavioralpattern.command;

/**
 * @author 王贤
 */
public class ReportCommand extends Command{

	@Override
	public void execute(){
		System.out.println("——————编写报告——————");
		man.executeCommand("编写报告");
	}

}
