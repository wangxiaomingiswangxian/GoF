package com.sample.gof23.service.behavioralpattern.template;

/**
 * @author 王贤
 */
public class ProjectA extends ProjectProcessTemplate implements ProjectProcess{

	@Override
	public void doActualWork(){		
		feasibilityProcess("定制可行性研究");		
		technicalDiscussionProcess("定制技术交流");		
		bidProcess("定制投标");		
		requirementProcess("定制需求");
		designProcess("定制设计");
		programProcess("定制编码");		
		testProcess("定制测试");		
		deploymentProcess("定制部署");		
		maintenanceProcess("定制维护");			
	}
}
