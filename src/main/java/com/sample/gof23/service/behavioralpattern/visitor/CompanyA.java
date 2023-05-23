package com.sample.gof23.service.behavioralpattern.visitor;

/**
 * @author 王贤
 */
public class CompanyA extends AbstractCompany{

	public void visitA(){}

	@Override
	public void doVisit(){
		vistor.visitCompanyA(this);
	}
	
}
