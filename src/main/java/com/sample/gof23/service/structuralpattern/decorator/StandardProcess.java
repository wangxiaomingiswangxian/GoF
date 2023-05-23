package com.sample.gof23.service.structuralpattern.decorator;


/**
 * @author 王贤
 */
public class StandardProcess extends AbstractProcess{
	
	public StandardProcess(){
		initializeProcess();
	}
	private void initializeProcess(){
		addProcess("需求分析过程");
		addProcess("设计过程");
		addProcess("编码过程");
		addProcess("测试过程");
		addProcess("部署过程");
		addProcess("维护过程");			
	}
}
