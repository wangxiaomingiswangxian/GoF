package com.sample.gof23.service.structuralpattern.proxy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
@RequiredArgsConstructor
public class ProxyClient {

	private final Agency agency ;

	public int run(String... args) {
		agency.request();
		return 0;
	}


}
