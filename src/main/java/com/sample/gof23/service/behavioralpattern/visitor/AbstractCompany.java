package com.sample.gof23.service.behavioralpattern.visitor;

/**
 * @author 王贤
 */
public abstract class AbstractCompany {
	protected Visitor vistor;
	public void accept(Visitor vistor){
		this.vistor = vistor ;
	}
	
	public void doVisit(){}

}
