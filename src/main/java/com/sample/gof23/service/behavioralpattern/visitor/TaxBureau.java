package com.sample.gof23.service.behavioralpattern.visitor;

/**
 * @author 王贤
 */
public class TaxBureau extends Visitor {
	@Override
	public void visitCompanyA(CompanyA company) {
		System.out.println("对CompanyA类公司进行税务审计工作");
	}

	@Override
	public void visitCompanyB(CompanyB company) {
		System.out.println("对CompanyB类公司进行税务审计工作");
	}

}
