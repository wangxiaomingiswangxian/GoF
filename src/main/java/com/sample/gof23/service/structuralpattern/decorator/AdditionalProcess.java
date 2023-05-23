package com.sample.gof23.service.structuralpattern.decorator;

/**
 * @author 王贤
 */
public class AdditionalProcess extends AbstractProcess{
	
	protected AbstractProcess actualProcess;	

	public void setActualProcess(AbstractProcess actualProcess) {
		this.actualProcess = actualProcess;
	}
	

}
