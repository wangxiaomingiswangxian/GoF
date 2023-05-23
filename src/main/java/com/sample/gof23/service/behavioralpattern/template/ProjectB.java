package com.sample.gof23.service.behavioralpattern.template;

/**
 * @author 王贤
 */
public class ProjectB extends ProjectProcessTemplate implements ProjectProcess{

	@Override
	public void doActualWork(){	
		
		requirementProcess("定制需求");
		designProcess("定制设计");
		programProcess("定制编码");		
		testProcess("定制测试");		
		deploymentProcess("定制部署");		
		maintenanceProcess("定制维护");			
	}
}
