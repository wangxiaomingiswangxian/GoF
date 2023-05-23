package com.sample.gof23.service.creationalpattern.abstractfactory;

/**
 * @author 王贤
 */
public class NotebookComputer extends Computer{

	@Override
	public void doUse(){
		System.out.println("这是笔记本电脑的功能");
	}
}
