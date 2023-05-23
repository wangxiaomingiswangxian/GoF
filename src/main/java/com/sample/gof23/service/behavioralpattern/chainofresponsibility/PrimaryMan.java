package com.sample.gof23.service.behavioralpattern.chainofresponsibility;


/**
 * @author 王贤
 */
public class PrimaryMan {
	
	private String thisAnswer ;
	
	public boolean question(String answer){
		return thisAnswer.equals(answer);
	}

	public String getThisAnswer() {
		return thisAnswer;
	}

	public void setThisAnswer(String thisAnswer) {
		this.thisAnswer = thisAnswer;
	}

}
