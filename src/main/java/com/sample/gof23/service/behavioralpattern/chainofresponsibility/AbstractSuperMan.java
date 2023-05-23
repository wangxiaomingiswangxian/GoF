package com.sample.gof23.service.behavioralpattern.chainofresponsibility;

/**
 * @author 王贤
 */
public abstract class AbstractSuperMan {
	
	protected String answer;
	protected AbstractSuperMan successorSuperMan;
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public AbstractSuperMan getSuccessorSuperMan() {
		return successorSuperMan;
	}

	public void setSuccessorSuperMan(AbstractSuperMan successorSuperMan) {
		this.successorSuperMan = successorSuperMan;
	}
	
	public void answerTheQuestion(PrimaryMan man){}

	
	

}
