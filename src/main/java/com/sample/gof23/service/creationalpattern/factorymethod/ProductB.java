package com.sample.gof23.service.creationalpattern.factorymethod;

/**
 * @author 王贤
 */
public class ProductB implements Product{
	
	public String productType = "ProductB";

	@Override
	public String getProductType(){		
		return productType;
	}
	
	public String getParameter(){
		return "B";
	}
	@Override
	public void doUse(){
		System.out.println("这是ProductB实现的功能");
	}

}
