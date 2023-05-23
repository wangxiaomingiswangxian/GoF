package com.sample.gof23.service.creationalpattern.factorymethod;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
@RequiredArgsConstructor
public class FactoryMethodClient {

  	private final  CompanyA company;

    public void run() {
        // 根据传入的参数得到ProductA产品
        Product product = company.buildProduct("A");
        product.doUse();
        // 根据传入的参数得到ProductB产品
        product = company.buildProduct("B");
        product.doUse();
	}
}
