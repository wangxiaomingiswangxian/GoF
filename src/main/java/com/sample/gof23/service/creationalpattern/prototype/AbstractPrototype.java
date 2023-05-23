package com.sample.gof23.service.creationalpattern.prototype;


/**
 * @author 王贤
 */
public abstract class AbstractPrototype {
	
	public AbstractPrototype cloneMyself() {
		return this;
	}

	public void addSomeIntroduction(String topic, String content) {}

	public void deleteSomeIntroduction(String key) {}

	public void showIntroduction() {	}

}
