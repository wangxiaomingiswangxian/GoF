package com.sample.gof23.service.structuralpattern.adapter;

/**
 * @author 王贤
 */
public class Analyst extends Customer {
	
	private String analystName ;
	private Designer designer = null;
	private String request ;

	public Analyst( String name){
		analystName = name ;
	}
	
	public String getName() {
		return analystName;
	}
	public void setName(String name) {
		this.analystName = name;
	}
	public Designer getDesigner() {
		return designer;
	}
	public void setDesigner(Designer designer) {
		this.designer = designer;
	}
	
	public void setRequest(String content){
		request = content;
	}
	
	public String getFinishWorks(){
		String designs = requestToDesign();
		designer.setDesigns(designs);
		return designer.getFinishWork();
	}
	
	public String requestToDesign(){
		System.out.println("————分析员按照用户需求转化为需求分析和设计————");
		return  getName()+"按照"+request +"，形成需求设计内容。";
	}
	

}
