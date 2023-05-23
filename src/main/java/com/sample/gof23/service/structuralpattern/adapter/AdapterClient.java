package com.sample.gof23.service.structuralpattern.adapter;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
@RequiredArgsConstructor
public class AdapterClient  {

	private final Customer customer;
	private final Designer designer ;

    public int run(String... args)  {

		customer.setCustomerName("客户小王");
		customer.setRequirement("客户小王的需求");

		designer.setName("开发员小张");
		
		Analyst analyst = new Analyst("分析员小刘");	
		
		//客户把用户需求提交给分析员
		analyst.setRequest(customer.commitRequirement());
		//分析员经过转化后提供给开发人员
		analyst.setDesigner(designer);
		//得到满足客户的需求的工作产品
		System.out.println(analyst.getFinishWorks());
		
		return 0;

	}


}
