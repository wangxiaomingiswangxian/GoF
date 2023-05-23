package com.sample.gof23.service.creationalpattern.factorymethod;

/**
 * @author 王贤
 */
public class ProductA implements Product{
	
	public String productType = "ProductA";

	@Override
	public String getProductType(){		
		return productType;
	}
	
	public String getParameter(){
		return "A";
	}

	@Override
	public void doUse(){
		System.out.println("这是ProductA实现的功能");
	}

}
