package com.sample.gof23.service.creationalpattern.abstractfactory;

/**
 * @author 王贤
 */
public class DesktopPhone extends Telephone{

	@Override
	public void doUse(){
		System.out.println("这是座机电话的功能");
	}

}
