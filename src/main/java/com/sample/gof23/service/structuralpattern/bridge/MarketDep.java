package com.sample.gof23.service.structuralpattern.bridge;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class MarketDep extends AbstractDepartment {

	@Override
	public void action(String title){
		String departName = "市场部";
		departAction.doAction(departName,title);
	}

}
