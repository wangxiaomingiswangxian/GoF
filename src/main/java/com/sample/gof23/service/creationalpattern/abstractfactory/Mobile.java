package com.sample.gof23.service.creationalpattern.abstractfactory;

/**
 * @author 王贤
 */
public class Mobile extends Telephone {
	@Override
	public void doUse(){
		System.out.println("这是手机的功能");
	}
}
