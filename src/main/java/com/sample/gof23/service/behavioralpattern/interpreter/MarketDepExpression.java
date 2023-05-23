package com.sample.gof23.service.behavioralpattern.interpreter;

/**
 * @author 王贤
 */
public class MarketDepExpression extends AbstractExpression{
	@Override
	public void interpret(Project project){
		System.out.println("市场部对"+project.getProjectName()+"的理解。");
	}

}
