package com.sample.gof23.service.creationalpattern.singleton;


import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class SingletonClient {

	public int run() {

		ServiceManager service = new ServiceManager();

		System.out.print("第一次获得服务：");
		SaleMan saleman = service.getSaleManService();
		System.out.println(saleman.getService());

		System.out.print("第二次获得服务：");
		saleman = service.getSaleManService();
		System.out.println(saleman.getService());

		System.out.print("第三次获得服务：");
		saleman = service.getSaleManService();
		System.out.println(saleman.getService());

		return 0;
	}

}
