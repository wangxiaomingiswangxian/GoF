package com.sample.gof23.service.structuralpattern.decorator;

/**
 * @author 王贤
 */
public class DesignCheckProcess extends AdditionalProcess{
	
	public void concreteActualProcess(){
		actualProcess.addProcess("设计检查");
	}

}
