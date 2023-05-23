package com.sample.gof23.service.behavioralpattern.visitor;

/**
 * @author 王贤
 */
public class AccountingFirm extends Visitor{

	@Override
	public void visitCompanyA(CompanyA company){
		System.out.println("对CompanyA类公司进行会计审计工作");
	}

	@Override
	public void visitCompanyB(CompanyB company){
		 System.out.println("对CompanyB类公司进行会计审计工作");
	}

}
