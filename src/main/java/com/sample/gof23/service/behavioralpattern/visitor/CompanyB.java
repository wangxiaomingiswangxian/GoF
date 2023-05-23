package com.sample.gof23.service.behavioralpattern.visitor;

/**
 * @author 王贤
 */
public class CompanyB extends AbstractCompany{

	@Override
	public void doVisit(){
		vistor.visitCompanyB(this);
	}
}
