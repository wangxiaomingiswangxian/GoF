package com.sample.gof23.service.creationalpattern.singleton;


/**
 * @author 王贤
 */
public class SaleMan {
	private String name;
	private String service ;
	
	public SaleMan(){
		
	}
	
	public SaleMan(String name,String service){
		this.name = name;
		this.service = service;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
	

}
