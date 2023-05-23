package com.sample.gof23.service.structuralpattern.proxy;

/**
 * @author 王贤
 */
public class Corporation extends AbstractOrganization{

	@Override
	public void request(){
		System.out.print("这是公司的答复。");
		System.out.println();
	}

}
