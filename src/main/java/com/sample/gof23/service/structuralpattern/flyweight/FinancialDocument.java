package com.sample.gof23.service.structuralpattern.flyweight;

/**
 * @author 王贤
 */
public class FinancialDocument extends Document{

	@Override
	public void readDocument(){
		System.out.println("请阅读财务文档。");
	}

}
