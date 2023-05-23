package com.sample.gof23.service.creationalpattern.factorymethod;

/**
 * @author 王贤
 */
public interface Company {
	/**
	 * 构建产品
	 *
	 * @param parameter 产品参数
	 * @return 目标产品
	 */
	 Product buildProduct(String parameter);
	

}
