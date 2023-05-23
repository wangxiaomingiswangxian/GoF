package com.sample.gof23.service.behavioralpattern.strategy;

/**
 * @author 王贤
 */
public class TelecomStrategy extends Strategy{
	@Override
	public void doWork(Project project){		
		System.out.println(project.getProjectName()+"采用电信策略的工作");		
	}
}
