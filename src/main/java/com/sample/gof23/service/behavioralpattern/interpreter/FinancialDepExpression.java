package com.sample.gof23.service.behavioralpattern.interpreter;

/**
 * @author 王贤
 */
public class FinancialDepExpression extends AbstractExpression{
	@Override
	public void interpret(Project project){
		System.out.println("财务部对"+project.getProjectName()+"的理解。");		
	}
	
}
