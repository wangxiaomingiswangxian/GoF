package com.sample.gof23.service.structuralpattern.bridge;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class DevelopmentDep extends AbstractDepartment{
	@Override
	public void action(String title){
		String departName = "开发部";
		departAction.doAction(departName,title);
	}	

}
