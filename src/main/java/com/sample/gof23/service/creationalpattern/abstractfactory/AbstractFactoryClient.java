package com.sample.gof23.service.creationalpattern.abstractfactory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
@RequiredArgsConstructor
public class AbstractFactoryClient  {

	private final CompanyA company1=new CompanyA();

	public int run() {
		Computer computer1 = company1.buildComputer("个人电脑");
		computer1.doUse();

		Computer computer2 = company1.buildComputer("笔记本电脑");
		computer2.doUse();

		Telephone telephone1 = company1.buildTelephone("座机电话");
		telephone1.doUse();

		Telephone telephone2 = company1.buildTelephone("手机");
		telephone2.doUse();
		return 0;
	}


}
