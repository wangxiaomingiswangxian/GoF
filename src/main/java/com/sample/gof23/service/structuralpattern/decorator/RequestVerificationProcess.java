package com.sample.gof23.service.structuralpattern.decorator;

/**
 * @author 王贤
 */
public class RequestVerificationProcess extends AdditionalProcess{
	public void concreteActualProcess(){
		actualProcess.addProcess("需求验证");
	}
}
