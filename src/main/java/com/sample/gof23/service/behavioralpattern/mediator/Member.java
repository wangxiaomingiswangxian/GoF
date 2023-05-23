package com.sample.gof23.service.behavioralpattern.mediator;

/**
 * @author 王贤
 */
public class Member {
	private String memberName ;
	
	public Member(){}
	
	public Member(String name){
		setMemberName(name);
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

}
