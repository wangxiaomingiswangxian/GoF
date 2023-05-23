package com.sample.gof23.service.behavioralpattern.visitor;

import org.springframework.stereotype.Component;

/**
 * @author 王贤 
 */
@Component
public class VisitorClient   {

	private final CompanyA company1=new CompanyA();

	private final CompanyB company2=new CompanyB();

	private final AccountingFirm accountingFirm=new AccountingFirm();

	private final TaxBureau taxBureau=new TaxBureau();

	private final TradeBureau tradeBureau =new TradeBureau();

	public int run(String... args){

				
		System.out.println("————对CompanyA类公司进行处理————");
		company1.accept(accountingFirm);		
		company1.doVisit();
		
		company1.accept(taxBureau);	
		company1.doVisit();	
		
		company1.accept(tradeBureau);		
		company1.doVisit();	
		
		System.out.println("————对CompanyB类公司进行处理————");
		company2.accept(accountingFirm);		
		company2.doVisit();
		
		company2.accept(taxBureau);		
		company2.doVisit();	
		
		company2.accept(tradeBureau);		
		company2.doVisit();	
		
		return 0;
	}
	


}
