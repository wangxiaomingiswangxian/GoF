package com.sample.gof23.service.structuralpattern.decorator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
@RequiredArgsConstructor
public class DecoratorClient {


	private final StandardProcess projectProcess =new StandardProcess();

	private final RequestVerificationProcess projectAddProcess1 = new RequestVerificationProcess();

	private final DesignCheckProcess  projectAddProcess2 = new DesignCheckProcess();

	public int run(String... args){

		System.out.println("——————项目的标准过程———————");
		projectProcess.showAllProcess();
		System.out.println();
		
		//附加需求验证过程
		projectAddProcess1.setActualProcess(projectProcess);
		projectAddProcess1.concreteActualProcess();
		
		System.out.println("——————增加需求验证过程后的项目过程———————");
		projectProcess.showAllProcess();
		System.out.println();
		
		//附加设计检查过程
		projectAddProcess2.setActualProcess(projectProcess);
		projectAddProcess2.concreteActualProcess();
		
		System.out.println("——————再增加设计检查过程后的项目过程———————");
		projectProcess.showAllProcess();			

		return 0;
	}

	

}
