package com.sample.gof23.service.creationalpattern.builder;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
@RequiredArgsConstructor
public class ProjectA {
	
	private final AbstractProjectProcessBuilder projectBuilder;

	public void construct(){
		projectBuilder.buildRequirement();
		projectBuilder.buildDesign();
		projectBuilder.buildProgram();
		projectBuilder.buildTest();
		projectBuilder.buildDeployment();
		projectBuilder.buildMaintenance();
	}
	
	public void showProcess(){
		projectBuilder.showProcess();
		
	}

}
